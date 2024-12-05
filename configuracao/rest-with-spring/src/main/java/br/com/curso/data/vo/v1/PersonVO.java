package br.com.curso.data.vo.v1;

import java.io.Serializable;

//@JsonPropertyOrder({"id","endereco","primeiroNome","ultimoNome","genero"})
public class PersonVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;	
	
	//@JsonProperty("primeiro_nome")
	private String primeiroNome;
	
	//@JsonProperty("ultimo_nome")
	private String ultimoNome;	
	private String endereco;	
	
	//@JsonIgnore
	private String genero;
	
	public PersonVO() {}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

	
}
