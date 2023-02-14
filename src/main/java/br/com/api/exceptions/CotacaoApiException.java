package br.com.api.exceptions;

import org.springframework.http.HttpStatus;

public class CotacaoApiException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String mensagem;
	private String campo;
	private HttpStatus httpStatus;
	
	public CotacaoApiException(String mensagem, String campo, HttpStatus httpStatus) {
		super(mensagem);
		this.campo = campo;
		this.httpStatus = httpStatus;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getCampo() {
		return campo;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}