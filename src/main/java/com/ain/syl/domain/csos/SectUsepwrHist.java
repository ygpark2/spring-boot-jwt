package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SECT_USEPWR_HIST database table.
 * 
 */
@Entity
@Table(name="SECT_USEPWR_HIST")
@NamedQuery(name="SectUsepwrHist.findAll", query="SELECT s FROM SectUsepwrHist s")
public class SectUsepwrHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SectUsepwrHistPK id;

	@Column(name="SECT_KWH", precision=6, scale=4)
	private BigDecimal sectKwh;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATETIME")
	private Date updateDatetime;

	public SectUsepwrHist() {
	}

	public SectUsepwrHistPK getId() {
		return this.id;
	}

	public void setId(SectUsepwrHistPK id) {
		this.id = id;
	}

	public BigDecimal getSectKwh() {
		return this.sectKwh;
	}

	public void setSectKwh(BigDecimal sectKwh) {
		this.sectKwh = sectKwh;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}