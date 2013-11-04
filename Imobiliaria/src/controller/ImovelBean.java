package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import modelo.Imovel;
@ManagedBean
public class ImovelBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private Imovel imovel;
	
	public ImovelBean() {
		imovel = new Imovel();
	}
	
	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	

}
