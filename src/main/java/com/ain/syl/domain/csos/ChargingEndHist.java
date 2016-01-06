package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CHARGING_END_HIST database table.
 * 
 */
@Entity
@Table(name="CHARGING_END_HIST")
@NamedQuery(name="ChargingEndHist.findAll", query="SELECT c FROM ChargingEndHist c")
public class ChargingEndHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChargingEndHistPK id;

	@Column(name="APLY_UCOST", precision=5, scale=0)
	private BigDecimal aplyUcost;

	@Column(name="AUTH_CL")
	private Integer authCl;

	@Column(name="AUTH_LOC")
	private Integer authLoc;

	@Column(name="BILL_CUST_NO", length=10)
	private String billCustNo;

	@Column(name="CAR_NO", length=20)
	private String carNo;

	@Column(name="CHARGE_END_STAT")
	private String chargeEndStat;

	@Column(name="CHARGE_TIME")
	private Integer chargeTime;

	@Column(name="CHARGEKWH", precision=6, scale=2)
	private BigDecimal chargekwh;

	@Column(name="CTLR_MSG", length=33)
	private String ctlrMsg;

	@Column(name="ELE_USE_REQ_NM", length=20)
	private String eleUseReqNm;

	@Column(name="END_CTRL_MSG_ID", length=20)
	private String endCtrlMsgId;

	@Column(name="END_DAY", length=8)
	private String endDay;

	@Column(name="END_TIME", length=6)
	private String endTime;

	@Column(name="MEMBER_CARD_NO", length=20)
	private String memberCardNo;

	@Column(name="PAY_DAY", length=8)
	private String payDay;

	@Column(name="PAY_MTHD", length=1)
	private String payMthd;

	@Column(name="PAY_STAT", length=2)
	private String payStat;

	@Column(name="PAY_TIME", length=6)
	private String payTime;

	@Column(name="PLUG_DAY", length=8)
	private String plugDay;

	@Column(name="PLUG_IKWH")
	private Integer plugIkwh;

	@Column(name="PLUG_TIME", length=6)
	private String plugTime;

	@Column(name="ST_BATT_RMNKWH", precision=6, scale=2)
	private BigDecimal stBattRmnkwh;

	@Column(name="ST_CTRL_MSG_ID", length=20)
	private String stCtrlMsgId;

	@Column(name="UNPLUG_DAY", length=8)
	private String unplugDay;

	@Column(name="UNPLUG_IKWH")
	private Integer unplugIkwh;

	@Column(name="UNPLUG_TIME", length=6)
	private String unplugTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATETIME")
	private Date updateDatetime;

	@Column(name="V2G_TYPE")
	private Integer v2gType;

	@Column(name="CHARGE_REQ_CFM_MTHD")
	private String chargeReqCfmMthd;

	@Column(name="CHARGE_REQ_KWH")
	private BigDecimal chargeReqKwh;
	
	@Column(name="CHARGE_REQ_AMT")
	private BigDecimal chargeReqAmt;

	@Column(name="TOT_CHARGE_BILL")
	private BigDecimal totChargeBill;
	

	public ChargingEndHist() {
	}

	public ChargingEndHistPK getId() {
		return this.id;
	}

	public void setId(ChargingEndHistPK id) {
		this.id = id;
	}

	public BigDecimal getAplyUcost() {
		return this.aplyUcost;
	}

	public void setAplyUcost(BigDecimal aplyUcost) {
		this.aplyUcost = aplyUcost;
	}

	public Integer getAuthCl() {
		return this.authCl;
	}

	public void setAuthCl(Integer authCl) {
		this.authCl = authCl;
	}

	public Integer getAuthLoc() {
		return this.authLoc;
	}

	public void setAuthLoc(Integer authLoc) {
		this.authLoc = authLoc;
	}

	public String getBillCustNo() {
		return this.billCustNo;
	}

	public void setBillCustNo(String billCustNo) {
		this.billCustNo = billCustNo;
	}

	public String getCarNo() {
		return this.carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getChargeEndStat() {
		return this.chargeEndStat;
	}

	public void setChargeEndStat(String chargeEndStat) {
		this.chargeEndStat = chargeEndStat;
	}

	public Integer getChargeTime() {
		return this.chargeTime;
	}

	public void setChargeTime(Integer chargeTime) {
		this.chargeTime = chargeTime;
	}

	public BigDecimal getChargekwh() {
		return this.chargekwh;
	}

	public void setChargekwh(BigDecimal chargekwh) {
		this.chargekwh = chargekwh;
	}

	public String getCtlrMsg() {
		return this.ctlrMsg;
	}

	public void setCtlrMsg(String ctlrMsg) {
		this.ctlrMsg = ctlrMsg;
	}

	public String getEleUseReqNm() {
		return this.eleUseReqNm;
	}

	public void setEleUseReqNm(String eleUseReqNm) {
		this.eleUseReqNm = eleUseReqNm;
	}

	public String getEndCtrlMsgId() {
		return this.endCtrlMsgId;
	}

	public void setEndCtrlMsgId(String endCtrlMsgId) {
		this.endCtrlMsgId = endCtrlMsgId;
	}

	public String getEndDay() {
		return this.endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMemberCardNo() {
		return this.memberCardNo;
	}

	public void setMemberCardNo(String memberCardNo) {
		this.memberCardNo = memberCardNo;
	}

	public String getPayDay() {
		return this.payDay;
	}

	public void setPayDay(String payDay) {
		this.payDay = payDay;
	}

	public String getPayMthd() {
		return this.payMthd;
	}

	public void setPayMthd(String payMthd) {
		this.payMthd = payMthd;
	}

	public String getPayStat() {
		return this.payStat;
	}

	public void setPayStat(String payStat) {
		this.payStat = payStat;
	}

	public String getPayTime() {
		return this.payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPlugDay() {
		return this.plugDay;
	}

	public void setPlugDay(String plugDay) {
		this.plugDay = plugDay;
	}

	public Integer getPlugIkwh() {
		return this.plugIkwh;
	}

	public void setPlugIkwh(Integer plugIkwh) {
		this.plugIkwh = plugIkwh;
	}

	public String getPlugTime() {
		return this.plugTime;
	}

	public void setPlugTime(String plugTime) {
		this.plugTime = plugTime;
	}

	public BigDecimal getStBattRmnkwh() {
		return this.stBattRmnkwh;
	}

	public void setStBattRmnkwh(BigDecimal stBattRmnkwh) {
		this.stBattRmnkwh = stBattRmnkwh;
	}

	public String getStCtrlMsgId() {
		return this.stCtrlMsgId;
	}

	public void setStCtrlMsgId(String stCtrlMsgId) {
		this.stCtrlMsgId = stCtrlMsgId;
	}

	public String getUnplugDay() {
		return this.unplugDay;
	}

	public void setUnplugDay(String unplugDay) {
		this.unplugDay = unplugDay;
	}

	public Integer getUnplugIkwh() {
		return this.unplugIkwh;
	}

	public void setUnplugIkwh(Integer unplugIkwh) {
		this.unplugIkwh = unplugIkwh;
	}

	public String getUnplugTime() {
		return this.unplugTime;
	}

	public void setUnplugTime(String unplugTime) {
		this.unplugTime = unplugTime;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public Integer getV2gType() {
		return this.v2gType;
	}

	public void setV2gType(Integer v2gType) {
		this.v2gType = v2gType;
	}

	public String getChargeReqCfmMthd() {
		return chargeReqCfmMthd;
	}

	public void setChargeReqCfmMthd(String chargeReqCfmMthd) {
		this.chargeReqCfmMthd = chargeReqCfmMthd;
	}

	public BigDecimal getChargeReqKwh() {
		return chargeReqKwh;
	}

	public void setChargeReqKwh(BigDecimal chargeReqKwh) {
		this.chargeReqKwh = chargeReqKwh;
	}

	public BigDecimal getChargeReqAmt() {
		return chargeReqAmt;
	}

	public void setChargeReqAmt(BigDecimal chargeReqAmt) {
		this.chargeReqAmt = chargeReqAmt;
	}

	public BigDecimal getTotChargeBill() {
		return totChargeBill;
	}

	public void setTotChargeBill(BigDecimal totChargeBill) {
		this.totChargeBill = totChargeBill;
	}
	
}