package com.dernekys.entity.demirbas;

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
@Table(name = "demirbas")
public class Demirbas extends EBase {

	private int id;
	private int adet;
	private String marka;
	private String model;
	private String yer;		
	private Date verilme;
	private String odunc;
	private String ozellik;

	@Id
	@GeneratedValue(generator = "seq_demirbas", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, sequenceName = "seq_demirbas", name = "seq_demirbas")
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "adet")
	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}
	@Column(name = "marka")
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	@Column(name = "model")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	@Column(name = "yer")
	public String getYer() {
		return yer;
	}

	public void setYer(String yer) {
		this.yer = yer;
	}
	@Column(name = "verilme")
	@Temporal(TemporalType.DATE)
	public Date getVerilme() {
		return verilme;
	}

	public void setVerilme(Date verilme) {
		this.verilme = verilme;
	}
	@Column(name = "odunc")
	public String getOdunc() {
		return odunc;
	}

	public void setOdunc(String odunc) {
		this.odunc = odunc;
	}
	@Column(name = "ozellik")
	public String getOzellik() {
		return ozellik;
	}

	public void setOzellik(String ozellik) {
		this.ozellik = ozellik;
	}

}
