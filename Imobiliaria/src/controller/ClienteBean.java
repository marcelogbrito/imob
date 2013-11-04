package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import modelo.Cliente;
@ManagedBean
public class ClienteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Cliente cliente;
	
	public ClienteBean() {
		cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
		
	

}
