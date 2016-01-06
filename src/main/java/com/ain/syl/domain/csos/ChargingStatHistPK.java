package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;

/**
 * The primary key class for the CHARGING_STAT_HIST database table.
 * 
 */
@Embeddable
public class ChargingStatHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STAT_UPDATE_DATETIME", unique=true, nullable=false)
	private java.util.Date statUpdateDatetime;

	public ChargingStatHistPK() {
	}
	public Integer getEqpNum() {
		return this.eqpNum;
	}
	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}
	public Integer getOutletNum() {
		return this.outletNum;
	}
	public void setOutletNum(Integer outletNum) {
		this.outletNum = outletNum;
	}
	public java.util.Date getStatUpdateDatetime() {
		return this.statUpdateDatetime;
	}
	public void setStatUpdateDatetime(java.util.Date statUpdateDatetime) {
		this.statUpdateDatetime = statUpdateDatetime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChargingStatHistPK)) {
			return false;
		}
		ChargingStatHistPK castOther = (ChargingStatHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.statUpdateDatetime.equals(castOther.statUpdateDatetime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.statUpdateDatetime.hashCode();
		
		return hash;
	}
}