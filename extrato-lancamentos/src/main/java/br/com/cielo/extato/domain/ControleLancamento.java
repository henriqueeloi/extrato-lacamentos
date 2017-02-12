package br.com.cielo.extato.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class ControleLancamento {
	
    @Id
    public String id;
    
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private int numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private int quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private double valorLancamentoRemessa;
	private LocalDateTime dateLancamentoContaCorrenteCliente;
	private LocalDateTime dateEfetivaLancamento;
}
