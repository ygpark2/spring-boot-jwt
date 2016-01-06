package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the CAR_INFO database table.
 * 
 */
@Embeddable
public class CarInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CAR_REG_NUM", unique=true, nullable=false, length=20)
	private String carRegNum;

	@Column(name="MEMBER_NUM", unique=true, nullable=false, length=20)
	private String memberNum;

	public CarInfoPK() {
	}
	public String getCarRegNum() {
		return this.carRegNum;
	}
	public void setCarRegNum(String carRegNum) {
		this.carRegNum = carRegNum;
	}
	public String getMemberNum() {
		return this.memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CarInfoPK)) {
			return false;
		}
		CarInfoPK castOther = (CarInfoPK)other;
		return 
			this.carRegNum.equals(castOther.carRegNum)
			&& this.memberNum.equals(castOther.memberNum);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.carRegNum.hashCode();
		hash = hash * prime + this.memberNum.hashCode();
		
		return hash;
	}
}