package com.ain.syl.domain.csos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the COMM_URL_INFO database table.
 * 
 */
@Embeddable
public class CommUrlInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="OPS_ID", insertable=false, updatable=false, unique=true, nullable=false)
	private Integer opsId;

	@Column(name="COMM_NM", unique=true, nullable=false, length=50)
	private String commNm;

	public CommUrlInfoPK() {
	}
	public Integer getOpsId() {
		return this.opsId;
	}
	public void setOpsId(Integer opsId) {
		this.opsId = opsId;
	}
	public String getCommNm() {
		return this.commNm;
	}
	public void setCommNm(String commNm) {
		this.commNm = commNm;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CommUrlInfoPK)) {
			return false;
		}
		CommUrlInfoPK castOther = (CommUrlInfoPK)other;
		return 
			(this.opsId == castOther.opsId)
			&& this.commNm.equals(castOther.commNm);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.opsId;
		hash = hash * prime + this.commNm.hashCode();
		
		return hash;
	}
}