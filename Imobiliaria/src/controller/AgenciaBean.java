package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import modelo.Agencia;
@ManagedBean
public class AgenciaBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Agencia agencia;
	
	public AgenciaBean() {
		agencia = new Agencia();
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	

}
