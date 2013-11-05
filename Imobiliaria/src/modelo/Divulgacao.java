package modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Divulgacao {
	@Id @GeneratedValue
	private Long codigo;
	@ManyToOne
	private Imovel imovel;
	@OneToOne
	private Jornal jornal;
	@Temporal(TemporalType.DATE)
	private Calendar data;
	private Double custo;
	
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	public Jornal getJornal() {
		return jornal;
	}
	public void setJornal(Jornal jornal) {
		this.jornal = jornal;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Double getCusto() {
		return custo;
	}
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	

}
