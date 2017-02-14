package br.com.cielo.extato.domain;

public class TotalControleLancamento{
    public int quantidadeLancamentos;
    public int quantidadeRemessas;
    public double valorLancamentos;
    
	public int getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public double getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
}