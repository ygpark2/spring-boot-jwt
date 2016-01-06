package com.ain.syl;

import com.ain.syl.domain.csos.B2gHist;
import com.ain.syl.repository.csos.*;
import com.ain.syl.domain.csos.CpCtrl;
import com.ain.syl.domain.csos.EquipInfo;
import com.ain.syl.domain.csos.ProtocolInfo;
import com.kdn.ecsi.console.domain.oxm.EvcomRequestHead;
import com.kdn.ecsi.console.domain.oxm.EvcomResponseHead;
import com.kdn.ecsi.console.domain.oxm.fields.PG;
import com.kdn.ecsi.console.domain.oxm.request.EvcomReqPos14;
import com.kdn.ecsi.console.domain.oxm.request.body.POS14;
import com.kdn.ecsi.console.domain.oxm.response.EvcomResGet01;
import com.kdn.ecsi.console.domain.oxm.response.EvcomResGet03;
import com.kdn.ecsi.console.domain.oxm.response.body.GET01;
import com.kdn.ecsi.console.domain.oxm.response.body.GET03;
import com.mysema.query.support.Expressions;
import com.mysema.query.types.*;
import lombok.extern.log4j.Log4j2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Log4j2
public class ApplicationTests {

    @Inject
    B2gHistRepository b2gHistRepository;

    @Inject
    NetStatRepository netStatRepository;

    @Inject
    CpCtrlRepository cpCtrlRepository;

    @Inject
    ProtocolInfoRepository protocolInfoRepository;

    @Inject
    ComCdRepository comCdRepository;

    @Inject
    EquipInfoRepository equipInfoRepository;

    @Inject
    private ApplicationContext context;

    @Before
    public void setUp() {
        // this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();

        /*

         */
    }

    @Test
    public void JaxbPos14Test() {

        Jaxb2Marshaller jaxb2Marshaller = (Jaxb2Marshaller) context.getBean("getJaxb2Marshaller");

        EvcomRequestHead erh = new EvcomRequestHead(32423423, 234, "cid string", 234, 2989);

        StringReader reader = new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<evcom>\n" +
                "<hd>\n" +
                " <stm v=\"20151126105322\"/>\n" +
                " <sid v=\"2\"/>\n" +
                " <cid v=\"01\"/>\n" +
                " <sts v=\"111111\"/>\n" +
                " <tid v=\"2323\"/>\n" +
                "</hd>\n" +
                "<bd>\n" +
                "  <pg>\n" +
                "    <pg_knd v=\"완속 1\"/>\n" +
                "    <ver v=\"fw ver 1.2\"/>\n" +
                "  </pg>\n" +
                "  <pg>\n" +
                "    <pg_knd v=\"급속 2\"/>\n" +
                "    <ver v=\"fw ver 0.8\"/>\n" +
                "  </pg>\n" +
                "  <pg>\n" +
                "    <pg_knd v=\"완속 2\"/>\n" +
                "    <ver v=\"fw ver 1.5\"/>\n" +
                "  </pg>\n" +
                "  <pg>\n" +
                "    <pg_knd v=\"급속 1\"/>\n" +
                "    <ver v=\"fw ver 0.8.1\"/>\n" +
                "  </pg>\n" +
                "</bd>\n" +
                "</evcom>");
        EvcomReqPos14 pos14 = (EvcomReqPos14) jaxb2Marshaller.unmarshal(new StreamSource(reader));

        StreamResult result = new StreamResult( System.out );
        jaxb2Marshaller.marshal(pos14, result);
    }

    @Test
    public void JaxbGet03Test() {
        Jaxb2Marshaller jaxb2Marshaller = (Jaxb2Marshaller) context.getBean("getJaxb2Marshaller");

        EvcomResponseHead erh = new EvcomResponseHead(324, 234, "cid string", 234, "rms string", 2989);

        GET03 erb = new GET03();

        EvcomResGet03 ergprm03 = new EvcomResGet03(erh, erb);

        jaxb2Marshaller.setClassesToBeBound(EvcomResGet03.class, EvcomResponseHead.class, GET03.class);

        StreamResult result = new StreamResult( System.out );
        jaxb2Marshaller.marshal(ergprm03, result);
    }

    @Test
    public void JaxbGet01Test() {
        Jaxb2Marshaller jaxb2Marshaller = (Jaxb2Marshaller) context.getBean("getJaxb2Marshaller");

        EvcomResponseHead erh = new EvcomResponseHead(324, 234, "cid string", 234, "rms string", 2989);

        GET01 erb = new GET01(123423, 2343, "ccfg");
        List<PRM> leip = new ArrayList<>();
        leip.add(new EIP("eip value"));
        leip.add(new EPT("ept value"));
        leip.add(new VIP("vip value"));
        leip.add(new VPT("vpp value"));
        erb.setPrm(leip);

        EvcomResGet01 ergprm = new EvcomResGet01(erh, erb);

        jaxb2Marshaller.setClassesToBeBound(EvcomResGet01.class, EvcomResponseHead.class, GET01.class);

        StreamResult result = new StreamResult( System.out );
        jaxb2Marshaller.marshal(ergprm, result);
    }

    @Test
    // @Transactional
    public void JPANativeQueryTest() {

        Iterable<CpCtrl> cpCtrlEntries = cpCtrlRepository.cpCtrlTest(2, "01", 2, "1", "20151127");

        cpCtrlEntries.forEach(c -> {
            System.out.println(c.getId().getRegstDay());
            System.out.println(c.getId().getRegstTime());
            // System.out.println(c.getCtrlParameter().toString());
            System.out.println(c.getOutletStat());
            System.out.println(c.getRegst());

        });

    }

    @Test
    // @Transactional
    public void JPAPageTest() {

        QCpCtrl qcpCtrl = QCpCtrl.cpCtrl;

        final Pageable page = new PageRequest(
            0, 1, new Sort(
                new Sort.Order(Sort.Direction.ASC, "id.regstDay"),
                new Sort.Order(Sort.Direction.ASC, "id.regstTime")
            )
        );

        Page<CpCtrl> cpCtrlEntries = cpCtrlRepository.findAll(qcpCtrl.id.eqpNum.eq(7)
                                                            .and(qcpCtrl.id.outletNum.eq(1))
                                                            .and(qcpCtrl.transYn.eq("N")), page);


        cpCtrlEntries.forEach(c -> {
            System.out.println(c.getId().getRegstDay());
            System.out.println(c.getId().getRegstTime());
            // System.out.println(c.getCtrlParameter().toString());
            System.out.println(c.getOutletStat());
            System.out.println(c.getRegst());

        });

    }

    @Test
    // @Transactional
    public void JPATest() {

        QB2gHist b2gHist = QB2gHist.b2gHist;

        Path<?> stDayPath = QB2gHist.b2gHist.id.stDay;
        Expression<String> constant = Expressions.constant("201511%");
        Predicate predicate = Expressions.predicate(Ops.LIKE, stDayPath, constant);

        Iterable<B2gHist> b2gHistEntries = b2gHistRepository.findAll(predicate);

        log.info("-------------------" + b2gHistEntries);
        b2gHistEntries.forEach(h -> {
            log.info("++++++++++++++++++++++++++++++++++++++++++++++");
            log.info(h.getId().getStDay());
            log.info(h.getSendResMsg());
            log.info(h.getEndDay());
            log.info(h.getEndTime());
            log.info(h.getSendDay());
            log.info(h.getSender());
            log.info(h.getUpdateDay());
            log.info(h.getUpdateTime());
            log.info("-------------------------------------------------");
        });

        // log.info(netStatRepository.findByReceiverId("EcsiKdn"));

        log.info("XXXXXXXXXXXXXXXXXXXX com_cd start XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        QComCd comCd = QComCd.comCd;

        comCd.delYn.coalesce("Y");

        comCdRepository.findAll(comCd.delYn.eq("Y").and(comCd.updateDatetime.after(new Date(2010, 7, 1)))).forEach(c -> {
            log.info(c.getUpdateDatetime());
            log.info(c.getCdDesc());
            log.info(c.getCdNm());
            log.info(c.getDelYn());
        });
        log.info("XXXXXXXXXXXXXXXXXXXX com_cd end XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        // ProtocolInfo pi = protocolInfoRepository.findOne(1);
        Optional<ProtocolInfo> pi = protocolInfoRepository.findOneByProtocolType(2);
        
        System.out.println(pi.get().getProtocolName());
        System.out.println(pi.get().getProtocolType());
        //조인걸린 데이터 값들 가져오는거
        if (pi.isPresent()) {


            pi.get().getCpCompanyInfo().getEquipInfos().get(0).getCpCompanyInfo().getAddress();

            pi.get().getEquipInfos().iterator().forEachRemaining(e -> {
                log.info(e.getAlterDate());
                log.info(e.getAuthKey());
            });

            // pi.setProtocolVer("jeju version 234324");
            // pi.setProtocolName("gwangju protocol 234234");
            // protocolInfoRepository.save(pi);

            protocolInfoRepository.findAll().forEach(p -> {
                // update query
                // p.setProtocolVer("jeju version 2");
                // p.setProtocolName("jeju protocol 2");
                // protocolInfoRepository.save(p);

                log.info(p.getCpCompanyInfo());
                log.info("||||||||||||||| start equip info ||||||||||||||");
                // p.getEquipInfos().iterator().forEachRemaining(e -> {
                //     log.info(e.getAlterDate());
                //     log.info(e.getAuthKey());
                // });
                log.info("||||||||||||||| end equip info ||||||||||||||");
                log.info(p.getCpCompanyInfo().getHomepage());
                log.info(p.getCpCompanyInfo().getFax());
            });

        }

        EquipInfo ei = equipInfoRepository.findOne(4);

        ei.setOpData("This is json string".getBytes());
        equipInfoRepository.save(ei);

        /*
        Customer customer = new Customer();
        Customer cl = customerRepository.findByCustomerNo(234324234L);
        if (cl.equals(null)) {
            customer.setCustomerNo(234324234L);
            customer.setName("Foo");
            customer.setMileage(new BigDecimal(2342));
            Customer c2 = customerRepository.save(customer);
        }
        for (Customer c : customerRepository.findAll()){
            log.info(c.getName());
        }

        Customer c = customerRepository.findByName("Foo");
        log.info(c.getName());

        Address a = new Address();
        a.setLine1("abc_test");
        a.setCustomer(c);
        addressRepository.save(a);
        */


    }

}