package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the SERVICE_SYSTEM_INFO database table.
 * 
 */
@Entity
@Table(name="SERVICE_SYSTEM_INFO")
@NamedQuery(name="ServiceSystemInfo.findAll", query="SELECT s FROM ServiceSystemInfo s")
public class ServiceSystemInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SERVICE_ID", unique=true, nullable=false)
	private Integer serviceId;

	@Column(name="DEL_DATE", length=8)
	private String delDate;

	@Column(name="DEL_USER", length=20)
	private String delUser;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="REG_DATE", length=8)
	private String regDate;

	@Column(name="REG_TYPE")
	private Integer regType;

	@Column(name="REG_USER", length=20)
	private String regUser;

	@Column(name="SERVICE_NAME", length=50)
	private String serviceName;

	@Column(name="ST_URL", length=100)
	private String stUrl;

	//bi-directional many-to-one association to BusinessInfo
	@OneToMany(mappedBy="serviceSystemInfo")
	private List<BusinessInfo> businessInfos;

	//bi-directional many-to-one association to CsInfo
	@OneToMany(mappedBy="serviceSystemInfo")
	private List<CsInfo> csInfos;

	//bi-directional many-to-one association to OperatorInfo
	@OneToMany(mappedBy="serviceSystemInfo")
	private List<OperatorInfo> operatorInfos;

	public ServiceSystemInfo() {
	}

	public Integer getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getDelDate() {
		return this.delDate;
	}

	public void setDelDate(String delDate) {
		this.delDate = delDate;
	}

	public String getDelUser() {
		return this.delUser;
	}

	public void setDelUser(String delUser) {
		this.delUser = delUser;
	}

	public String getDelYn() {
		return this.delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
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

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStUrl() {
		return this.stUrl;
	}

	public void setStUrl(String stUrl) {
		this.stUrl = stUrl;
	}

	public List<BusinessInfo> getBusinessInfos() {
		return this.businessInfos;
	}

	public void setBusinessInfos(List<BusinessInfo> businessInfos) {
		this.businessInfos = businessInfos;
	}

	public BusinessInfo addBusinessInfo(BusinessInfo businessInfo) {
		getBusinessInfos().add(businessInfo);
		businessInfo.setServiceSystemInfo(this);

		return businessInfo;
	}

	public BusinessInfo removeBusinessInfo(BusinessInfo businessInfo) {
		getBusinessInfos().remove(businessInfo);
		businessInfo.setServiceSystemInfo(null);

		return businessInfo;
	}

	public List<CsInfo> getCsInfos() {
		return this.csInfos;
	}

	public void setCsInfos(List<CsInfo> csInfos) {
		this.csInfos = csInfos;
	}

	public CsInfo addCsInfo(CsInfo csInfo) {
		getCsInfos().add(csInfo);
		csInfo.setServiceSystemInfo(this);

		return csInfo;
	}

	public CsInfo removeCsInfo(CsInfo csInfo) {
		getCsInfos().remove(csInfo);
		csInfo.setServiceSystemInfo(null);

		return csInfo;
	}

	public List<OperatorInfo> getOperatorInfos() {
		return this.operatorInfos;
	}

	public void setOperatorInfos(List<OperatorInfo> operatorInfos) {
		this.operatorInfos = operatorInfos;
	}

	public OperatorInfo addOperatorInfo(OperatorInfo operatorInfo) {
		getOperatorInfos().add(operatorInfo);
		operatorInfo.setServiceSystemInfo(this);

		return operatorInfo;
	}

	public OperatorInfo removeOperatorInfo(OperatorInfo operatorInfo) {
		getOperatorInfos().remove(operatorInfo);
		operatorInfo.setServiceSystemInfo(null);

		return operatorInfo;
	}

}