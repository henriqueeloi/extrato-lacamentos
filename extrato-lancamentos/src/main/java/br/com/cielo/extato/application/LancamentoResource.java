package br.com.cielo.extato.application;

import java.math.BigDecimal;

import org.dozer.Mapping;
import org.springframework.hateoas.ResourceSupport;


public class LancamentoResource extends ResourceSupport {

	public LancamentoResource(){}
	
	@Mapping("codigoIdentificadorUnico")
	private String codigoIdentificadorUnico;	
	@Mapping("dataEfetivaLancamento")
	private String dataLancamento;
	@Mapping("lancamentoContaCorrenteCliente.nomeTipoOperacao")
	private String descricao;
	@Mapping("lancamentoContaCorrenteCliente.numeroRemessaBanco")
	private Long numero;
	@Mapping("lancamentoContaCorrenteCliente.nomeSituacaoRemessa")
	private String situacao;
	@Mapping("dataLancamentoContaCorrenteCliente")
	private String dataConfirmacao;
	
	@Mapping("nomeBanco")	
	private String nomeBanco;
	
	@Mapping("lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroAgencia")	
	private String numeroAgencia;
	
	@Mapping("lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroContaCorrente")	
	private String numeroContaCorrente;
		
	@Mapping("valorLancamentoRemessa")
	private BigDecimal valorFinal;

	public String getDataLancamento() {
		return dataLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public Long getNumero() {
		return numero;
	}

	public String getSituacao() {
		return situacao;
	}

	public String getDataConfirmacao() {
		return dataConfirmacao;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}
			
}