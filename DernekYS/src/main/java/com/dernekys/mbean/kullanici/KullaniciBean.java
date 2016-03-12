package com.dernekys.mbean.kullanici;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//temelt
@ManagedBean(name="kullaniciBean")
@ViewScoped
public class KullaniciBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4888413859138119288L;
	
	private String mesaj;
	
	public void mesajVer() {
	System.out.println("Týklandý");

	}
	
	public String getMesaj() {
		return mesaj;
	}
}
