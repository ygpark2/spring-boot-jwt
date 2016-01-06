package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the CAR_INFO database table.
 * 
 */
@Entity
@Table(name="CAR_INFO")
@NamedQuery(name="CarInfo.findAll", query="SELECT c FROM CarInfo c")
public class CarInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CarInfoPK id;

	@Column(name="CAR_BODY_NUM", length=20)
	private String carBodyNum;

	@Column(name="CAR_OWNER_NAME", length=20)
	private String carOwnerName;

	@Column(name="CHARGING_CAPACITY", precision=6, scale=2)
	private BigDecimal chargingCapacity;

	@Column(name="CHARGING_TYPE")
	private String chargingType;

	@Column(name="DEL_DATE", length=8)
	private String delDate;

	@Column(name="DEL_USER", length=20)
	private String delUser;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="DRIVING_TYPE", length=2)
	private String drivingType;

	@Column(name="MIN_CHARGING_RATE", precision=5, scale=2)
	private BigDecimal minChargingRate;

	@Column(name="V2G_TYPE", length=1)
	private String v2gType;

	@Column(name="V2G_YN", length=1)
	private String v2gYn;

	public CarInfo() {
	}

	public CarInfoPK getId() {
		return this.id;
	}

	public void setId(CarInfoPK id) {
		this.id = id;
	}

	public String getCarBodyNum() {
		return this.carBodyNum;
	}

	public void setCarBodyNum(String carBodyNum) {
		this.carBodyNum = carBodyNum;
	}

	public String getCarOwnerName() {
		return this.carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public BigDecimal getChargingCapacity() {
		return this.chargingCapacity;
	}

	public void setChargingCapacity(BigDecimal chargingCapacity) {
		this.chargingCapacity = chargingCapacity;
	}

	public String getChargingType() {
		return this.chargingType;
	}

	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
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

	public String getDrivingType() {
		return this.drivingType;
	}

	public void setDrivingType(String drivingType) {
		this.drivingType = drivingType;
	}

	public BigDecimal getMinChargingRate() {
		return this.minChargingRate;
	}

	public void setMinChargingRate(BigDecimal minChargingRate) {
		this.minChargingRate = minChargingRate;
	}

	public String getV2gType() {
		return this.v2gType;
	}

	public void setV2gType(String v2gType) {
		this.v2gType = v2gType;
	}

	public String getV2gYn() {
		return this.v2gYn;
	}

	public void setV2gYn(String v2gYn) {
		this.v2gYn = v2gYn;
	}

}