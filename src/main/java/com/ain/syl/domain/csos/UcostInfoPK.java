package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the UCOST_INFO database table.
 * 
 */
@Embeddable
public class UcostInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="UCOST_NUM", unique=true, nullable=false, length=10)
	private String ucostNum;

	@Column(name="PROTOCOL_TYPE", insertable=false, updatable=false, unique=true, nullable=false)
	private Integer protocolType;

	@Column(name="HH24", unique=true, nullable=false)
	private Integer hh24;

	@Column(name="INTERVAL_NO", unique=true, nullable=false)
	private Integer intervalNo;

	@Column(name="UCOST_TYPE", unique=true, nullable=false)
	private Integer ucostType;

	@Column(name="EQP_TYPE", length=1, unique=true, nullable=false)
	private String eqpType;

	public UcostInfoPK() {
	}
	public String getUcostNum() {
		return this.ucostNum;
	}
	public void setUcostNum(String ucostNum) {
		this.ucostNum = ucostNum;
	}
	public Integer getProtocolType() {
		return this.protocolType;
	}
	public void setProtocolType(Integer protocolType) {
		this.protocolType = protocolType;
	}
	public Integer getHh24() {
		return this.hh24;
	}
	public void setHh24(Integer hh24) {
		this.hh24 = hh24;
	}
	public Integer getIntervalNo() {
		return this.intervalNo;
	}
	public void setIntervalNo(Integer intervalNo) {
		this.intervalNo = intervalNo;
	}
	public Integer getUcostType() {
		return this.ucostType;
	}
	public void setUcostType(Integer ucostType) {
		this.ucostType = ucostType;
	}
	public String getEqpType() {
		return this.eqpType;
	}
	public void setEqpType(String eqpType) {
		this.eqpType = eqpType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UcostInfoPK)) {
			return false;
		}
		UcostInfoPK castOther = (UcostInfoPK)other;
		return 
			this.ucostNum.equals(castOther.ucostNum)
			&& (this.protocolType == castOther.protocolType)
			&& (this.hh24 == castOther.hh24)
			&& (this.intervalNo == castOther.intervalNo)
			&& (this.ucostType == castOther.ucostType)
			&& (this.eqpType == castOther.eqpType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ucostNum.hashCode();
		hash = hash * prime + this.protocolType;
		hash = hash * prime + this.hh24;
		hash = hash * prime + this.intervalNo;
		hash = hash * prime + this.ucostType;
		hash = hash * prime + this.eqpType.hashCode();
		
		
		return hash;
	}
}