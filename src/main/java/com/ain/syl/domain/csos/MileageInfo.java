package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the MILEAGE_INFO database table.
 * 
 */
@Entity
@Table(name="MILEAGE_INFO")
@NamedQuery(name="MileageInfo.findAll", query="SELECT m FROM MileageInfo m")
public class MileageInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MileageInfoPK id;

	@Column(name="INFRA_MILEAGE", precision=6, scale=2)
	private BigDecimal infraMileage;

	@Column(name="KWH_MILEAGE", precision=6, scale=2)
	private BigDecimal kwhMileage;

	@Column(name="MILEAGE", precision=6, scale=2)
	private BigDecimal mileage;

	@Column(name="MILEAGE_RSN", length=2)
	private String mileageRsn;

	@Column(name="SVC_MILEAGE", precision=6, scale=2)
	private BigDecimal svcMileage;

	@Column(name="TAX", precision=6, scale=2)
	private BigDecimal tax;

	public MileageInfo() {
	}

	public MileageInfoPK getId() {
		return this.id;
	}

	public void setId(MileageInfoPK id) {
		this.id = id;
	}

	public BigDecimal getInfraMileage() {
		return this.infraMileage;
	}

	public void setInfraMileage(BigDecimal infraMileage) {
		this.infraMileage = infraMileage;
	}

	public BigDecimal getKwhMileage() {
		return this.kwhMileage;
	}

	public void setKwhMileage(BigDecimal kwhMileage) {
		this.kwhMileage = kwhMileage;
	}

	public BigDecimal getMileage() {
		return this.mileage;
	}

	public void setMileage(BigDecimal mileage) {
		this.mileage = mileage;
	}

	public String getMileageRsn() {
		return this.mileageRsn;
	}

	public void setMileageRsn(String mileageRsn) {
		this.mileageRsn = mileageRsn;
	}

	public BigDecimal getSvcMileage() {
		return this.svcMileage;
	}

	public void setSvcMileage(BigDecimal svcMileage) {
		this.svcMileage = svcMileage;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

}