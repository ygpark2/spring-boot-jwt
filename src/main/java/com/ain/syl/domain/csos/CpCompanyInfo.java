package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the CP_COMPANY_INFO database table.
 * 
 */
@Entity
@Table(name="CP_COMPANY_INFO")
@NamedQuery(name="CpCompanyInfo.findAll", query="SELECT c FROM CpCompanyInfo c")
public class CpCompanyInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MAKER", unique=true, nullable=false, length=2)
	private String maker;

	@Column(name="ADDRESS", length=100)
	private String address;

	@Column(name="FAX", length=15)
	private String fax;

	@Column(name="HOMEPAGE", length=100)
	private String homepage;

	@Column(name="MAILORDER", length=8)
	private String mailorder;

	@Column(name="MAKER_NAME", length=50)
	private String makerName;

	@Column(name="PHONE", length=15)
	private String phone;

	//bi-directional many-to-one association to CpProgramInfo
	@OneToMany(mappedBy="cpCompanyInfo")
	private List<CpProgramInfo> cpProgramInfos;

	//bi-directional many-to-one association to EquipInfo
	@OneToMany(mappedBy="cpCompanyInfo")
	private List<EquipInfo> equipInfos;

	//bi-directional many-to-one association to OutletInfo
	@OneToMany(mappedBy="cpCompanyInfo")
	private List<OutletInfo> outletInfos;

	public CpCompanyInfo() {
	}

	public String getMaker() {
		return this.maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getMailorder() {
		return this.mailorder;
	}

	public void setMailorder(String mailorder) {
		this.mailorder = mailorder;
	}

	public String getMakerName() {
		return this.makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<CpProgramInfo> getCpProgramInfos() {
		return this.cpProgramInfos;
	}

	public void setCpProgramInfos(List<CpProgramInfo> cpProgramInfos) {
		this.cpProgramInfos = cpProgramInfos;
	}

	public CpProgramInfo addCpProgramInfo(CpProgramInfo cpProgramInfo) {
		getCpProgramInfos().add(cpProgramInfo);
		cpProgramInfo.setCpCompanyInfo(this);

		return cpProgramInfo;
	}

	public CpProgramInfo removeCpProgramInfo(CpProgramInfo cpProgramInfo) {
		getCpProgramInfos().remove(cpProgramInfo);
		cpProgramInfo.setCpCompanyInfo(null);

		return cpProgramInfo;
	}

	public List<EquipInfo> getEquipInfos() {
		return this.equipInfos;
	}

	public void setEquipInfos(List<EquipInfo> equipInfos) {
		this.equipInfos = equipInfos;
	}

	public EquipInfo addEquipInfo(EquipInfo equipInfo) {
		getEquipInfos().add(equipInfo);
		equipInfo.setCpCompanyInfo(this);

		return equipInfo;
	}

	public EquipInfo removeEquipInfo(EquipInfo equipInfo) {
		getEquipInfos().remove(equipInfo);
		equipInfo.setCpCompanyInfo(null);

		return equipInfo;
	}

	public List<OutletInfo> getOutletInfos() {
		return this.outletInfos;
	}

	public void setOutletInfos(List<OutletInfo> outletInfos) {
		this.outletInfos = outletInfos;
	}

	public OutletInfo addOutletInfo(OutletInfo outletInfo) {
		getOutletInfos().add(outletInfo);
		outletInfo.setCpCompanyInfo(this);

		return outletInfo;
	}

	public OutletInfo removeOutletInfo(OutletInfo outletInfo) {
		getOutletInfos().remove(outletInfo);
		outletInfo.setCpCompanyInfo(null);

		return outletInfo;
	}

	/*
	static List<ProtocolInfo> getProtocolInfos() {
		return this.protocolInfos;
	}

	static void setProtocolInfos(List<ProtocolInfo> protocolInfos) {
		this.protocolInfos = protocolInfos;
	}

	static ProtocolInfo addProtocolInfo(ProtocolInfo protocolInfo) {
		getProtocolInfos().add(protocolInfo);

		return protocolInfo;
	}

	static ProtocolInfo removeProtocolInfo(ProtocolInfo protocolInfo) {
		getProtocolInfos().remove(protocolInfo);

		return protocolInfo;
	}
	*/

}