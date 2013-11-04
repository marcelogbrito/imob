package modelo;

import java.util.List;

import javax.persistence.Entity;
@Entity
public class Proprietario extends Cliente{
	
	private List <Imovel> imoveis;

	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
	
	

}
