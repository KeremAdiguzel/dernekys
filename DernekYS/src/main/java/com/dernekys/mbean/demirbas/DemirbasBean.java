package com.dernekys.mbean.demirbas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.dernekys.base.DbException;
import com.dernekys.entity.demirbas.Demirbas;
import com.dernekys.service.demirbas.DemirbasService;

@ManagedBean(name = "demirbasBean")
@ViewScoped
public class DemirbasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8379357111564086560L;

	private List<Demirbas> demirbasListe;
	private DemirbasService demirbasService;
	private Demirbas Demirbas;
	
	@PostConstruct
	public void init() {

		demirbasService = new DemirbasService();
		demirbasListe = new ArrayList<Demirbas>();

		demirbasListe = demirbasService.getAll();

	}
	public void save(){
		try {
			demirbasService.save(Demirbas);
			demirbasListe=demirbasService.getAll();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public Demirbas getDemirbas() {
		if(Demirbas==null){
			Demirbas=new Demirbas();
		}
		return Demirbas;
	}
	
	public void setDemirbas(Demirbas demirbas) {
		this.Demirbas = demirbas;
	}
	
	
	public List<Demirbas> getDemirbasListe() {
		return demirbasListe;
	}

	public void setDemirbasListe(List<Demirbas> demirbasListe) {
		this.demirbasListe = demirbasListe;
	}
	
	  public void onRowEdit(RowEditEvent event) {
	        FacesMessage msg = new FacesMessage ("Düzenlendi");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	     
	    public void onRowCancel(RowEditEvent event) {
	    	FacesMessage msg = new FacesMessage("Edit Cancelled");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	     
	    public void onCellEdit(CellEditEvent event) {
	        Object oldValue = event.getOldValue();
	        Object newValue = event.getNewValue();
	         
	        if(newValue != null && !newValue.equals(oldValue)) {
	            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
	            FacesContext.getCurrentInstance().addMessage(null, msg);
	        }
	    }
	
	

}
