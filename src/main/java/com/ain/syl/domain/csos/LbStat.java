package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the LB_STAT database table.
 * 
 */
@Entity
@Table(name="LB_STAT")
@NamedQuery(name="LbStat.findAll", query="SELECT l FROM LbStat l")
public class LbStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LbStatPK id;

	@Column(name="LCAPA_BATT_STAT")
	private Integer lcapaBattStat;

	@Column(name="RCMP_CHARGE", precision=10, scale=5)
	private BigDecimal rcmpCharge;

	@Column(name="RCMP_DISCHARGE", precision=10, scale=5)
	private BigDecimal rcmpDischarge;

	@Column(name="SOC", precision=4, scale=1)
	private BigDecimal soc;

	@Column(name="SOC_CHARGE", precision=10, scale=5)
	private BigDecimal socCharge;

	@Column(name="SOC_DISCHARGE", precision=10, scale=5)
	private BigDecimal socDischarge;

	@Column(name="STAT_UPDATE_DAY", length=8)
	private String statUpdateDay;

	@Column(name="STAT_UPDATE_TIME", length=6)
	private String statUpdateTime;

	public LbStat() {
	}

	public LbStatPK getId() {
		return this.id;
	}

	public void setId(LbStatPK id) {
		this.id = id;
	}

	public Integer getLcapaBattStat() {
		return this.lcapaBattStat;
	}

	public void setLcapaBattStat(Integer lcapaBattStat) {
		this.lcapaBattStat = lcapaBattStat;
	}

	public BigDecimal getRcmpCharge() {
		return this.rcmpCharge;
	}

	public void setRcmpCharge(BigDecimal rcmpCharge) {
		this.rcmpCharge = rcmpCharge;
	}

	public BigDecimal getRcmpDischarge() {
		return this.rcmpDischarge;
	}

	public void setRcmpDischarge(BigDecimal rcmpDischarge) {
		this.rcmpDischarge = rcmpDischarge;
	}

	public BigDecimal getSoc() {
		return this.soc;
	}

	public void setSoc(BigDecimal soc) {
		this.soc = soc;
	}

	public BigDecimal getSocCharge() {
		return this.socCharge;
	}

	public void setSocCharge(BigDecimal socCharge) {
		this.socCharge = socCharge;
	}

	public BigDecimal getSocDischarge() {
		return this.socDischarge;
	}

	public void setSocDischarge(BigDecimal socDischarge) {
		this.socDischarge = socDischarge;
	}

	public String getStatUpdateDay() {
		return this.statUpdateDay;
	}

	public void setStatUpdateDay(String statUpdateDay) {
		this.statUpdateDay = statUpdateDay;
	}

	public String getStatUpdateTime() {
		return this.statUpdateTime;
	}

	public void setStatUpdateTime(String statUpdateTime) {
		this.statUpdateTime = statUpdateTime;
	}

}