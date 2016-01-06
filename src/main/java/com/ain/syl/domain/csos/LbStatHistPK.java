package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the LB_STAT_HIST database table.
 * 
 */
@Embeddable
public class LbStatHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="UPDATE_DAY", unique=true, nullable=false, length=8)
	private String updateDay;

	@Column(name="UPDATE_TIME", unique=true, nullable=false, length=6)
	private String updateTime;

	public LbStatHistPK() {
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
	public String getUpdateDay() {
		return this.updateDay;
	}
	public void setUpdateDay(String updateDay) {
		this.updateDay = updateDay;
	}
	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LbStatHistPK)) {
			return false;
		}
		LbStatHistPK castOther = (LbStatHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.updateDay.equals(castOther.updateDay)
			&& this.updateTime.equals(castOther.updateTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.updateDay.hashCode();
		hash = hash * prime + this.updateTime.hashCode();
		
		return hash;
	}
}