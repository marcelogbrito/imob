package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import enums.TipoImovel;
@Entity
public class Imovel {
	@Id @GeneratedValue
	private Integer codigo;
	private String localizacao;
	private TipoImovel tipoImovel;
	private Double ValorSolicitado;
	private Proprietario proprietario;
	private List <Divulgacao> divulgacoes;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public Double getValorSolicitado() {
		return ValorSolicitado;
	}
	public void setValorSolicitado(Double valorSolicitado) {
		ValorSolicitado = valorSolicitado;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public List<Divulgacao> getDivulgacoes() {
		return divulgacoes;
	}
	public void setDivulgacoes(List<Divulgacao> divulgacoes) {
		this.divulgacoes = divulgacoes;
	}
	
	
	

}
