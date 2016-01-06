package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the CHARGING_USER_INFO database table.
 * 
 */
@Entity
@Table(name="CHARGING_USER_INFO")
@NamedQuery(name="ChargingUserInfo.findAll", query="SELECT c FROM ChargingUserInfo c")
public class ChargingUserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChargingUserInfoPK id;

	@Column(name="AUTH_TYPE", length=1)
	private String authType;

	@Column(name="BILL_CUSTNO", length=10)
	private String billCustno;

	@Column(name="CARD_NUM", length=20)
	private String cardNum;

	@Column(name="ELE_USE_REQ_NM", length=20)
	private String eleUseReqNm;

	@Column(name="MILEAGE", precision=5, scale=0)
	private BigDecimal mileage;

	@Column(name="NAME", length=20)
	private String name;

	@Column(name="PAY_MTHD", length=1)
	private String payMthd;

	@Column(name="PAY_TYPE", length=1)
	private String payType;

	@Column(name="PHONE", length=15)
	private String phone;

	public ChargingUserInfo() {
	}

	public ChargingUserInfoPK getId() {
		return this.id;
	}

	public void setId(ChargingUserInfoPK id) {
		this.id = id;
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getBillCustno() {
		return this.billCustno;
	}

	public void setBillCustno(String billCustno) {
		this.billCustno = billCustno;
	}

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getEleUseReqNm() {
		return this.eleUseReqNm;
	}

	public void setEleUseReqNm(String eleUseReqNm) {
		this.eleUseReqNm = eleUseReqNm;
	}

	public BigDecimal getMileage() {
		return this.mileage;
	}

	public void setMileage(BigDecimal mileage) {
		this.mileage = mileage;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPayMthd() {
		return this.payMthd;
	}

	public void setPayMthd(String payMthd) {
		this.payMthd = payMthd;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}