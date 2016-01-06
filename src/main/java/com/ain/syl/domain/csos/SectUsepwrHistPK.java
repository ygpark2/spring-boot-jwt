package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the SECT_USEPWR_HIST database table.
 * 
 */
@Embeddable
public class SectUsepwrHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="YMD", unique=true, nullable=false, length=8)
	private String ymd;

	@Column(name="HH24", unique=true, nullable=false)
	private Integer hh24;

	@Column(name="INTERVAL_NO", unique=true, nullable=false)
	private Integer intervalNo;

	@Column(name="V2G_YN", unique=true, nullable=false, length=1)
	private String v2gYn;

	public SectUsepwrHistPK() {
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
	public String getYmd() {
		return this.ymd;
	}
	public void setYmd(String ymd) {
		this.ymd = ymd;
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
	public String getV2gYn() {
		return this.v2gYn;
	}
	public void setV2gYn(String v2gYn) {
		this.v2gYn = v2gYn;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SectUsepwrHistPK)) {
			return false;
		}
		SectUsepwrHistPK castOther = (SectUsepwrHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.ymd.equals(castOther.ymd)
			&& (this.hh24 == castOther.hh24)
			&& (this.intervalNo == castOther.intervalNo)
			&& this.v2gYn.equals(castOther.v2gYn);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.ymd.hashCode();
		hash = hash * prime + this.hh24;
		hash = hash * prime + this.intervalNo;
		hash = hash * prime + this.v2gYn.hashCode();
		
		return hash;
	}
}