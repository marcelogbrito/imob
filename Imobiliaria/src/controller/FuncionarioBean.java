package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import modelo.Funcionario;

import enums.Funcao;
@ManagedBean
public class FuncionarioBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Funcionario funcionario;
	
	public FuncionarioBean() {
		funcionario = new Funcionario();
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	

}
