package br.com.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.api.controllers.requests.MoedaRequest;

@RequestMapping("/api/moedas")
public class MoedasController {
	
	@PostMapping
	public ResponseEntity<String> novaMoeda(@RequestBody MoedaRequest moedaRequest) {
		
		return null;	
	}
}