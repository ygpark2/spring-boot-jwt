package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the PROTOCOL_INFO database table.
 * 
 */
@Entity
@Table(name="PROTOCOL_INFO")
@NamedQuery(name="ProtocolInfo.findAll", query="SELECT p FROM ProtocolInfo p")
public class ProtocolInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROTOCOL_TYPE", unique=true, nullable=false)
	private Integer protocolType;

	@Column(name="PROTOCOL_NAME", length=50)
	private String protocolName;

	@Column(name="PROTOCOL_VER", length=20)
	private String protocolVer;

	@Column(name="STANDARD_YN", length=1)
	private String standardYn;

	//bi-directional many-to-one association to EquipInfo
	@OneToMany(mappedBy="protocolInfo")
	private List<EquipInfo> equipInfos;

	//bi-directional many-to-one association to UcostInfo
	@OneToMany(mappedBy="protocolInfo")
	private List<UcostInfo> ucostInfos;

	public ProtocolInfo() {
	}

	public Integer getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(Integer protocolType) {
		this.protocolType = protocolType;
	}

	public String getProtocolName() {
		return this.protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public String getProtocolVer() {
		return this.protocolVer;
	}

	public void setProtocolVer(String protocolVer) {
		this.protocolVer = protocolVer;
	}

	public String getStandardYn() {
		return this.standardYn;
	}

	public void setStandardYn(String standardYn) {
		this.standardYn = standardYn;
	}

	public List<EquipInfo> getEquipInfos() {
		return this.equipInfos;
	}

	public void setEquipInfos(List<EquipInfo> equipInfos) {
		this.equipInfos = equipInfos;
	}

	public EquipInfo addEquipInfo(EquipInfo equipInfo) {
		getEquipInfos().add(equipInfo);
		equipInfo.setProtocolInfo(this);

		return equipInfo;
	}

	public EquipInfo removeEquipInfo(EquipInfo equipInfo) {
		getEquipInfos().remove(equipInfo);
		equipInfo.setProtocolInfo(null);

		return equipInfo;
	}

	public List<UcostInfo> getUcostInfos() {
		return this.ucostInfos;
	}

	public void setUcostInfos(List<UcostInfo> ucostInfos) {
		this.ucostInfos = ucostInfos;
	}

	public UcostInfo addUcostInfo(UcostInfo ucostInfo) {
		getUcostInfos().add(ucostInfo);
		ucostInfo.setProtocolInfo(this);

		return ucostInfo;
	}

	public UcostInfo removeUcostInfo(UcostInfo ucostInfo) {
		getUcostInfos().remove(ucostInfo);
		ucostInfo.setProtocolInfo(null);

		return ucostInfo;
	}

}