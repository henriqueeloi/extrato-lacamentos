package br.com.cielo.extato.domain;

import java.util.List;

public class LancamentoContaLegado {
	
	
	private TotalControleLancamento totalControleLancamento;
	private List<ControleLancamento> listaControleLancamento;
	private Integer indice;
	private Integer tamanhoPagina;
	private Integer totalElements;
	
	
	public Integer getIndice() {
		return indice;
	}
	public void setIndice(Integer indice) {
		this.indice = indice;
	}
	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}
	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	public Integer getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	public List<ControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}
	public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
}
