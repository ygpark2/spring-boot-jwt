package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the SYSTEM_CNF_INFO database table.
 * 
 */
@Entity
@Table(name="SYSTEM_CNF_INFO")
@NamedQuery(name="SystemCnfInfo.findAll", query="SELECT s FROM SystemCnfInfo s")
public class SystemCnfInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SystemCnfInfoPK id;

	@Column(name="ACTIVE")
	private Integer active;

	@Column(name="CNF_VALUE", length=255)
	private String cnfValue;

	public SystemCnfInfo() {
	}

	public SystemCnfInfoPK getId() {
		return this.id;
	}

	public void setId(SystemCnfInfoPK id) {
		this.id = id;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getCnfValue() {
		return this.cnfValue;
	}

	public void setCnfValue(String cnfValue) {
		this.cnfValue = cnfValue;
	}

}