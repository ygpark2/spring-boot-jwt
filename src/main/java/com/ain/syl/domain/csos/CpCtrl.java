package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the CP_CTRL database table.
 * 
 */
@Entity
@Table(name="CP_CTRL")
@NamedQuery(name="CpCtrl.findAll", query="SELECT c FROM CpCtrl c")
public class CpCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CpCtrlPK id;

	@Column(name="CTRL_CODE", length=10)
	private String ctrlCode;

	@Lob
	@Column(name="CTRL_PARAMETER", columnDefinition="blob")
	private byte[] ctrlParameter;

	@Column(name="REGST", length=20)
	private String regst;

	@Column(name="TRANS_YN", length=1)
	private String transYn;

	//bi-directional many-to-one association to OutletStat
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="EQP_NUM", referencedColumnName="EQP_NUM", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="OUTLET_NUM", referencedColumnName="OUTLET_NUM", nullable=false, insertable=false, updatable=false)
		})
	private OutletStat outletStat;

	public CpCtrl() {
	}

	public CpCtrlPK getId() {
		return this.id;
	}

	public void setId(CpCtrlPK id) {
		this.id = id;
	}

	public String getCtrlCode() {
		return this.ctrlCode;
	}

	public void setCtrlCode(String ctrlCode) {
		this.ctrlCode = ctrlCode;
	}

	public byte[] getCtrlParameter() {
		return this.ctrlParameter;
	}

	public void setCtrlParameter(byte[] ctrlParameter) {
		this.ctrlParameter = ctrlParameter;
	}

	public String getRegst() {
		return this.regst;
	}

	public void setRegst(String regst) {
		this.regst = regst;
	}

	public String getTransYn() {
		return this.transYn;
	}

	public void setTransYn(String transYn) {
		this.transYn = transYn;
	}

	public OutletStat getOutletStat() {
		return this.outletStat;
	}

	public void setOutletStat(OutletStat outletStat) {
		this.outletStat = outletStat;
	}

}