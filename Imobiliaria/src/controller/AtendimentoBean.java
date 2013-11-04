package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import modelo.Atendimento;

@ManagedBean
public class AtendimentoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Atendimento atendimento;
	
	public AtendimentoBean() {
		atendimento = new Atendimento();
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

}
