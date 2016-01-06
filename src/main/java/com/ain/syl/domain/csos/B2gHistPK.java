package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the B2G_HIST database table.
 * 
 */
@Embeddable
public class B2gHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ST_DAY", unique=true, nullable=false, length=8)
	private String stDay;

	@Column(name="ST_TIME", unique=true, nullable=false, length=6)
	private String stTime;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	public B2gHistPK() {
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
	public Integer getEqpNum() {
		return this.eqpNum;
	}
	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof B2gHistPK)) {
			return false;
		}
		B2gHistPK castOther = (B2gHistPK)other;
		return 
			this.stDay.equals(castOther.stDay)
			&& this.stTime.equals(castOther.stTime)
			&& (this.eqpNum == castOther.eqpNum);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.stDay.hashCode();
		hash = hash * prime + this.stTime.hashCode();
		hash = hash * prime + this.eqpNum;
		
		return hash;
	}
}