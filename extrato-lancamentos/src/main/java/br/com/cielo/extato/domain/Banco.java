package br.com.cielo.extato.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banco {
	
	@Id
	private Long id;
	private String nome;
	
	public Banco(String nome) {
		super();
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public Banco(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	
	
}
