package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import modelo.Proprietario;
@ManagedBean
public class ProprietarioBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Proprietario proprietario;
	
	public ProprietarioBean() {
		proprietario = new Proprietario();
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	

}
