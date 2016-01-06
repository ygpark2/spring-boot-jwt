package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the PROGRAM_DL_HIST database table.
 * 
 */
@Entity
@Table(name="PROGRAM_DL_HIST")
@NamedQuery(name="ProgramDlHist.findAll", query="SELECT p FROM ProgramDlHist p")
public class ProgramDlHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProgramDlHistPK id;

	@Column(name="MAKER", length=2)
	private String maker;

	@Column(name="PROGRAM_NAME", length=50)
	private String programName;

	@Column(name="PROGRAM_VER", length=20)
	private String programVer;

	public ProgramDlHist() {
	}

	public ProgramDlHistPK getId() {
		return this.id;
	}

	public void setId(ProgramDlHistPK id) {
		this.id = id;
	}

	public String getMaker() {
		return this.maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
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

}