package br.com.cielo.extato.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class DomicilioBancario {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	@OneToOne(optional=false, cascade = CascadeType.ALL)
	private Banco banco;
	private Long numeroAgencia;
	private String numeroContaCorrente;
	
	public DomicilioBancario() {}
	
	public DomicilioBancario(Banco banco, Long numeroAgencia,
			String numeroContaCorrente) {
		super();
		this.banco = banco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
	public Long getId() {
		return id;
	}
	public Banco getBanco() {
		return banco;
	}
	public Long getNumeroAgencia() {
		return numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	
	@Override
    public String toString() {        
        return String.format(
                "[banco=%s, Ag='%s', CC='%s']",
                banco.getNome(), numeroAgencia, numeroContaCorrente);
    }
		
}
