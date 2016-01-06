package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the UCOST_DL_HIST database table.
 * 
 */
@Entity
@Table(name="UCOST_DL_HIST")
@NamedQuery(name="UcostDlHist.findAll", query="SELECT u FROM UcostDlHist u")
public class UcostDlHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UcostDlHistPK id;

	@Column(name="INFRABILL_UCOST", precision=6, scale=2)
	private BigDecimal infrabillUcost;

	@Column(name="KWHBILL_UCOST", precision=6, scale=2)
	private BigDecimal kwhbillUcost;

	@Column(name="SVC_BILL_UCOST", precision=6, scale=2)
	private BigDecimal svcBillUcost;

	public UcostDlHist() {
	}

	public UcostDlHistPK getId() {
		return this.id;
	}

	public void setId(UcostDlHistPK id) {
		this.id = id;
	}

	public BigDecimal getInfrabillUcost() {
		return this.infrabillUcost;
	}

	public void setInfrabillUcost(BigDecimal infrabillUcost) {
		this.infrabillUcost = infrabillUcost;
	}

	public BigDecimal getKwhbillUcost() {
		return this.kwhbillUcost;
	}

	public void setKwhbillUcost(BigDecimal kwhbillUcost) {
		this.kwhbillUcost = kwhbillUcost;
	}

	public BigDecimal getSvcBillUcost() {
		return this.svcBillUcost;
	}

	public void setSvcBillUcost(BigDecimal svcBillUcost) {
		this.svcBillUcost = svcBillUcost;
	}

}