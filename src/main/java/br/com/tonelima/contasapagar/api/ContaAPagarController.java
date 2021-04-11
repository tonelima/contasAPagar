package br.com.tonelima.contasapagar.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tonelima.contasapagar.model.ContaAPagar;
import br.com.tonelima.contasapagar.service.ContaAPagarService;

@RestController
@RequestMapping("/contasAPagar")
public class ContaAPagarController {

	private ContaAPagarService contaAPagarService;

	public ContaAPagarController(ContaAPagarService contaAPagarService) {
		this.contaAPagarService = contaAPagarService;
	}

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<ContaAPagar>> find(@RequestParam String tipo) {
		return ResponseEntity.ok(contaAPagarService.findByTipo(tipo));
	}
}
