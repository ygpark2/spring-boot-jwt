package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the PROGRAM_DL_HIST database table.
 * 
 */
@Embeddable
public class ProgramDlHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="DL_DATE", unique=true, nullable=false, length=14)
	private String dlDate;

	@Column(name="PROGRAM_NUM", unique=true, nullable=false)
	private Integer programNum;

	public ProgramDlHistPK() {
	}
	public Integer getEqpNum() {
		return this.eqpNum;
	}
	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}
	public String getDlDate() {
		return this.dlDate;
	}
	public void setDlDate(String dlDate) {
		this.dlDate = dlDate;
	}
	public Integer getProgramNum() {
		return this.programNum;
	}
	public void setProgramNum(Integer programNum) {
		this.programNum = programNum;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProgramDlHistPK)) {
			return false;
		}
		ProgramDlHistPK castOther = (ProgramDlHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& this.dlDate.equals(castOther.dlDate)
			&& (this.programNum == castOther.programNum);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.dlDate.hashCode();
		hash = hash * prime + this.programNum;
		
		return hash;
	}
}