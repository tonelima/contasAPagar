package br.com.tonelima.contasapagar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tonelima.contasapagar.model.ContaAPagar;
import br.com.tonelima.contasapagar.repository.ContaAPagarRepository;

@Service
public class ContaAPagarService {

	private ContaAPagarRepository contaAPagarRepository;

	public ContaAPagarService(ContaAPagarRepository contaAPagarRepository) {
		this.contaAPagarRepository = contaAPagarRepository;
	}
	
	public List<ContaAPagar> findByTipo(String tipo) {
		return contaAPagarRepository.findByTipo(tipo);
	}

}
