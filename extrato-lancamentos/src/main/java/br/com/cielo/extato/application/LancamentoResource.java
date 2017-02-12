package br.com.cielo.extato.application;

import java.math.BigDecimal;

import org.dozer.Mapping;
import org.springframework.hateoas.ResourceSupport;

public class LancamentoResource extends ResourceSupport {

	public LancamentoResource(){}
	
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
	@Mapping("dataLancamentoContaCorrenteCliente")
	private String dadosBancarios;
	private BigDecimal valorFinal;
			
}

//Data do lançamento | Descrição | Número      | Situação | Data de confirmação | Dados bancários                    | Valor final
//18/11/2016         | Regular   | 67210807400 | Pago     | 18/11/2016          | BANCO ABCD S.A Ag 12 CC 0001231234 | R$ 28.714,00
