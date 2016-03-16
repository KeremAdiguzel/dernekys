package com.dernekys.mbean.demirbas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

@ManagedBean(name = "DemirbasBean")
@ViewScoped
public class DemirbasBean implements Serializable {

	private static final long serialVersionUID = 4888413859138119278L;

	private List<Demirbaslar> demirbas;
	private DemirbasService demirbasService;

	/*@ManagedProperty("#{demirbasService}")
	private DemirbasService service;
	*/

	@PostConstruct
	public void init() {
		demirbasService = new DemirbasService();
		demirbas = new ArrayList<Demirbaslar>();

		demirbas = demirbasService.getAll();
	}

	public List<Demirbaslar> getDemirbas() {
		return demirbas;
	}
	/*
	public List<String> getBrands() {
		return service.getBrands();
	}

	public List<String> getColors() {
		return service.getColors();
	}

	public void setService(CarService service) {
		this.service = service;
	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Car Edited",
				((Car) event.getObject()).getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	*/
	/*
	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled",
				((Car) event.getObject()).getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
*/
	public void onCellEdit(CellEditEvent event) {
		Object oldValue = event.getOldValue();
		Object newValue = event.getNewValue();

		if (newValue != null && !newValue.equals(oldValue)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Cell Changed", "Old: " + oldValue + ", New:" + newValue);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
}