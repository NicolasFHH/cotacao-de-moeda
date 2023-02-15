package br.com.api.controllers.requests;

public class MoedaRequest {
	
	private String moedaBase;
	private String moedaCotacao;
	
	public MoedaRequest(String moedaBase, String moedaCotacao) {
		this.moedaBase = moedaBase;
		this.moedaCotacao = moedaCotacao;
	}

	public String getMoedaBase() {
		return moedaBase;
	}

	public String getMoedaCotacao() {
		return moedaCotacao;
	}
}