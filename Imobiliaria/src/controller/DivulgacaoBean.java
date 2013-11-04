package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import modelo.Divulgacao;

@ManagedBean
public class DivulgacaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Divulgacao divulgacao;
	
	public DivulgacaoBean() {
		divulgacao = new Divulgacao();
	}

	public Divulgacao getDivulgacao() {
		return divulgacao;
	}

	public void setDivulgacao(Divulgacao divulgacao) {
		this.divulgacao = divulgacao;
	}
	
	
	
	
	

}
