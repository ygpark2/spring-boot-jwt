package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the B2G_STAT database table.
 * 
 */
@Embeddable
public class B2gStatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	public B2gStatPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof B2gStatPK)) {
			return false;
		}
		B2gStatPK castOther = (B2gStatPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		
		return hash;
	}
}