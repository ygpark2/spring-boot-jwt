package com.ain.syl.domain.csos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the COM_CD database table.
 * 
 */
@Entity
@Table(name="COM_CD")
@NamedQuery(name="ComCd.findAll", query="SELECT c FROM ComCd c")
public class ComCd implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComCdPK id;

	@Column(name="CD_DESC", length=255)
	private String cdDesc;

	@Column(name="CD_NM", length=20)
	private String cdNm;

	@Temporal(TemporalType.DATE)
	@Column(name="DEL_DATE")
	private Date delDate;

	@Column(name="DEL_YN", length=1)
	private String delYn;

	@Column(name="ITEM1", length=20)
	private String item1;

	@Column(name="ITEM2", length=20)
	private String item2;

	@Column(name="ITEM3", length=20)
	private String item3;

	@Column(name="ITEM4", length=20)
	private String item4;

	@Column(name="ITEM5", length=20)
	private String item5;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATETIME")
	private Date updateDatetime;

	public ComCd() {
	}

	public ComCdPK getId() {
		return this.id;
	}

	public void setId(ComCdPK id) {
		this.id = id;
	}

	public String getCdDesc() {
		return this.cdDesc;
	}

	public void setCdDesc(String cdDesc) {
		this.cdDesc = cdDesc;
	}

	public String getCdNm() {
		return this.cdNm;
	}

	public void setCdNm(String cdNm) {
		this.cdNm = cdNm;
	}

	public Date getDelDate() {
		return this.delDate;
	}

	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}

	public String getDelYn() {
		return this.delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return this.item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return this.item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return this.item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return this.item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}