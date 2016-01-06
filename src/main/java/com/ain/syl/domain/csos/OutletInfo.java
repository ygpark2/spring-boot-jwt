package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the OUTLET_INFO database table.
 * 
 */
@Entity
@Table(name="OUTLET_INFO")
@NamedQuery(name="OutletInfo.findAll", query="SELECT o FROM OutletInfo o")
public class OutletInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OutletInfoPK id;

	@Column(name="OUTLET_TYPE", length=50)
	private String outletType;

	//bi-directional many-to-one association to CpCompanyInfo
	@ManyToOne
	@JoinColumn(name="MAKER")
	private CpCompanyInfo cpCompanyInfo;

	//bi-directional many-to-one association to EquipInfo
	@ManyToOne
	@JoinColumn(name="EQP_NUM", nullable=false, insertable=false, updatable=false)
	private EquipInfo equipInfo;

	public OutletInfo() {
	}

	public OutletInfoPK getId() {
		return this.id;
	}

	public void setId(OutletInfoPK id) {
		this.id = id;
	}

	public String getOutletType() {
		return this.outletType;
	}

	public void setOutletType(String outletType) {
		this.outletType = outletType;
	}

	public CpCompanyInfo getCpCompanyInfo() {
		return this.cpCompanyInfo;
	}

	public void setCpCompanyInfo(CpCompanyInfo cpCompanyInfo) {
		this.cpCompanyInfo = cpCompanyInfo;
	}

	public EquipInfo getEquipInfo() {
		return this.equipInfo;
	}

	public void setEquipInfo(EquipInfo equipInfo) {
		this.equipInfo = equipInfo;
	}

}