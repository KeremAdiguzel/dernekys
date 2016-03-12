package com.dernekys.mbean.uyelik;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.dernekys.entity.EBase;

//Okutanlar
@ManagedBean(name = "uyelikBean")
@ViewScoped
public class UyelikBean extends EBase {

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
