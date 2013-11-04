package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import modelo.Telefone;


@ManagedBean
public class TelefoneBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Telefone telefone;
	
	public TelefoneBean() {
		telefone = new Telefone();
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	

}
