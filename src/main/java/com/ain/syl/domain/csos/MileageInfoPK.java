package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;

/**
 * The primary key class for the MILEAGE_INFO database table.
 * 
 */
@Embeddable
public class MileageInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MEMBER_NUM", unique=true, nullable=false, length=20)
	private String memberNum;

	@Column(name="MILEAGE_CL", unique=true, nullable=false, length=1)
	private String mileageCl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SAVE_DATETIME", unique=true, nullable=false)
	private java.util.Date saveDatetime;

	public MileageInfoPK() {
	}
	public String getMemberNum() {
		return this.memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getMileageCl() {
		return this.mileageCl;
	}
	public void setMileageCl(String mileageCl) {
		this.mileageCl = mileageCl;
	}
	public java.util.Date getSaveDatetime() {
		return this.saveDatetime;
	}
	public void setSaveDatetime(java.util.Date saveDatetime) {
		this.saveDatetime = saveDatetime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MileageInfoPK)) {
			return false;
		}
		MileageInfoPK castOther = (MileageInfoPK)other;
		return 
			this.memberNum.equals(castOther.memberNum)
			&& (this.mileageCl == castOther.mileageCl)
			&& this.saveDatetime.equals(castOther.saveDatetime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.memberNum.hashCode();
		hash = hash * prime + this.mileageCl.hashCode();
		hash = hash * prime + this.saveDatetime.hashCode();
		
		return hash;
	}
}