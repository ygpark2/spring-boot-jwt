package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the SMS_INF_HIST database table.
 * 
 */
@Entity
@Table(name="SMS_INF_HIST")
@NamedQuery(name="SmsInfHist.findAll", query="SELECT s FROM SmsInfHist s")
public class SmsInfHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmsInfHistPK id;

	@Column(name="EQP_NUM")
	private Integer eqpNum;

	@Column(name="HPHONENO", length=15)
	private String hphoneno;

	@Column(name="MESSAGE", length=80)
	private String message;

	@Column(name="SEND_LOG", length=255)
	private String sendLog;

	@Column(name="SEND_STAT", length=1)
	private String sendStat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SENT_DATETIME")
	private Date sentDatetime;

	@Column(name="SENT_LOG", length=255)
	private String sentLog;

	@Column(name="SENT_STAT", length=2)
	private String sentStat;

	@Column(name="SMS_ID")
	private Integer smsId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATETIME")
	private Date updateDatetime;

	public SmsInfHist() {
	}

	public SmsInfHistPK getId() {
		return this.id;
	}

	public void setId(SmsInfHistPK id) {
		this.id = id;
	}

	public Integer getEqpNum() {
		return this.eqpNum;
	}

	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}

	public String getHphoneno() {
		return this.hphoneno;
	}

	public void setHphoneno(String hphoneno) {
		this.hphoneno = hphoneno;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSendLog() {
		return this.sendLog;
	}

	public void setSendLog(String sendLog) {
		this.sendLog = sendLog;
	}

	public String getSendStat() {
		return this.sendStat;
	}

	public void setSendStat(String sendStat) {
		this.sendStat = sendStat;
	}

	public Date getSentDatetime() {
		return this.sentDatetime;
	}

	public void setSentDatetime(Date sentDatetime) {
		this.sentDatetime = sentDatetime;
	}

	public String getSentLog() {
		return this.sentLog;
	}

	public void setSentLog(String sentLog) {
		this.sentLog = sentLog;
	}

	public String getSentStat() {
		return this.sentStat;
	}

	public void setSentStat(String sentStat) {
		this.sentStat = sentStat;
	}

	public Integer getSmsId() {
		return this.smsId;
	}

	public void setSmsId(Integer smsId) {
		this.smsId = smsId;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}