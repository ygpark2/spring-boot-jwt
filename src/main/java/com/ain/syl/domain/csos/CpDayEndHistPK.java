package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the CP_DAY_END_HIST database table.
 * 
 */
@Embeddable
public class CpDayEndHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="END_DAY", unique=true, nullable=false, length=8)
	private String endDay;

	public CpDayEndHistPK() {
	}
	public Integer getEqpNum() {
		return this.eqpNum;
	}
	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}
	public String getEndDay() {
		return this.endDay;
	}
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CpDayEndHistPK)) {
			return false;
		}
		CpDayEndHistPK castOther = (CpDayEndHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& this.endDay.equals(castOther.endDay);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.endDay.hashCode();
		
		return hash;
	}
}