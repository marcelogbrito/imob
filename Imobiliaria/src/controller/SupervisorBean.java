package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import modelo.Supervisor;

import enums.Funcao;

@ManagedBean
public class SupervisorBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Supervisor supervisor;
	
	public SupervisorBean() {
		supervisor = new Supervisor();
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}


}
