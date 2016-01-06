package com.ain.syl.repository.csos;

import com.ain.syl.domain.csos.CpCtrl;
import com.ain.syl.domain.csos.CpCtrlPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Young Gyu Park on 1/10/2015.
 */
@Repository
public interface CpCtrlRepository extends CrudRepository<CpCtrl, CpCtrlPK>, QueryDslPredicateExecutor<CpCtrl> {

    @Query(value = "SELECT * FROM CP_CTRL " +
                    "WHERE EQP_NUM = (SELECT EQP_NUM FROM EQUIP_INFO WHERE CS_NUM = ?1 AND EQP_ID = ?2 AND PROTOCOL_TYPE = ?3) " +
                    "AND OUTLET_NUM = ?4 " +
                    "AND TRANS_YN = 'N' " +
                    "ORDER BY REGST_DAY, REGST_TIME+0 " +
                    "LIMIT 1", nativeQuery = true)
    Iterable<CpCtrl> cpCtrlTest(int csNum, String eqpId, int protocolType, String outletNum);

}