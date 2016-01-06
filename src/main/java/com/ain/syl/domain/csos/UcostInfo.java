package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the UCOST_INFO database table.
 * 
 */
@Entity
@Table(name="UCOST_INFO")
@NamedQuery(name="UcostInfo.findAll", query="SELECT u FROM UcostInfo u")
public class UcostInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UcostInfoPK id;

	@Column(name="INFRA_UCOST", precision=6, scale=2)
	private BigDecimal infraUcost;

	@Column(name="KWH_UCOST", precision=6, scale=2)
	private BigDecimal kwhUcost;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REGST_DATETIME")
	private Date regstDatetime;

	@Column(name="SVC_UCOST", precision=6, scale=2)
	private BigDecimal svcUcost;

	//bi-directional many-to-one association to ProtocolInfo
	@ManyToOne
	@JoinColumn(name="PROTOCOL_TYPE", nullable=false, insertable=false, updatable=false)
	private ProtocolInfo protocolInfo;

	public UcostInfo() {
	}

	public UcostInfoPK getId() {
		return this.id;
	}

	public void setId(UcostInfoPK id) {
		this.id = id;
	}

	public BigDecimal getInfraUcost() {
		return this.infraUcost;
	}

	public void setInfraUcost(BigDecimal infraUcost) {
		this.infraUcost = infraUcost;
	}

	public BigDecimal getKwhUcost() {
		return this.kwhUcost;
	}

	public void setKwhUcost(BigDecimal kwhUcost) {
		this.kwhUcost = kwhUcost;
	}

	public Date getRegstDatetime() {
		return this.regstDatetime;
	}

	public void setRegstDatetime(Date regstDatetime) {
		this.regstDatetime = regstDatetime;
	}

	public BigDecimal getSvcUcost() {
		return this.svcUcost;
	}

	public void setSvcUcost(BigDecimal svcUcost) {
		this.svcUcost = svcUcost;
	}

	public ProtocolInfo getProtocolInfo() {
		return this.protocolInfo;
	}

	public void setProtocolInfo(ProtocolInfo protocolInfo) {
		this.protocolInfo = protocolInfo;
	}

}