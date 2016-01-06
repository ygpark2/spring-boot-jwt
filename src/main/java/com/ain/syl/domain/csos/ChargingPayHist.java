package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CHARGING_PAY_HIST database table.
 * 
 */
@Entity
@Table(name="CHARGING_PAY_HIST")
@NamedQuery(name="ChargingPayHist.findAll", query="SELECT c FROM ChargingPayHist c")
public class ChargingPayHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChargingPayHistPK id;

	@Column(name="APRV_BILL", precision=5, scale=0)
	private BigDecimal aprvBill;

	@Column(name="BILL_CUST_NO", length=10)
	private String billCustNo;

	@Column(name="CARD_APRV_NUM", length=20)
	private String cardAprvNum;

	@Column(name="CARD_VALID_YYMM", length=4)
	private String cardValidYymm;

	@Column(name="CHARGE_BILL", precision=5, scale=0)
	private BigDecimal chargeBill;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CNCL_DATE")
	private Date cnclDate;

	@Column(name="ELE_USE_REQ_NM", length=20)
	private String eleUseReqNm;

	@Column(name="INFRA_BILL", precision=5, scale=0)
	private BigDecimal infraBill;

	@Column(name="PAY_CARD_NUM", length=20)
	private String payCardNum;

	@Column(name="PAY_STAT", length=2)
	private String payStat;

	@Column(name="SUB_MILEAGE", precision=5, scale=0)
	private BigDecimal subMileage;

	@Column(name="SVC_BILL", precision=5, scale=0)
	private BigDecimal svcBill;

	@Column(name="TAX", precision=5, scale=0)
	private BigDecimal tax;

	public ChargingPayHist() {
	}

	public ChargingPayHistPK getId() {
		return this.id;
	}

	public void setId(ChargingPayHistPK id) {
		this.id = id;
	}

	public BigDecimal getAprvBill() {
		return this.aprvBill;
	}

	public void setAprvBill(BigDecimal aprvBill) {
		this.aprvBill = aprvBill;
	}

	public String getBillCustNo() {
		return this.billCustNo;
	}

	public void setBillCustNo(String billCustNo) {
		this.billCustNo = billCustNo;
	}

	public String getCardAprvNum() {
		return this.cardAprvNum;
	}

	public void setCardAprvNum(String cardAprvNum) {
		this.cardAprvNum = cardAprvNum;
	}

	public String getCardValidYymm() {
		return this.cardValidYymm;
	}

	public void setCardValidYymm(String cardValidYymm) {
		this.cardValidYymm = cardValidYymm;
	}

	public BigDecimal getChargeBill() {
		return this.chargeBill;
	}

	public void setChargeBill(BigDecimal chargeBill) {
		this.chargeBill = chargeBill;
	}

	public Date getCnclDate() {
		return this.cnclDate;
	}

	public void setCnclDate(Date cnclDate) {
		this.cnclDate = cnclDate;
	}

	public String getEleUseReqNm() {
		return this.eleUseReqNm;
	}

	public void setEleUseReqNm(String eleUseReqNm) {
		this.eleUseReqNm = eleUseReqNm;
	}

	public BigDecimal getInfraBill() {
		return this.infraBill;
	}

	public void setInfraBill(BigDecimal infraBill) {
		this.infraBill = infraBill;
	}

	public String getPayCardNum() {
		return this.payCardNum;
	}

	public void setPayCardNum(String payCardNum) {
		this.payCardNum = payCardNum;
	}

	public String getPayStat() {
		return this.payStat;
	}

	public void setPayStat(String payStat) {
		this.payStat = payStat;
	}

	public BigDecimal getSubMileage() {
		return this.subMileage;
	}

	public void setSubMileage(BigDecimal subMileage) {
		this.subMileage = subMileage;
	}

	public BigDecimal getSvcBill() {
		return this.svcBill;
	}

	public void setSvcBill(BigDecimal svcBill) {
		this.svcBill = svcBill;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

}