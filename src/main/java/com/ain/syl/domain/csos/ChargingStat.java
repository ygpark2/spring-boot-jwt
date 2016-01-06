package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CHARGING_STAT database table.
 * 
 */
@Entity
@Table(name="CHARGING_STAT")
@NamedQuery(name="ChargingStat.findAll", query="SELECT c FROM ChargingStat c")
public class ChargingStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChargingStatPK id;

	@Column(name="AUTH_CL")
	private Integer authCl;

	@Column(name="BATT_CAPA", precision=6, scale=2)
	private BigDecimal battCapa;

	@Column(name="BATT_CURR")
	private Integer battCurr;

	@Column(name="BATT_RMNKWH", precision=6, scale=2)
	private BigDecimal battRmnkwh;

	@Column(name="BATT_STAT", length=20)
	private String battStat;

	@Column(name="BATT_TMP", precision=4, scale=1)
	private BigDecimal battTmp;

	@Column(name="BATT_VOLT")
	private Integer battVolt;

	@Column(name="BILL_CUST_NO", length=10)
	private String billCustNo;

	@Column(name="BMS_SW_VER", length=20)
	private String bmsSwVer;

	@Column(name="CAR_KND", length=20)
	private String carKnd;

	@Column(name="CAR_NO", length=20)
	private String carNo;

	@Column(name="CHARGE_ACCUM_TIME")
	private Integer chargeAccumTime;

	@Column(name="CHARGE_MODE", length=1)
	private String chargeMode;

	@Column(name="CHARGE_REQ_AMT", precision=5, scale=0)
	private BigDecimal chargeReqAmt;

	@Column(name="CHARGE_REQ_CFM_MTHD", length=1)
	private String chargeReqCfmMthd;

	@Column(name="CHARGE_REQ_KWH", precision=6, scale=2)
	private BigDecimal chargeReqKwh;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CHARGE_ST_DATETIME")
	private Date chargeStDatetime;

	@Column(name="CHARGE_V2G_CL", length=1)
	private String chargeV2gCl;

	@Column(name="CURRENT_AMT", precision=5, scale=0)
	private BigDecimal currentAmt;

	@Column(name="CURRENT_KWH", precision=6, scale=2)
	private BigDecimal currentKwh;

	@Column(name="CURRENT_UCOST", precision=6, scale=2)
	private BigDecimal currentUcost;

	@Column(name="ELE_USE_REQ_NM", length=20)
	private String eleUseReqNm;

	@Column(name="END_FOCAST_DAY", length=8)
	private String endFocastDay;

	@Column(name="END_FOCAST_TIME", length=6)
	private String endFocastTime;

	@Column(name="FAU_TP", length=2)
	private String fauTp;

	@Column(name="LMT_STAT", length=2)
	private String lmtStat;

	@Column(name="MEMBER_CARD_NO", length=20)
	private String memberCardNo;

	@Column(name="PAY_MTHD", length=1)
	private String payMthd;

	@Column(name="PLUG_DAY", length=8)
	private String plugDay;

	@Column(name="PLUG_TIME", length=6)
	private String plugTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STAT_UPDATE_DATETIME")
	private Date statUpdateDatetime;

	@Column(name="WAIT_CTRL_CD")
	private String waitCtrlCd;

	@Column(name="WRK_EXE_RATE", precision=5, scale=2)
	private BigDecimal wrkExeRate;

	public ChargingStat() {
	}

	public ChargingStatPK getId() {
		return this.id;
	}

	public void setId(ChargingStatPK id) {
		this.id = id;
	}

	public Integer getAuthCl() {
		return this.authCl;
	}

	public void setAuthCl(Integer authCl) {
		this.authCl = authCl;
	}

	public BigDecimal getBattCapa() {
		return this.battCapa;
	}

	public void setBattCapa(BigDecimal battCapa) {
		this.battCapa = battCapa;
	}

	public Integer getBattCurr() {
		return this.battCurr;
	}

	public void setBattCurr(Integer battCurr) {
		this.battCurr = battCurr;
	}

	public BigDecimal getBattRmnkwh() {
		return this.battRmnkwh;
	}

	public void setBattRmnkwh(BigDecimal battRmnkwh) {
		this.battRmnkwh = battRmnkwh;
	}

	public String getBattStat() {
		return this.battStat;
	}

	public void setBattStat(String battStat) {
		this.battStat = battStat;
	}

	public BigDecimal getBattTmp() {
		return this.battTmp;
	}

	public void setBattTmp(BigDecimal battTmp) {
		this.battTmp = battTmp;
	}

	public Integer getBattVolt() {
		return this.battVolt;
	}

	public void setBattVolt(Integer battVolt) {
		this.battVolt = battVolt;
	}

	public String getBillCustNo() {
		return this.billCustNo;
	}

	public void setBillCustNo(String billCustNo) {
		this.billCustNo = billCustNo;
	}

	public String getBmsSwVer() {
		return this.bmsSwVer;
	}

	public void setBmsSwVer(String bmsSwVer) {
		this.bmsSwVer = bmsSwVer;
	}

	public String getCarKnd() {
		return this.carKnd;
	}

	public void setCarKnd(String carKnd) {
		this.carKnd = carKnd;
	}

	public String getCarNo() {
		return this.carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public Integer getChargeAccumTime() {
		return this.chargeAccumTime;
	}

	public void setChargeAccumTime(Integer chargeAccumTime) {
		this.chargeAccumTime = chargeAccumTime;
	}

	public String getChargeMode() {
		return this.chargeMode;
	}

	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}

	public BigDecimal getChargeReqAmt() {
		return this.chargeReqAmt;
	}

	public void setChargeReqAmt(BigDecimal chargeReqAmt) {
		this.chargeReqAmt = chargeReqAmt;
	}

	public String getChargeReqCfmMthd() {
		return this.chargeReqCfmMthd;
	}

	public void setChargeReqCfmMthd(String chargeReqCfmMthd) {
		this.chargeReqCfmMthd = chargeReqCfmMthd;
	}

	public BigDecimal getChargeReqKwh() {
		return this.chargeReqKwh;
	}

	public void setChargeReqKwh(BigDecimal chargeReqKwh) {
		this.chargeReqKwh = chargeReqKwh;
	}

	public Date getChargeStDatetime() {
		return this.chargeStDatetime;
	}

	public void setChargeStDatetime(Date chargeStDatetime) {
		this.chargeStDatetime = chargeStDatetime;
	}

	public String getChargeV2gCl() {
		return this.chargeV2gCl;
	}

	public void setChargeV2gCl(String chargeV2gCl) {
		this.chargeV2gCl = chargeV2gCl;
	}

	public BigDecimal getCurrentAmt() {
		return this.currentAmt;
	}

	public void setCurrentAmt(BigDecimal currentAmt) {
		this.currentAmt = currentAmt;
	}

	public BigDecimal getCurrentKwh() {
		return this.currentKwh;
	}

	public void setCurrentKwh(BigDecimal currentKwh) {
		this.currentKwh = currentKwh;
	}

	public BigDecimal getCurrentUcost() {
		return this.currentUcost;
	}

	public void setCurrentUcost(BigDecimal currentUcost) {
		this.currentUcost = currentUcost;
	}

	public String getEleUseReqNm() {
		return this.eleUseReqNm;
	}

	public void setEleUseReqNm(String eleUseReqNm) {
		this.eleUseReqNm = eleUseReqNm;
	}

	public String getEndFocastDay() {
		return this.endFocastDay;
	}

	public void setEndFocastDay(String endFocastDay) {
		this.endFocastDay = endFocastDay;
	}

	public String getEndFocastTime() {
		return this.endFocastTime;
	}

	public void setEndFocastTime(String endFocastTime) {
		this.endFocastTime = endFocastTime;
	}

	public String getFauTp() {
		return this.fauTp;
	}

	public void setFauTp(String fauTp) {
		this.fauTp = fauTp;
	}

	public String getLmtStat() {
		return this.lmtStat;
	}

	public void setLmtStat(String lmtStat) {
		this.lmtStat = lmtStat;
	}

	public String getMemberCardNo() {
		return this.memberCardNo;
	}

	public void setMemberCardNo(String memberCardNo) {
		this.memberCardNo = memberCardNo;
	}

	public String getPayMthd() {
		return this.payMthd;
	}

	public void setPayMthd(String payMthd) {
		this.payMthd = payMthd;
	}

	public String getPlugDay() {
		return this.plugDay;
	}

	public void setPlugDay(String plugDay) {
		this.plugDay = plugDay;
	}

	public String getPlugTime() {
		return this.plugTime;
	}

	public void setPlugTime(String plugTime) {
		this.plugTime = plugTime;
	}

	public Date getStatUpdateDatetime() {
		return this.statUpdateDatetime;
	}

	public void setStatUpdateDatetime(Date statUpdateDatetime) {
		this.statUpdateDatetime = statUpdateDatetime;
	}

	public String getWaitCtrlCd() {
		return this.waitCtrlCd;
	}

	public void setWaitCtrlCd(String waitCtrlCd) {
		this.waitCtrlCd = waitCtrlCd;
	}

	public BigDecimal getWrkExeRate() {
		return this.wrkExeRate;
	}

	public void setWrkExeRate(BigDecimal wrkExeRate) {
		this.wrkExeRate = wrkExeRate;
	}

}