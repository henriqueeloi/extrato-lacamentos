package br.com.cielo.extato.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class LancamentoContaCorrenteCliente {
    
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long numeroRemessaBanco;
    private String nomeSituacaoRemessa;
    
    @OneToOne(optional=false, cascade = CascadeType.ALL)
    private DomicilioBancario dadosDomicilioBancario;
    private String nomeTipoOperacao;
    @Transient
    private List<Object> dadosAnaliticoLancamentoFinanceiroCliente;
    
	public LancamentoContaCorrenteCliente(Long numeroRemessaBanco,
			String nomeSituacaoRemessa,
			DomicilioBancario dadosDomicilioBancario, String nomeTipoOperacao,
			List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.dadosDomicilioBancario = dadosDomicilioBancario;
		this.nomeTipoOperacao = nomeTipoOperacao;
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	
	public LancamentoContaCorrenteCliente() {}
	
	public Long getId() {
		return id;
	}
	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	public DomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}
    
}
