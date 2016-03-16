package com.dernekys.mbean.demirbas;

import java.sql.Date;

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
@Table(name="Demirbaþlar Tablosu")
public class Demirbaslar extends EBase {
	
	private static final long serialVersionUID =556;
	
	private int id;
	private int adet;
	private String renk;
	private String ozellik;
	private String marka;
	private String model;
	private String tasinirlik;
	private String yer;
	private String odunc;
	private java.util.Date ilkTarih;
	private String notlar;
	private String durum;

	@Id
	@GeneratedValue(generator = "seq_demirbas", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_demirbas", sequenceName = "seq_demirbas", allocationSize = 1, initialValue = 1)
	@Column(name = "NO")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Ýsim-Ýþlev", length = 20)
	public String getOzellik() {
		return ozellik;
	}

	public void setOzellik(String ozellik) {
		this.ozellik = ozellik;
	}

	@Column(name = "Adet")
	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	@Column(name = "Renk", length = 20)
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	@Column(name = "Marka", length = 30)
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Column(name = "Model", length = 40)
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "Taþýnýrlýk", length = 40)
	public String getTasinirlik() {
		return tasinirlik;
	}

	public void setTasinirlik(String tasinirlik) {
		this.tasinirlik = tasinirlik;
	}

	@Column(name = "Yeri", length = 100)
	public String getYer() {
		return yer;
	}

	public void setYer(String yer) {
		this.yer = yer;
	}

	@Column(name = "Kimde - Nerede", length = 100)
	public String getOdunc() {
		return odunc;
	}

	public void setOdunc(String odunc) {
		this.odunc = odunc;
	}

	@Column(name = "Alýnma Tarihi", length = 100)
	@Temporal(TemporalType.DATE)
	public java.util.Date getIlkTarih() {
		return ilkTarih;
	}

	public void setIlkTarih(Date ilkTarih) {
		this.ilkTarih = ilkTarih;
	}

	@Column(name = "Notlar", length = 150)
	public String getNotlar() {
		return notlar;
	}

	public void setNotlar(String notlar) {
		this.notlar = notlar;
	}

	@Column(name = "Durum", length = 30)
	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}
}
