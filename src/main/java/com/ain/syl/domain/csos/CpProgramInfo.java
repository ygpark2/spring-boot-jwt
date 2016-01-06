package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the CP_PROGRAM_INFO database table.
 * 
 */
@Entity
@Table(name="CP_PROGRAM_INFO")
@NamedQuery(name="CpProgramInfo.findAll", query="SELECT c FROM CpProgramInfo c")
public class CpProgramInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROGRAM_NUM", unique=true, nullable=false)
	private Integer programNum;

	@Column(name="PAROGRAM_PATH", length=100)
	private String parogramPath;

	@Column(name="PROGRAM_NAME", length=50)
	private String programName;

	@Column(name="PROGRAM_VER", length=20)
	private String programVer;

	//bi-directional many-to-one association to CpCompanyInfo
	@ManyToOne
	@JoinColumn(name="MAKER")
	private CpCompanyInfo cpCompanyInfo;

	public CpProgramInfo() {
	}

	public Integer getProgramNum() {
		return this.programNum;
	}

	public void setProgramNum(Integer programNum) {
		this.programNum = programNum;
	}

	public String getParogramPath() {
		return this.parogramPath;
	}

	public void setParogramPath(String parogramPath) {
		this.parogramPath = parogramPath;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getProgramVer() {
		return this.programVer;
	}

	public void setProgramVer(String programVer) {
		this.programVer = programVer;
	}

	public CpCompanyInfo getCpCompanyInfo() {
		return this.cpCompanyInfo;
	}

	public void setCpCompanyInfo(CpCompanyInfo cpCompanyInfo) {
		this.cpCompanyInfo = cpCompanyInfo;
	}

}