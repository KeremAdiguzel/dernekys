
package com.dernekys.mbean.duyuru;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.dernekys.entity.duyuru.Duyuru;
import com.dernekys.service.duyuru.DuyuruService;

//Gülden
@ManagedBean(name = "duyuruBean")
@ViewScoped
public class DuyuruBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5744749378898168824L;
	private List<Duyuru> duyuruListe;
	private DuyuruService duyuruService;

	@PostConstruct
	public void init() {
		duyuruService = new DuyuruService();
		duyuruListe = new ArrayList<Duyuru>();

		duyuruListe = duyuruService.getAll();
	}

	public List<Duyuru> getDuyuruListe() {
		return duyuruListe;
	}

	public void setDuyuruListe(List<Duyuru> duyuruListe) {
		this.duyuruListe = duyuruListe;
	}

	

}
