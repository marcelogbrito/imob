package modelo;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	private Long cpf;
	private String nome;
	private String endereco;
	@OneToMany(mappedBy="cliente")
	@ElementCollection
	private List <Telefone> telefones;
	@OneToMany(mappedBy="cliente")
	@ElementCollection
	private List <Aluguel> alugueis;
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public List<Aluguel> getAlugueis() {
		return alugueis;
	}
	public void setAlugueis(List<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}
	
	
	

}
