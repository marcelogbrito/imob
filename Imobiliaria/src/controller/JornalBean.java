package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import modelo.Jornal;
@ManagedBean
public class JornalBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Jornal jornal;
	
	public JornalBean() {
		jornal = new Jornal();
	}

	public Jornal getJornal() {
		return jornal;
	}

	public void setJornal(Jornal jornal) {
		this.jornal = jornal;
	}
	

}
