package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the CHARGING_USER_INFO database table.
 * 
 */
@Embeddable
public class ChargingUserInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MEMBER_NUM", unique=true, nullable=false, length=20)
	private String memberNum;

	@Column(name="MEMBER_TYPE", unique=true, nullable=false)
	private Integer memberType;

	public ChargingUserInfoPK() {
	}
	public String getMemberNum() {
		return this.memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public Integer getMemberType() {
		return this.memberType;
	}
	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChargingUserInfoPK)) {
			return false;
		}
		ChargingUserInfoPK castOther = (ChargingUserInfoPK)other;
		return 
			this.memberNum.equals(castOther.memberNum)
			&& (this.memberType == castOther.memberType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.memberNum.hashCode();
		hash = hash * prime + this.memberType;
		
		return hash;
	}
}