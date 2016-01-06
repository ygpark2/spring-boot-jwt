package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the NET_STAT database table.
 * 
 */
@Entity
@Table(name="NET_STAT")
@NamedQuery(name="NetStat.findAll", query="SELECT n FROM NetStat n")
public class NetStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_NET_STAT_DATETIME")
	private Date lastNetStatDatetime;

	@Column(name="MSG_ID", length=16)
	private String msgId;

	@Column(name="NET_STAT", nullable=false)
	private Integer netStat;

	@Column(name="RECEIVER_ID", length=50)
	private String receiverId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECV_DATETIME")
	private Date recvDatetime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SEND_DATETIME")
	private Date sendDatetime;

	@Column(name="SENDER_ID", length=50)
	private String senderId;

	@Column(name="SESSION_ID", length=50)
	private String sessionId;

	@Column(name="STAT")
	private Integer stat;

	public NetStat() {
	}

	public Integer getEqpNum() {
		return this.eqpNum;
	}

	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}

	public Date getLastNetStatDatetime() {
		return this.lastNetStatDatetime;
	}

	public void setLastNetStatDatetime(Date lastNetStatDatetime) {
		this.lastNetStatDatetime = lastNetStatDatetime;
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public Integer getNetStat() {
		return this.netStat;
	}

	public void setNetStat(Integer netStat) {
		this.netStat = netStat;
	}

	public String getReceiverId() {
		return this.receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public Date getRecvDatetime() {
		return this.recvDatetime;
	}

	public void setRecvDatetime(Date recvDatetime) {
		this.recvDatetime = recvDatetime;
	}

	public Date getSendDatetime() {
		return this.sendDatetime;
	}

	public void setSendDatetime(Date sendDatetime) {
		this.sendDatetime = sendDatetime;
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getStat() {
		return this.stat;
	}

	public void setStat(Integer stat) {
		this.stat = stat;
	}

}