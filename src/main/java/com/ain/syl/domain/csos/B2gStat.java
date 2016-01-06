package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the B2G_STAT database table.
 * 
 */
@Entity
@Table(name="B2G_STAT")
@NamedQuery(name="B2gStat.findAll", query="SELECT b FROM B2gStat b")
public class B2gStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private B2gStatPK id;

	@Column(name="B2G_BATT_STAT")
	private Integer b2gBattStat;

	@Column(name="B2G_IVT_STAT")
	private Integer b2gIvtStat;

	@Column(name="B2G_ST_DAY", length=8)
	private String b2gStDay;

	@Column(name="B2G_ST_TIME", length=6)
	private String b2gStTime;

	@Column(name="BATT_CURR", precision=4, scale=0)
	private BigDecimal battCurr;

	@Column(name="BATT_CURRENT_PWR", precision=5, scale=2)
	private BigDecimal battCurrentPwr;

	@Column(name="BATT_VOLT", precision=4, scale=0)
	private BigDecimal battVolt;

	@Column(name="CIRCUIT_FREQUENCY", precision=5, scale=1)
	private BigDecimal circuitFrequency;

	@Column(name="CIRCUIT_RPH_CURR", precision=4, scale=0)
	private BigDecimal circuitRphCurr;

	@Column(name="CIRCUIT_RS_VOLT", precision=4, scale=0)
	private BigDecimal circuitRsVolt;

	@Column(name="CIRCUIT_SPH_CURR", precision=4, scale=0)
	private BigDecimal circuitSphCurr;

	@Column(name="CIRCUIT_ST_VOLT", precision=4, scale=0)
	private BigDecimal circuitStVolt;

	@Column(name="CIRCUIT_STAT")
	private Integer circuitStat;

	@Column(name="CIRCUIT_TPH_CURR", precision=4, scale=0)
	private BigDecimal circuitTphCurr;

	@Column(name="CIRCUIT_TR_VOLT", precision=4, scale=0)
	private BigDecimal circuitTrVolt;

	@Column(name="IVT_CURRENT_PWR", precision=4, scale=2)
	private BigDecimal ivtCurrentPwr;

	@Column(name="IVT_MAX_OUT_PWR", precision=5, scale=2)
	private BigDecimal ivtMaxOutPwr;

	@Column(name="IVT_NEEDLE", precision=10, scale=2)
	private BigDecimal ivtNeedle;

	@Column(name="IVT_PWRFACT", precision=4, scale=1)
	private BigDecimal ivtPwrfact;

	public B2gStat() {
	}

	public B2gStatPK getId() {
		return this.id;
	}

	public void setId(B2gStatPK id) {
		this.id = id;
	}

	public Integer getB2gBattStat() {
		return this.b2gBattStat;
	}

	public void setB2gBattStat(Integer b2gBattStat) {
		this.b2gBattStat = b2gBattStat;
	}

	public Integer getB2gIvtStat() {
		return this.b2gIvtStat;
	}

	public void setB2gIvtStat(Integer b2gIvtStat) {
		this.b2gIvtStat = b2gIvtStat;
	}

	public String getB2gStDay() {
		return this.b2gStDay;
	}

	public void setB2gStDay(String b2gStDay) {
		this.b2gStDay = b2gStDay;
	}

	public String getB2gStTime() {
		return this.b2gStTime;
	}

	public void setB2gStTime(String b2gStTime) {
		this.b2gStTime = b2gStTime;
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

}