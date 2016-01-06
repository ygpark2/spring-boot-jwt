package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the SYSTEM_CNF_INFO database table.
 * 
 */
@Embeddable
public class SystemCnfInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CNF_CL", unique=true, nullable=false, length=40)
	private String cnfCl;

	@Column(name="CNF_HOST", unique=true, nullable=false, length=100)
	private String cnfHost;

	@Column(name="CNF_KEY", unique=true, nullable=false, length=100)
	private String cnfKey;

	public SystemCnfInfoPK() {
	}
	public String getCnfCl() {
		return this.cnfCl;
	}
	public void setCnfCl(String cnfCl) {
		this.cnfCl = cnfCl;
	}
	public String getCnfHost() {
		return this.cnfHost;
	}
	public void setCnfHost(String cnfHost) {
		this.cnfHost = cnfHost;
	}
	public String getCnfKey() {
		return this.cnfKey;
	}
	public void setCnfKey(String cnfKey) {
		this.cnfKey = cnfKey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SystemCnfInfoPK)) {
			return false;
		}
		SystemCnfInfoPK castOther = (SystemCnfInfoPK)other;
		return 
			this.cnfCl.equals(castOther.cnfCl)
			&& this.cnfHost.equals(castOther.cnfHost)
			&& this.cnfKey.equals(castOther.cnfKey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cnfCl.hashCode();
		hash = hash * prime + this.cnfHost.hashCode();
		hash = hash * prime + this.cnfKey.hashCode();
		
		return hash;
	}
}