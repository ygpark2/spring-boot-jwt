package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the WARNING_STAT database table.
 * 
 */
@Entity
@Table(name="WARNING_STAT")
@NamedQuery(name="WarningStat.findAll", query="SELECT w FROM WarningStat w")
public class WarningStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WarningStatPK id;

	@Column(name="CLOSE_DAY", length=8)
	private String closeDay;

	@Column(name="CLOSE_TIME", length=6)
	private String closeTime;

	@Column(name="WARNING_LEVEL")
	private Integer warningLevel;

	@Column(name="WARNING_STAT")
	private Integer warningStat;

	public WarningStat() {
	}

	public WarningStatPK getId() {
		return this.id;
	}

	public void setId(WarningStatPK id) {
		this.id = id;
	}

	public String getCloseDay() {
		return this.closeDay;
	}

	public void setCloseDay(String closeDay) {
		this.closeDay = closeDay;
	}

	public String getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public Integer getWarningLevel() {
		return this.warningLevel;
	}

	public void setWarningLevel(Integer warningLevel) {
		this.warningLevel = warningLevel;
	}

	public Integer getWarningStat() {
		return this.warningStat;
	}

	public void setWarningStat(Integer warningStat) {
		this.warningStat = warningStat;
	}

}