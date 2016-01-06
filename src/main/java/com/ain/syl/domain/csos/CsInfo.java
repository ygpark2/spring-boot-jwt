package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the CS_INFO database table.
 * 
 */
@Entity
@Table(name="CS_INFO")
@NamedQuery(name="CsInfo.findAll", query="SELECT c FROM CsInfo c")
public class CsInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CS_NUM", unique=true, nullable=false)
	private Integer csNum;

	@Column(name="CS_ADDRESS", length=100)
	private String csAddress;

	@Column(name="CS_ID", length=20)
	private String csId;

	@Column(name="CS_NAME", length=50)
	private String csName;

	@Column(name="CS_TYPE", length=1)
	private String csType;

	@Column(name="DEL_DATE", length=8)
	private String delDate;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="LATITUDE", length=20)
	private String latitude;

	@Column(name="LONGITUDE", length=20)
	private String longitude;

	//bi-directional many-to-one association to ServiceSystemInfo
	@ManyToOne
	@JoinColumn(name="SERVICE_ID")
	private ServiceSystemInfo serviceSystemInfo;

	//bi-directional many-to-one association to EquipInfo
	@OneToMany(mappedBy="csInfo")
	private List<EquipInfo> equipInfos;

	public CsInfo() {
	}

	public Integer getCsNum() {
		return this.csNum;
	}

	public void setCsNum(Integer csNum) {
		this.csNum = csNum;
	}

	public String getCsAddress() {
		return this.csAddress;
	}

	public void setCsAddress(String csAddress) {
		this.csAddress = csAddress;
	}

	public String getCsId() {
		return this.csId;
	}

	public void setCsId(String csId) {
		this.csId = csId;
	}

	public String getCsName() {
		return this.csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

	public String getCsType() {
		return this.csType;
	}

	public void setCsType(String csType) {
		this.csType = csType;
	}

	public String getDelDate() {
		return this.delDate;
	}

	public void setDelDate(String delDate) {
		this.delDate = delDate;
	}

	public String getDelYn() {
		return this.delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public ServiceSystemInfo getServiceSystemInfo() {
		return this.serviceSystemInfo;
	}

	public void setServiceSystemInfo(ServiceSystemInfo serviceSystemInfo) {
		this.serviceSystemInfo = serviceSystemInfo;
	}

	public List<EquipInfo> getEquipInfos() {
		return this.equipInfos;
	}

	public void setEquipInfos(List<EquipInfo> equipInfos) {
		this.equipInfos = equipInfos;
	}

	public EquipInfo addEquipInfo(EquipInfo equipInfo) {
		getEquipInfos().add(equipInfo);
		equipInfo.setCsInfo(this);

		return equipInfo;
	}

	public EquipInfo removeEquipInfo(EquipInfo equipInfo) {
		getEquipInfos().remove(equipInfo);
		equipInfo.setCsInfo(null);

		return equipInfo;
	}

}