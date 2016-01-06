package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the B2G_STAT_HIST database table.
 * 
 */
@Embeddable
public class B2gStatHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="STAT_UPDATE_DAY", unique=true, nullable=false, length=8)
	private String statUpdateDay;

	@Column(name="STAT_UPDATE_TIME", unique=true, nullable=false, length=6)
	private String statUpdateTime;

	public B2gStatHistPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof B2gStatHistPK)) {
			return false;
		}
		B2gStatHistPK castOther = (B2gStatHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.statUpdateDay.equals(castOther.statUpdateDay)
			&& this.statUpdateTime.equals(castOther.statUpdateTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.statUpdateDay.hashCode();
		hash = hash * prime + this.statUpdateTime.hashCode();
		
		return hash;
	}
}