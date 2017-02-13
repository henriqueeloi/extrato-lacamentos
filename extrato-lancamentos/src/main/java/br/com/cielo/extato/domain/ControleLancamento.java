package br.com.cielo.extato.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ControleLancamento {
	
	@Id
    public String codigoIdentificadorUnico;
    @OneToOne(optional=false, cascade = CascadeType.ALL)
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	private LocalDate dataEfetivaLancamento;
	private LocalDate dataLancamentoContaCorrenteCliente;
	private Integer numeroEvento;
	private String descricaoGrupoPagamento;
	private String nomeBanco;
	private Integer quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private Double valorLancamentoRemessa;
	private Long dateLancamentoContaCorrenteCliente;
	private Long dateEfetivaLancamento;
			
	public ControleLancamento(String codigoIdentificadorUnico,
			LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente,
			LocalDate dataEfetivaLancamento,
			LocalDate dataLancamentoContaCorrenteCliente, Integer numeroEvento,
			String descricaoGrupoPagamento, String nomeBanco,
			Integer quantidadeLancamentoRemessa, String numeroRaizCNPJ,
			String numeroSufixoCNPJ, Double valorLancamentoRemessa,
			Long dateLancamentoContaCorrenteCliente, Long dateEfetivaLancamento) {
		super();
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	public ControleLancamento() {}

	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public LocalDate getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public LocalDate getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public Integer getNumeroEvento() {
		return numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public Integer getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public Double getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}
	
	
	
}
