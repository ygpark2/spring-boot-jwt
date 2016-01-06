package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the COM_CD database table.
 * 
 */
@Embeddable
public class ComCdPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CL", unique=true, nullable=false, length=10)
	private String cdCl;

	@Column(name="CD", unique=true, nullable=false, length=10)
	private String cd;

	public ComCdPK() {
	}
	public String getCdCl() {
		return this.cdCl;
	}
	public void setCdCl(String cdCl) {
		this.cdCl = cdCl;
	}
	public String getCd() {
		return this.cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ComCdPK)) {
			return false;
		}
		ComCdPK castOther = (ComCdPK)other;
		return 
			this.cdCl.equals(castOther.cdCl)
			&& this.cd.equals(castOther.cd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cdCl.hashCode();
		hash = hash * prime + this.cd.hashCode();
		
		return hash;
	}
}