package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;

/**
 * The primary key class for the SMS_INF_HIST database table.
 * 
 */
@Embeddable
public class SmsInfHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MEMBER_NO", unique=true, nullable=false)
	private Integer memberNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SEND_DATETIME", unique=true, nullable=false)
	private java.util.Date sendDatetime;

	public SmsInfHistPK() {
	}
	public Integer getMemberNo() {
		return this.memberNo;
	}
	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}
	public java.util.Date getSendDatetime() {
		return this.sendDatetime;
	}
	public void setSendDatetime(java.util.Date sendDatetime) {
		this.sendDatetime = sendDatetime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmsInfHistPK)) {
			return false;
		}
		SmsInfHistPK castOther = (SmsInfHistPK)other;
		return 
			(this.memberNo == castOther.memberNo)
			&& this.sendDatetime.equals(castOther.sendDatetime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.memberNo;
		hash = hash * prime + this.sendDatetime.hashCode();
		
		return hash;
	}
}