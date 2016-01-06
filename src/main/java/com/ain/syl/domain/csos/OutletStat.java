package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the OUTLET_STAT database table.
 * 
 */
@Entity
@Table(name="OUTLET_STAT")
@NamedQuery(name="OutletStat.findAll", query="SELECT o FROM OutletStat o")
public class OutletStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OutletStatPK id;

	@Column(name="CP_ACCUM_KWH")
	private Integer cpAccumKwh;

	@Column(name="EQP_TP")
	private Integer eqpTp;

	@Column(name="OUTLET_STAT")
	private Integer outletStat;

	@Column(name="UPDATE_DAY", length=8)
	private String updateDay;

	@Column(name="UPDATE_TIME", length=6)
	private String updateTime;

	//bi-directional many-to-one association to CpCtrl
	@OneToMany(mappedBy="outletStat")
	private List<CpCtrl> cpCtrls;

	public OutletStat() {
	}

	public OutletStatPK getId() {
		return this.id;
	}

	public void setId(OutletStatPK id) {
		this.id = id;
	}

	public Integer getCpAccumKwh() {
		return this.cpAccumKwh;
	}

	public void setCpAccumKwh(Integer cpAccumKwh) {
		this.cpAccumKwh = cpAccumKwh;
	}

	public Integer getEqpTp() {
		return this.eqpTp;
	}

	public void setEqpTp(Integer eqpTp) {
		this.eqpTp = eqpTp;
	}

	public Integer getOutletStat() {
		return this.outletStat;
	}

	public void setOutletStat(Integer outletStat) {
		this.outletStat = outletStat;
	}

	public String getUpdateDay() {
		return this.updateDay;
	}

	public void setUpdateDay(String updateDay) {
		this.updateDay = updateDay;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<CpCtrl> getCpCtrls() {
		return this.cpCtrls;
	}

	public void setCpCtrls(List<CpCtrl> cpCtrls) {
		this.cpCtrls = cpCtrls;
	}

	public CpCtrl addCpCtrl(CpCtrl cpCtrl) {
		getCpCtrls().add(cpCtrl);
		cpCtrl.setOutletStat(this);

		return cpCtrl;
	}

	public CpCtrl removeCpCtrl(CpCtrl cpCtrl) {
		getCpCtrls().remove(cpCtrl);
		cpCtrl.setOutletStat(null);

		return cpCtrl;
	}

}