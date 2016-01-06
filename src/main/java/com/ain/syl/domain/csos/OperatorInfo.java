package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the OPERATOR_INFO database table.
 * 
 */
@Entity
@Table(name="OPERATOR_INFO")
@NamedQuery(name="OperatorInfo.findAll", query="SELECT o FROM OperatorInfo o")
public class OperatorInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SYSTEM_USER_ID", unique=true, nullable=false, length=20)
	private String systemUserId;

	@Column(name="ADDRESS", length=100)
	private String address;

	@Column(name="CELLPHONE", length=13)
	private String cellphone;

	@Column(name="DEL_DATE", length=8)
	private String delDate;

	@Column(name="DEL_USER", length=20)
	private String delUser;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="DEPARTMENT", length=50)
	private String department;

	@Column(name="EMAIL", length=50)
	private String email;

	@Column(name="GRT", length=1)
	private String grt;

	@Column(name="MAILORDER", length=8)
	private String mailorder;

	@Column(name="NAME", length=20)
	private String name;

	@Column(name="PASSWORD", length=50)
	private String password;

	@Column(name="PHONE", length=13)
	private String phone;

	@Column(name="REG_DATE", length=8)
	private String regDate;

	@Column(name="REG_TYPE")
	private Integer regType;

	@Column(name="REG_USER", length=20)
	private String regUser;

	//bi-directional many-to-one association to ServiceSystemInfo
	@ManyToOne
	@JoinColumn(name="SERVICE_ID")
	private ServiceSystemInfo serviceSystemInfo;

	public OperatorInfo() {
	}

	public String getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(String systemUserId) {
		this.systemUserId = systemUserId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
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

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrt() {
		return this.grt;
	}

	public void setGrt(String grt) {
		this.grt = grt;
	}

	public String getMailorder() {
		return this.mailorder;
	}

	public void setMailorder(String mailorder) {
		this.mailorder = mailorder;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public ServiceSystemInfo getServiceSystemInfo() {
		return this.serviceSystemInfo;
	}

	public void setServiceSystemInfo(ServiceSystemInfo serviceSystemInfo) {
		this.serviceSystemInfo = serviceSystemInfo;
	}

}