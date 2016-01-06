package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the LB_STAT_HIST database table.
 * 
 */
@Entity
@Table(name="LB_STAT_HIST")
@NamedQuery(name="LbStatHist.findAll", query="SELECT l FROM LbStatHist l")
public class LbStatHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LbStatHistPK id;

	@Column(name="BATT_STAT")
	private Integer battStat;

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

	public LbStatHist() {
	}

	public LbStatHistPK getId() {
		return this.id;
	}

	public void setId(LbStatHistPK id) {
		this.id = id;
	}

	public Integer getBattStat() {
		return this.battStat;
	}

	public void setBattStat(Integer battStat) {
		this.battStat = battStat;
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

}