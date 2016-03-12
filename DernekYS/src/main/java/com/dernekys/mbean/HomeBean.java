package com.dernekys.mbean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name="homeBean")
@ViewScoped
public class HomeBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6139668216506943991L;
	
	
	private String mesaj="Hello JSF - " + new Date().toLocaleString();

	public void mesajVer() {
		System.out.println("Butona Týklandý");
	}
	
	public String getMesaj() {
		return mesaj;
	}
}
