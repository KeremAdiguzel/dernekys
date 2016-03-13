package com.dernekys.mbean.kullanici;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.dernekys.entity.kullanici.Kullanici;
import com.dernekys.service.kullanici.KullaniciService;


@ManagedBean(name="kullaniciBean")
@ViewScoped
public class KullaniciBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4888413859138119288L;
	
	
	private List<Kullanici> kullaniciListe;
	private KullaniciService kullaniciService;
	
	
	@PostConstruct
	public void init() {
		kullaniciService=new KullaniciService();
		kullaniciListe=new ArrayList<Kullanici>();
		
		kullaniciListe=kullaniciService.getAll();
	}
	
	
	public List<Kullanici> getKullaniciListe() {
		return kullaniciListe;
	}
	
	
}
