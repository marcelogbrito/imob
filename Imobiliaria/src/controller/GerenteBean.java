package controller;

import java.io.Serializable;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;

import modelo.Gerente;
@ManagedBean
public class GerenteBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Gerente gerente;
	
	public GerenteBean() {
		gerente = new Gerente();
	}


	public Gerente getGerente() {
		return gerente;
	}


	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	

}
