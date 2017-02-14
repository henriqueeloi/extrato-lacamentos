package br.com.cielo.extato.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DomicilioBancario {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	private Long codigoBanco;
	private Long numeroAgencia;
	private String numeroContaCorrente;
	
	public DomicilioBancario() {}
	
	public DomicilioBancario(Long codigoBanco, Long numeroAgencia,
			String numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
	public Long getId() {
		return id;
	}
	public Long getCodigoBanco() {
		return codigoBanco;
	}
	public Long getNumeroAgencia() {
		return numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
		
}
