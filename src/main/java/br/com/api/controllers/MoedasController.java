package br.com.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.api.controllers.requests.MoedaRequest;

@RequestMapping("/api/moedas")
public class MoedasController {
	
	private final List<String> BANCO_DE_MOEDAS = Arrays.asList("USD", "EUR", "BRL", "GBP", "CAD", "ARS", "CNY", "JPY", "MXN");
	
	@PostMapping
	public ResponseEntity<String> novaMoeda(@RequestBody MoedaRequest moedaRequest) {
		
		return null;	
	}
}