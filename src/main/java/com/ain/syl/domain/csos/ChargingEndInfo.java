package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the CHARGING_END_INFO database table.
 * 
 */
@Entity
@Table(name="CHARGING_END_INFO")
@NamedQuery(name="ChargingEndInfo.findAll", query="SELECT c FROM ChargingEndInfo c")
public class ChargingEndInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChargingEndInfoPK id;

	@Column(name="APLY_UCOST")
	private Integer aplyUcost;

	@Column(name="AUTH_CL")
	private Integer authCl;

	@Column(name="AUTH_LOC")
	private Integer authLoc;

	@Column(name="BILL_CUST_NO", length=10)
	private String billCustNo;

	@Column(name="CAR_NO", length=20)
	private String carNo;

	@Column(name="CHARGE_END_STAT", length=1)
	private String chargeEndStat;

	@Column(name="CHARGE_KWH", precision=6, scale=2)
	private BigDecimal chargeKwh;

	@Column(name="CHARGE_TIME")
	private Integer chargeTime;

	@Column(name="CTRL_MSG_ID", length=10)
	private String ctrlMsgId;

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

	@Column(name="ST_DAY", length=8)
	private String stDay;

	@Column(name="ST_TIME", length=6)
	private String stTime;

	@Column(name="UNPLUG_DAY", length=8)
	private String unplugDay;

	@Column(name="UNPLUG_IKWH")
	private Integer unplugIkwh;

	@Column(name="UNPLUG_TIME", length=6)
	private String unplugTime;

	@Column(name="V2G_TYPE")
	private Integer v2gType;

	public ChargingEndInfo() {
	}

	public ChargingEndInfoPK getId() {
		return this.id;
	}

	public void setId(ChargingEndInfoPK id) {
		this.id = id;
	}

	public Integer getAplyUcost() {
		return this.aplyUcost;
	}

	public void setAplyUcost(Integer aplyUcost) {
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

	public BigDecimal getChargeKwh() {
		return this.chargeKwh;
	}

	public void setChargeKwh(BigDecimal chargeKwh) {
		this.chargeKwh = chargeKwh;
	}

	public Integer getChargeTime() {
		return this.chargeTime;
	}

	public void setChargeTime(Integer chargeTime) {
		this.chargeTime = chargeTime;
	}

	public String getCtrlMsgId() {
		return this.ctrlMsgId;
	}

	public void setCtrlMsgId(String ctrlMsgId) {
		this.ctrlMsgId = ctrlMsgId;
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

	public String getStDay() {
		return this.stDay;
	}

	public void setStDay(String stDay) {
		this.stDay = stDay;
	}

	public String getStTime() {
		return this.stTime;
	}

	public void setStTime(String stTime) {
		this.stTime = stTime;
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

	public Integer getV2gType() {
		return this.v2gType;
	}

	public void setV2gType(Integer v2gType) {
		this.v2gType = v2gType;
	}

}