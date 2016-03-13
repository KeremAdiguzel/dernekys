package com.dernekys.mbean.uyelik;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//Okutanlar
@ManagedBean(name = "uyelikBean")
@ViewScoped
public class UyelikBean implements Serializable {

	private static final long serialVersionUID = -7587014621665755109L;
	
	private String msg = "Hello world";

	public void printMsg() {
		System.out.println("Týk týk");
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	



	
	
	

}
