package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the B2G_STAT_HIST database table.
 * 
 */
@Entity
@Table(name="B2G_STAT_HIST")
@NamedQuery(name="B2gStatHist.findAll", query="SELECT b FROM B2gStatHist b")
public class B2gStatHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private B2gStatHistPK id;

	@Column(name="BATT_CURR", precision=10, scale=2)
	private BigDecimal battCurr;

	@Column(name="BATT_CURRENT_PWR", precision=10, scale=2)
	private BigDecimal battCurrentPwr;

	@Column(name="BATT_STAT")
	private Integer battStat;

	@Column(name="BATT_VOLT", precision=4, scale=0)
	private BigDecimal battVolt;

	@Column(name="CIRCUIT_FREQUENCY", precision=4, scale=1)
	private BigDecimal circuitFrequency;

	@Column(name="CIRCUIT_RPH_CURR", precision=3, scale=0)
	private BigDecimal circuitRphCurr;

	@Column(name="CIRCUIT_RS_VOLT", precision=4, scale=0)
	private BigDecimal circuitRsVolt;

	@Column(name="CIRCUIT_SPH_CURR", precision=3, scale=0)
	private BigDecimal circuitSphCurr;

	@Column(name="CIRCUIT_ST_VOLT", precision=4, scale=0)
	private BigDecimal circuitStVolt;

	@Column(name="CIRCUIT_STAT")
	private Integer circuitStat;

	@Column(name="CIRCUIT_TPH_CURR", precision=3, scale=0)
	private BigDecimal circuitTphCurr;

	@Column(name="CIRCUIT_TR_VOLT", precision=4, scale=0)
	private BigDecimal circuitTrVolt;

	@Column(name="IVT_CURRENT_PWR", precision=4, scale=1)
	private BigDecimal ivtCurrentPwr;

	@Column(name="IVT_MAX_OUT_PWR", precision=5, scale=2)
	private BigDecimal ivtMaxOutPwr;

	@Column(name="IVT_NEEDLE", precision=10, scale=2)
	private BigDecimal ivtNeedle;

	@Column(name="IVT_PWRFACT", precision=4, scale=1)
	private BigDecimal ivtPwrfact;

	@Column(name="IVT_STAT")
	private Integer ivtStat;

	@Column(name="ST_DAY", length=8)
	private String stDay;

	@Column(name="ST_TIME", length=6)
	private String stTime;

	public B2gStatHist() {
	}

	public B2gStatHistPK getId() {
		return this.id;
	}

	public void setId(B2gStatHistPK id) {
		this.id = id;
	}

	public BigDecimal getBattCurr() {
		return this.battCurr;
	}

	public void setBattCurr(BigDecimal battCurr) {
		this.battCurr = battCurr;
	}

	public BigDecimal getBattCurrentPwr() {
		return this.battCurrentPwr;
	}

	public void setBattCurrentPwr(BigDecimal battCurrentPwr) {
		this.battCurrentPwr = battCurrentPwr;
	}

	public Integer getBattStat() {
		return this.battStat;
	}

	public void setBattStat(Integer battStat) {
		this.battStat = battStat;
	}

	public BigDecimal getBattVolt() {
		return this.battVolt;
	}

	public void setBattVolt(BigDecimal battVolt) {
		this.battVolt = battVolt;
	}

	public BigDecimal getCircuitFrequency() {
		return this.circuitFrequency;
	}

	public void setCircuitFrequency(BigDecimal circuitFrequency) {
		this.circuitFrequency = circuitFrequency;
	}

	public BigDecimal getCircuitRphCurr() {
		return this.circuitRphCurr;
	}

	public void setCircuitRphCurr(BigDecimal circuitRphCurr) {
		this.circuitRphCurr = circuitRphCurr;
	}

	public BigDecimal getCircuitRsVolt() {
		return this.circuitRsVolt;
	}

	public void setCircuitRsVolt(BigDecimal circuitRsVolt) {
		this.circuitRsVolt = circuitRsVolt;
	}

	public BigDecimal getCircuitSphCurr() {
		return this.circuitSphCurr;
	}

	public void setCircuitSphCurr(BigDecimal circuitSphCurr) {
		this.circuitSphCurr = circuitSphCurr;
	}

	public BigDecimal getCircuitStVolt() {
		return this.circuitStVolt;
	}

	public void setCircuitStVolt(BigDecimal circuitStVolt) {
		this.circuitStVolt = circuitStVolt;
	}

	public Integer getCircuitStat() {
		return this.circuitStat;
	}

	public void setCircuitStat(Integer circuitStat) {
		this.circuitStat = circuitStat;
	}

	public BigDecimal getCircuitTphCurr() {
		return this.circuitTphCurr;
	}

	public void setCircuitTphCurr(BigDecimal circuitTphCurr) {
		this.circuitTphCurr = circuitTphCurr;
	}

	public BigDecimal getCircuitTrVolt() {
		return this.circuitTrVolt;
	}

	public void setCircuitTrVolt(BigDecimal circuitTrVolt) {
		this.circuitTrVolt = circuitTrVolt;
	}

	public BigDecimal getIvtCurrentPwr() {
		return this.ivtCurrentPwr;
	}

	public void setIvtCurrentPwr(BigDecimal ivtCurrentPwr) {
		this.ivtCurrentPwr = ivtCurrentPwr;
	}

	public BigDecimal getIvtMaxOutPwr() {
		return this.ivtMaxOutPwr;
	}

	public void setIvtMaxOutPwr(BigDecimal ivtMaxOutPwr) {
		this.ivtMaxOutPwr = ivtMaxOutPwr;
	}

	public BigDecimal getIvtNeedle() {
		return this.ivtNeedle;
	}

	public void setIvtNeedle(BigDecimal ivtNeedle) {
		this.ivtNeedle = ivtNeedle;
	}

	public BigDecimal getIvtPwrfact() {
		return this.ivtPwrfact;
	}

	public void setIvtPwrfact(BigDecimal ivtPwrfact) {
		this.ivtPwrfact = ivtPwrfact;
	}

	public Integer getIvtStat() {
		return this.ivtStat;
	}

	public void setIvtStat(Integer ivtStat) {
		this.ivtStat = ivtStat;
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

}