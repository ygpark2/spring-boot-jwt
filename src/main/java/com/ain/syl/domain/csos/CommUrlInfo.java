package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the COMM_URL_INFO database table.
 * 
 */
@Entity
@Table(name="COMM_URL_INFO")
@NamedQuery(name="CommUrlInfo.findAll", query="SELECT c FROM CommUrlInfo c")
public class CommUrlInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommUrlInfoPK id;

	@Column(name="COMM_URL", length=100)
	private String commUrl;

	//bi-directional many-to-one association to SystemInfo
	@ManyToOne
	@JoinColumn(name="OPS_ID", nullable=false, insertable=false, updatable=false)
	private SystemInfo systemInfo;

	public CommUrlInfo() {
	}

	public CommUrlInfoPK getId() {
		return this.id;
	}

	public void setId(CommUrlInfoPK id) {
		this.id = id;
	}

	public String getCommUrl() {
		return this.commUrl;
	}

	public void setCommUrl(String commUrl) {
		this.commUrl = commUrl;
	}

	public SystemInfo getSystemInfo() {
		return this.systemInfo;
	}

	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

}