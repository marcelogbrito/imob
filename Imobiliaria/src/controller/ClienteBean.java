package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import modelo.Cliente;
import persistence.DAO;
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
	
	public List <Cliente> getClientes(){
		return new DAO<Cliente>(Cliente.class).listaTodos();
	}
	
	public void gravar() {

		

		new DAO<Cliente>(Cliente.class).adiciona(this.cliente);

		this.cliente = new Cliente();
	}
	
	
	
		
	

}
