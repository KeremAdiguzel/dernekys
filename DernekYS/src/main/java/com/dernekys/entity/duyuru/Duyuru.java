package com.dernekys.entity.duyuru;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.dernekys.entity.EBase;
@Entity
@Table(name="duyuru")
public class Duyuru extends EBase {
	private int id;
	private String metin;
	private String baslik;
	private Date duyuruTarihi;

	
	@Id
	@GeneratedValue(generator="seq_duyuru",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_duyuru",sequenceName="seq_duyuru",allocationSize=1,initialValue=1)
	@Column(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="metin",length=100)
	public String getMetin() {
		return metin;
	}

	public void setMetin(String metin) {
		this.metin = metin;
	}
	@Column(name="baslik",length=100)
	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}
	@Column(name="duyuru_tarihi")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDuyuruTarihi() {
		return duyuruTarihi;
	}

	public void setDuyuruTarihi(Date duyuruTarihi) {
		this.duyuruTarihi = duyuruTarihi;
	}

}

