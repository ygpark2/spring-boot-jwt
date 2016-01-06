package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SYSTEM_INFO database table.
 * 
 */
@Entity
@Table(name="SYSTEM_INFO")
@NamedQuery(name="SystemInfo.findAll", query="SELECT s FROM SystemInfo s")
public class SystemInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OPS_ID", unique=true, nullable=false)
	private Integer opsId;

	@Column(name="AUTHKEY", length=20)
	private String authkey;

	@Temporal(TemporalType.DATE)
	@Column(name="DEL_DAY")
	private Date delDay;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="IP", length=15)
	private String ip;

	@Column(name="RCV_ID", length=20)
	private String rcvId;

	@Column(name="SESSION_ID", length=20)
	private String sessionId;

	@Column(name="SYSTEM_NM", length=50)
	private String systemNm;

	//bi-directional many-to-one association to CommUrlInfo
	@OneToMany(mappedBy="systemInfo")
	private List<CommUrlInfo> commUrlInfos;

	public SystemInfo() {
	}

	public Integer getOpsId() {
		return this.opsId;
	}

	public void setOpsId(Integer opsId) {
		this.opsId = opsId;
	}

	public String getAuthkey() {
		return this.authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public Date getDelDay() {
		return this.delDay;
	}

	public void setDelDay(Date delDay) {
		this.delDay = delDay;
	}

	public String getDelYn() {
		return this.delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getRcvId() {
		return this.rcvId;
	}

	public void setRcvId(String rcvId) {
		this.rcvId = rcvId;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSystemNm() {
		return this.systemNm;
	}

	public void setSystemNm(String systemNm) {
		this.systemNm = systemNm;
	}

	public List<CommUrlInfo> getCommUrlInfos() {
		return this.commUrlInfos;
	}

	public void setCommUrlInfos(List<CommUrlInfo> commUrlInfos) {
		this.commUrlInfos = commUrlInfos;
	}

	public CommUrlInfo addCommUrlInfo(CommUrlInfo commUrlInfo) {
		getCommUrlInfos().add(commUrlInfo);
		commUrlInfo.setSystemInfo(this);

		return commUrlInfo;
	}

	public CommUrlInfo removeCommUrlInfo(CommUrlInfo commUrlInfo) {
		getCommUrlInfos().remove(commUrlInfo);
		commUrlInfo.setSystemInfo(null);

		return commUrlInfo;
	}

}