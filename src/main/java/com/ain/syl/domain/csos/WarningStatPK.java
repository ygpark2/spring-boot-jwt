package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the WARNING_STAT database table.
 * 
 */
@Embeddable
public class WarningStatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="OCCR_DAY", unique=true, nullable=false, length=8)
	private String occrDay;

	@Column(name="OCCR_TIME", unique=true, nullable=false, length=6)
	private String occrTime;

	@Column(name="WARNING_CD", unique=true, nullable=false, length=4)
	private String warningCd;

	public WarningStatPK() {
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
	public String getOccrDay() {
		return this.occrDay;
	}
	public void setOccrDay(String occrDay) {
		this.occrDay = occrDay;
	}
	public String getOccrTime() {
		return this.occrTime;
	}
	public void setOccrTime(String occrTime) {
		this.occrTime = occrTime;
	}
	public String getWarningCd() {
		return this.warningCd;
	}
	public void setWarningCd(String warningCd) {
		this.warningCd = warningCd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WarningStatPK)) {
			return false;
		}
		WarningStatPK castOther = (WarningStatPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.occrDay.equals(castOther.occrDay)
			&& this.occrTime.equals(castOther.occrTime)
			&& this.warningCd.equals(castOther.warningCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.occrDay.hashCode();
		hash = hash * prime + this.occrTime.hashCode();
		hash = hash * prime + this.warningCd.hashCode();
		
		return hash;
	}
}