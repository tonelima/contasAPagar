package br.com.tonelima.contasapagar.repository;

import br.com.tonelima.contasapagar.model.ContaAPagar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ContaAPagarRepository extends JpaRepository<ContaAPagar, Long> {

	 Optional<ContaAPagar> findById(Long id);
	
	 List<ContaAPagar> findByTipo(String tipo);
	
	 //List<ContaAPagar> findByVencimentoBetween(Date vencimento);
}
