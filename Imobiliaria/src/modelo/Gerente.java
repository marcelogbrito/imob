package modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Gerente extends Funcionario {
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio;

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	

}
