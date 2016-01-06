package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the BUSINESS_INFO database table.
 * 
 */
@Entity
@Table(name="BUSINESS_INFO")
@NamedQuery(name="BusinessInfo.findAll", query="SELECT b FROM BusinessInfo b")
public class BusinessInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BUSINESS_ID", unique=true, nullable=false)
	private Integer businessId;

	@Column(name="ACCOUNT_MONTH")
	private Integer accountMonth;

	@Column(name="ADDRESS", length=100)
	private String address;

	@Column(name="BUSINESS_NAME", length=20)
	private String businessName;

	@Column(name="BUSINESS_NUM", length=20)
	private String businessNum;

	@Column(name="COMPANY_NAME", length=30)
	private String companyName;

	@Column(name="DEL_DATE", length=8)
	private String delDate;

	@Column(name="DEL_USER", length=20)
	private String delUser;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="FAX", length=13)
	private String fax;

	@Column(name="FOUND_DATE", length=8)
	private String foundDate;

	@Column(name="HOMEPAGE", length=100)
	private String homepage;

	@Column(name="MAILORDER", length=8)
	private String mailorder;

	@Column(name="PHONE", length=13)
	private String phone;

	@Column(name="REG_DATE", length=8)
	private String regDate;

	@Column(name="REG_TYPE")
	private Integer regType;

	@Column(name="REG_USER", length=20)
	private String regUser;

	@Column(name="REPRESENTATIVE", length=20)
	private String representative;

	//bi-directional many-to-one association to ServiceSystemInfo
	@ManyToOne
	@JoinColumn(name="SERVICE_ID")
	private ServiceSystemInfo serviceSystemInfo;

	public BusinessInfo() {
	}

	public Integer getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public Integer getAccountMonth() {
		return this.accountMonth;
	}

	public void setAccountMonth(Integer accountMonth) {
		this.accountMonth = accountMonth;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessNum() {
		return this.businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFoundDate() {
		return this.foundDate;
	}

	public void setFoundDate(String foundDate) {
		this.foundDate = foundDate;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getRepresentative() {
		return this.representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

	public ServiceSystemInfo getServiceSystemInfo() {
		return this.serviceSystemInfo;
	}

	public void setServiceSystemInfo(ServiceSystemInfo serviceSystemInfo) {
		this.serviceSystemInfo = serviceSystemInfo;
	}

}