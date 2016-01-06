package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the CP_DAY_END_HIST database table.
 * 
 */
@Entity
@Table(name="CP_DAY_END_HIST")
@NamedQuery(name="CpDayEndHist.findAll", query="SELECT c FROM CpDayEndHist c")
public class CpDayEndHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CpDayEndHistPK id;

	@Column(name="PAY_FAIL_CNT")
	private Integer payFailCnt;

	@Column(name="PAY_SUCC_CNT")
	private Integer paySuccCnt;

	@Column(name="TODAY_CHARGE_CNT")
	private Integer todayChargeCnt;

	@Column(name="TODAY_CHARGEKWH")
	private Integer todayChargekwh;

	@Column(name="TODAY_TOT_CHARGE_BILL")
	private Integer todayTotChargeBill;

	@Column(name="TODAY_WARNING_CNT")
	private Integer todayWarningCnt;

	public CpDayEndHist() {
	}

	public CpDayEndHistPK getId() {
		return this.id;
	}

	public void setId(CpDayEndHistPK id) {
		this.id = id;
	}

	public Integer getPayFailCnt() {
		return this.payFailCnt;
	}

	public void setPayFailCnt(Integer payFailCnt) {
		this.payFailCnt = payFailCnt;
	}

	public Integer getPaySuccCnt() {
		return this.paySuccCnt;
	}

	public void setPaySuccCnt(Integer paySuccCnt) {
		this.paySuccCnt = paySuccCnt;
	}

	public Integer getTodayChargeCnt() {
		return this.todayChargeCnt;
	}

	public void setTodayChargeCnt(Integer todayChargeCnt) {
		this.todayChargeCnt = todayChargeCnt;
	}

	public Integer getTodayChargekwh() {
		return this.todayChargekwh;
	}

	public void setTodayChargekwh(Integer todayChargekwh) {
		this.todayChargekwh = todayChargekwh;
	}

	public Integer getTodayTotChargeBill() {
		return this.todayTotChargeBill;
	}

	public void setTodayTotChargeBill(Integer todayTotChargeBill) {
		this.todayTotChargeBill = todayTotChargeBill;
	}

	public Integer getTodayWarningCnt() {
		return this.todayWarningCnt;
	}

	public void setTodayWarningCnt(Integer todayWarningCnt) {
		this.todayWarningCnt = todayWarningCnt;
	}

}