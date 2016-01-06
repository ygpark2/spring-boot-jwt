package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the CP_CTRL_HIST database table.
 * 
 */
@Entity
@Table(name="CP_CTRL_HIST")
@NamedQuery(name="CpCtrlHist.findAll", query="SELECT c FROM CpCtrlHist c")
public class CpCtrlHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CpCtrlHistPK id;

	@Column(name="CTRL_CODE", length=10)
	private String ctrlCode;

	@Lob
	@Column(name="CTRL_PARAMETER", columnDefinition="blob")
	private byte[] ctrlParameter;

	@Column(name="REGST", length=20)
	private String regst;

	@Column(name="RSLT_CODE", length=10)
	private String rsltCode;

	@Lob
	@Column(name="RSLT_MSG", columnDefinition="blob")
	private byte[] rsltMsg;

	@Column(name="TRANS_DAY", length=8)
	private String transDay;

	@Column(name="TRANS_TIME", length=6)
	private String transTime;

	public CpCtrlHist() {
	}

	public CpCtrlHistPK getId() {
		return this.id;
	}

	public void setId(CpCtrlHistPK id) {
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

	public String getRsltCode() {
		return this.rsltCode;
	}

	public void setRsltCode(String rsltCode) {
		this.rsltCode = rsltCode;
	}

	public byte[] getRsltMsg() {
		return this.rsltMsg;
	}

	public void setRsltMsg(byte[] rsltMsg) {
		this.rsltMsg = rsltMsg;
	}

	public String getTransDay() {
		return this.transDay;
	}

	public void setTransDay(String transDay) {
		this.transDay = transDay;
	}

	public String getTransTime() {
		return this.transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

}