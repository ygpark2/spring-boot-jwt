package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the OUTLET_INFO database table.
 * 
 */
@Embeddable
public class OutletInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="EQP_NUM", insertable=false, updatable=false, unique=true, nullable=false)
	private Integer eqpNum;

	public OutletInfoPK() {
	}
	public Integer getOutletNum() {
		return this.outletNum;
	}
	public void setOutletNum(Integer outletNum) {
		this.outletNum = outletNum;
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
		if (!(other instanceof OutletInfoPK)) {
			return false;
		}
		OutletInfoPK castOther = (OutletInfoPK)other;
		return 
			(this.outletNum == castOther.outletNum)
			&& (this.eqpNum == castOther.eqpNum);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.eqpNum;
		
		return hash;
	}
}