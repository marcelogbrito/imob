package controller;

import java.io.Serializable;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;

import modelo.Aluguel;

@ManagedBean
public class AluguelBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Aluguel aluguel;
	
	public AluguelBean() {
		aluguel = new Aluguel();
	}

	public Aluguel getAluguel() {
		return aluguel;
	}

	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
