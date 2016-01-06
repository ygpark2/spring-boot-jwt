package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the CHARGING_PAY_HIST database table.
 * 
 */
@Embeddable
public class ChargingPayHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="PAY_DAY", unique=true, nullable=false, length=8)
	private String payDay;

	@Column(name="PAY_TIME", unique=true, nullable=false, length=6)
	private String payTime;

	public ChargingPayHistPK() {
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
	public String getPayDay() {
		return this.payDay;
	}
	public void setPayDay(String payDay) {
		this.payDay = payDay;
	}
	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChargingPayHistPK)) {
			return false;
		}
		ChargingPayHistPK castOther = (ChargingPayHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.payDay.equals(castOther.payDay)
			&& this.payTime.equals(castOther.payTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.payDay.hashCode();
		hash = hash * prime + this.payTime.hashCode();
		
		return hash;
	}
}