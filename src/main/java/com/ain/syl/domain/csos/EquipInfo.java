package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the EQUIP_INFO database table.
 * 
 */
@Entity
@Table(name="EQUIP_INFO")
@NamedQuery(name="EquipInfo.findAll", query="SELECT e FROM EquipInfo e")
public class EquipInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="ALTER_DATE", length=8)
	private String alterDate;

	@Column(name="ALTER_REASON", length=100)
	private String alterReason;

	@Column(name="ALTER_USER", length=20)
	private String alterUser;

	@Column(name="AUTH_KEY", length=20)
	private String authKey;

	@Column(name="CHARGING_CAPACITY",  precision=8, scale=4)
	private BigDecimal chargingCapacity;

	@Column(name="CP_NAME", length=50)
	private String cpName;

	@Column(name="DEL_DATE", length=8)
	private String delDate;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="EQP_ID", length=20)
	private String eqpId;

	@Column(name="EQP_TYPE")
	private Integer eqpType;

	@Column(name="IP", length=15)
	private String ip;

	@Column(name="LATITUDE", length=20)
	private String latitude;

	@Column(name="LONGITUDE", length=20)
	private String longitude;

	@Column(name="MAKE_DATE", length=8)
	private String makeDate;

	@Column(name="NET_CONN_TYPE", length=20)
	private String netConnType;

	@Lob
	@Column(name="OP_DATA", columnDefinition="blob")
	private byte[] opData;

	@Column(name="OPS_NUM")
	private Integer opsNum;

	@Column(name="OUTLET_COUNT")
	private Integer outletCount;

	@Column(name="PORT")
	private Integer port;

	@Column(name="REG_DATE", length=8)
	private String regDate;

	@Column(name="REG_TYPE")
	private Integer regType;

	@Column(name="REG_USER", length=20)
	private String regUser;

	@Column(name="TRANS_TYPE")
	private Integer transType;

	@Column(name="V2G_TYPE")
	private Integer v2gType;

	//bi-directional many-to-one association to CpCompanyInfo
	@ManyToOne
	@JoinColumn(name="MAKER")
	private CpCompanyInfo cpCompanyInfo;

	//bi-directional many-to-one association to CsInfo
	@ManyToOne
	@JoinColumn(name="CS_NUM", nullable=false)
	private CsInfo csInfo;

	//bi-directional many-to-one association to ProtocolInfo
	@ManyToOne
	@JoinColumn(name="PROTOCOL_TYPE", nullable=false)
	private ProtocolInfo protocolInfo;

	//bi-directional many-to-one association to OutletInfo
	@OneToMany(mappedBy="equipInfo")
	private List<OutletInfo> outletInfos;

	public EquipInfo() {
	}

	public Integer getEqpNum() {
		return this.eqpNum;
	}

	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}

	public String getAlterDate() {
		return this.alterDate;
	}

	public void setAlterDate(String alterDate) {
		this.alterDate = alterDate;
	}

	public String getAlterReason() {
		return this.alterReason;
	}

	public void setAlterReason(String alterReason) {
		this.alterReason = alterReason;
	}

	public String getAlterUser() {
		return this.alterUser;
	}

	public void setAlterUser(String alterUser) {
		this.alterUser = alterUser;
	}

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public BigDecimal getChargingCapacity() {
		return this.chargingCapacity;
	}

	public void setChargingCapacity(BigDecimal chargingCapacity) {
		this.chargingCapacity = chargingCapacity;
	}

	public String getCpName() {
		return this.cpName;
	}

	public void setCpName(String cpName) {
		this.cpName = cpName;
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

	public String getEqpId() {
		return this.eqpId;
	}

	public void setEqpId(String eqpId) {
		this.eqpId = eqpId;
	}

	public Integer getEqpType() {
		return this.eqpType;
	}

	public void setEqpType(Integer eqpType) {
		this.eqpType = eqpType;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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

	public String getMakeDate() {
		return this.makeDate;
	}

	public void setMakeDate(String makeDate) {
		this.makeDate = makeDate;
	}

	public String getNetConnType() {
		return this.netConnType;
	}

	public void setNetConnType(String netConnType) {
		this.netConnType = netConnType;
	}

	public byte[] getOpData() {
		return this.opData;
	}

	public void setOpData(byte[] opData) {
		this.opData = opData;
	}

	public Integer getOpsNum() {
		return this.opsNum;
	}

	public void setOpsNum(Integer opsNum) {
		this.opsNum = opsNum;
	}

	public Integer getOutletCount() {
		return this.outletCount;
	}

	public void setOutletCount(Integer outletCount) {
		this.outletCount = outletCount;
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getRegDate() {
		return this.regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public Integer getRegType() {
		return this.regType;
	}

	public void setRegType(Integer regType) {
		this.regType = regType;
	}

	public String getRegUser() {
		return this.regUser;
	}

	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}

	public Integer getTransType() {
		return this.transType;
	}

	public void setTransType(Integer transType) {
		this.transType = transType;
	}

	public Integer getV2gType() {
		return this.v2gType;
	}

	public void setV2gType(Integer v2gType) {
		this.v2gType = v2gType;
	}

	public CpCompanyInfo getCpCompanyInfo() {
		return this.cpCompanyInfo;
	}

	public void setCpCompanyInfo(CpCompanyInfo cpCompanyInfo) {
		this.cpCompanyInfo = cpCompanyInfo;
	}

	public CsInfo getCsInfo() {
		return this.csInfo;
	}

	public void setCsInfo(CsInfo csInfo) {
		this.csInfo = csInfo;
	}

	public ProtocolInfo getProtocolInfo() {
		return this.protocolInfo;
	}

	public void setProtocolInfo(ProtocolInfo protocolInfo) {
		this.protocolInfo = protocolInfo;
	}

	public List<OutletInfo> getOutletInfos() {
		return this.outletInfos;
	}

	public void setOutletInfos(List<OutletInfo> outletInfos) {
		this.outletInfos = outletInfos;
	}

	public OutletInfo addOutletInfo(OutletInfo outletInfo) {
		getOutletInfos().add(outletInfo);
		outletInfo.setEquipInfo(this);

		return outletInfo;
	}

	public OutletInfo removeOutletInfo(OutletInfo outletInfo) {
		getOutletInfos().remove(outletInfo);
		outletInfo.setEquipInfo(null);

		return outletInfo;
	}

}