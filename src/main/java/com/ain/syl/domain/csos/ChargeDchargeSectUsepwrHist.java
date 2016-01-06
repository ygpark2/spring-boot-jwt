package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the CHARGE_DCHARGE_SECT_USEPWR_HIST database table.
 * 
 */
@Entity
@Table(name="CHARGE_DCHARGE_SECT_USEPWR_HIST")
@NamedQuery(name="ChargeDchargeSectUsepwrHist.findAll", query="SELECT c FROM ChargeDchargeSectUsepwrHist c")
public class ChargeDchargeSectUsepwrHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChargeDchargeSectUsepwrHistPK id;

	@Column(name="SECT_INFRA_BILL", precision=8, scale=4)
	private BigDecimal sectInfraBill;

	@Column(name="SECT_INFRA_BILL_UCOST", precision=6, scale=2)
	private BigDecimal sectInfraBillUcost;

	@Column(name="SECT_KWH", precision=6, scale=4)
	private BigDecimal sectKwh;

	@Column(name="SECT_KWHBILL", precision=8, scale=4)
	private BigDecimal sectKwhbill;

	@Column(name="SECT_KWHBILL_UCOST", precision=6, scale=2)
	private BigDecimal sectKwhbillUcost;

	@Column(name="SECT_SVC_BILL", precision=8, scale=4)
	private BigDecimal sectSvcBill;

	@Column(name="SECT_SVC_BILL_UCOST", precision=6, scale=2)
	private BigDecimal sectSvcBillUcost;

	@Column(name="UPDATE_DAY", length=8)
	private String updateDay;

	public ChargeDchargeSectUsepwrHist() {
	}

	public ChargeDchargeSectUsepwrHistPK getId() {
		return this.id;
	}

	public void setId(ChargeDchargeSectUsepwrHistPK id) {
		this.id = id;
	}

	public BigDecimal getSectInfraBill() {
		return this.sectInfraBill;
	}

	public void setSectInfraBill(BigDecimal sectInfraBill) {
		this.sectInfraBill = sectInfraBill;
	}

	public BigDecimal getSectInfraBillUcost() {
		return this.sectInfraBillUcost;
	}

	public void setSectInfraBillUcost(BigDecimal sectInfraBillUcost) {
		this.sectInfraBillUcost = sectInfraBillUcost;
	}

	public BigDecimal getSectKwh() {
		return this.sectKwh;
	}

	public void setSectKwh(BigDecimal sectKwh) {
		this.sectKwh = sectKwh;
	}

	public BigDecimal getSectKwhbill() {
		return this.sectKwhbill;
	}

	public void setSectKwhbill(BigDecimal sectKwhbill) {
		this.sectKwhbill = sectKwhbill;
	}

	public BigDecimal getSectKwhbillUcost() {
		return this.sectKwhbillUcost;
	}

	public void setSectKwhbillUcost(BigDecimal sectKwhbillUcost) {
		this.sectKwhbillUcost = sectKwhbillUcost;
	}

	public BigDecimal getSectSvcBill() {
		return this.sectSvcBill;
	}

	public void setSectSvcBill(BigDecimal sectSvcBill) {
		this.sectSvcBill = sectSvcBill;
	}

	public BigDecimal getSectSvcBillUcost() {
		return this.sectSvcBillUcost;
	}

	public void setSectSvcBillUcost(BigDecimal sectSvcBillUcost) {
		this.sectSvcBillUcost = sectSvcBillUcost;
	}

	public String getUpdateDay() {
		return this.updateDay;
	}

	public void setUpdateDay(String updateDay) {
		this.updateDay = updateDay;
	}

}