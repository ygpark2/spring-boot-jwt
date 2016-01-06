package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;


/**
 * The persistent class for the B2G_HIST database table.
 * 
 */
@Entity
@Table(name="B2G_HIST")
@NamedQuery(name="B2gHist.findAll", query="SELECT b FROM B2gHist b")
public class B2gHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private B2gHistPK id;

	@Column(name="B2G_END_STAT", length=1)
	private String b2gEndStat;

	@Column(name="B2G_KWH", precision=6, scale=2)
	private BigDecimal b2gKwh;

	@Column(name="B2G_TIME")
	private Time b2gTime;

	@Column(name="END_CTRL_MSG_ID", length=16)
	private String endCtrlMsgId;

	@Column(name="END_DAY", length=8)
	private String endDay;

	@Column(name="END_TIME", length=6)
	private String endTime;

	@Column(name="EQP_DAY", length=8)
	private String eqpDay;

	@Column(name="EQP_TIME", length=6)
	private String eqpTime;

	@Column(name="SEND_DAY", length=8)
	private String sendDay;

	@Column(name="SEND_RES_CODE", length=5)
	private String sendResCode;

	@Column(name="SEND_RES_MSG", length=255)
	private String sendResMsg;

	@Column(name="SEND_RSN", length=255)
	private String sendRsn;

	@Column(name="SEND_TIME", length=6)
	private String sendTime;

	@Column(name="SENDER", length=20)
	private String sender;

	@Column(name="ST_CTRL_MSG_ID", length=16)
	private String stCtrlMsgId;

	@Column(name="UPDATE_DAY", length=8)
	private String updateDay;

	@Column(name="UPDATE_TIME", length=6)
	private String updateTime;

	public B2gHist() {
	}

	public B2gHistPK getId() {
		return this.id;
	}

	public void setId(B2gHistPK id) {
		this.id = id;
	}

	public String getB2gEndStat() {
		return this.b2gEndStat;
	}

	public void setB2gEndStat(String b2gEndStat) {
		this.b2gEndStat = b2gEndStat;
	}

	public BigDecimal getB2gKwh() {
		return this.b2gKwh;
	}

	public void setB2gKwh(BigDecimal b2gKwh) {
		this.b2gKwh = b2gKwh;
	}

	public Time getB2gTime() {
		return this.b2gTime;
	}

	public void setB2gTime(Time b2gTime) {
		this.b2gTime = b2gTime;
	}

	public String getEndCtrlMsgId() {
		return this.endCtrlMsgId;
	}

	public void setEndCtrlMsgId(String endCtrlMsgId) {
		this.endCtrlMsgId = endCtrlMsgId;
	}

	public String getEndDay() {
		return this.endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEqpDay() {
		return this.eqpDay;
	}

	public void setEqpDay(String eqpDay) {
		this.eqpDay = eqpDay;
	}

	public String getEqpTime() {
		return this.eqpTime;
	}

	public void setEqpTime(String eqpTime) {
		this.eqpTime = eqpTime;
	}

	public String getSendDay() {
		return this.sendDay;
	}

	public void setSendDay(String sendDay) {
		this.sendDay = sendDay;
	}

	public String getSendResCode() {
		return this.sendResCode;
	}

	public void setSendResCode(String sendResCode) {
		this.sendResCode = sendResCode;
	}

	public String getSendResMsg() {
		return this.sendResMsg;
	}

	public void setSendResMsg(String sendResMsg) {
		this.sendResMsg = sendResMsg;
	}

	public String getSendRsn() {
		return this.sendRsn;
	}

	public void setSendRsn(String sendRsn) {
		this.sendRsn = sendRsn;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getStCtrlMsgId() {
		return this.stCtrlMsgId;
	}

	public void setStCtrlMsgId(String stCtrlMsgId) {
		this.stCtrlMsgId = stCtrlMsgId;
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

}