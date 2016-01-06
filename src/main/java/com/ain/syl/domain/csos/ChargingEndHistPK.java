package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the CHARGING_END_HIST database table.
 * 
 */
@Embeddable
public class ChargingEndHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="ST_DAY", unique=true, nullable=false, length=8)
	private String stDay;

	@Column(name="ST_TIME", unique=true, nullable=false, length=6)
	private String stTime;

	public ChargingEndHistPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChargingEndHistPK)) {
			return false;
		}
		ChargingEndHistPK castOther = (ChargingEndHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.stDay.equals(castOther.stDay)
			&& this.stTime.equals(castOther.stTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.stDay.hashCode();
		hash = hash * prime + this.stTime.hashCode();
		
		return hash;
	}
}