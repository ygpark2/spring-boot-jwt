package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;

/**
 * The primary key class for the UCOST_DL_HIST database table.
 * 
 */
@Embeddable
public class UcostDlHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="UCOST_NUM", unique=true, nullable=false, length=10)
	private String ucostNum;

	@Column(name="HH24", unique=true, nullable=false)
	private Integer hh24;

	@Column(name="INTERVAL_NO", unique=true, nullable=false)
	private Integer intervalNo;

	@Column(name="PROTOCOL_TP", unique=true, nullable=false)
	private Integer protocolTp;

	@Column(name="EQP_TP", unique=true, nullable=false, length=1)
	private String eqpTp;

	@Column(name="UCOST_TP", unique=true, nullable=false)
	private Integer ucostTp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DL_DATETIME", unique=true, nullable=false)
	private java.util.Date dlDatetime;

	public UcostDlHistPK() {
	}
	public Integer getEqpNum() {
		return this.eqpNum;
	}
	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}
	public String getUcostNum() {
		return this.ucostNum;
	}
	public void setUcostNum(String ucostNum) {
		this.ucostNum = ucostNum;
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
	public Integer getProtocolTp() {
		return this.protocolTp;
	}
	public void setProtocolTp(Integer protocolTp) {
		this.protocolTp = protocolTp;
	}
	public String getEqpTp() {
		return this.eqpTp;
	}
	public void setEqpTp(String eqpTp) {
		this.eqpTp = eqpTp;
	}
	public Integer getUcostTp() {
		return this.ucostTp;
	}
	public void setUcostTp(Integer ucostTp) {
		this.ucostTp = ucostTp;
	}
	public java.util.Date getDlDatetime() {
		return this.dlDatetime;
	}
	public void setDlDatetime(java.util.Date dlDatetime) {
		this.dlDatetime = dlDatetime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UcostDlHistPK)) {
			return false;
		}
		UcostDlHistPK castOther = (UcostDlHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& this.ucostNum.equals(castOther.ucostNum)
			&& (this.hh24 == castOther.hh24)
			&& (this.intervalNo == castOther.intervalNo)
			&& (this.protocolTp == castOther.protocolTp)
			&& (this.eqpTp == castOther.eqpTp)
			&& (this.ucostTp == castOther.ucostTp)
			&& this.dlDatetime.equals(castOther.dlDatetime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.ucostNum.hashCode();
		hash = hash * prime + this.hh24;
		hash = hash * prime + this.intervalNo;
		hash = hash * prime + this.protocolTp;
		hash = hash * prime + this.eqpTp.hashCode();
		hash = hash * prime + this.ucostTp;
		hash = hash * prime + this.dlDatetime.hashCode();
		
		return hash;
	}
}