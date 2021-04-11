package br.com.tonelima.contasapagar.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tonelima.contasapagar.model.ContaAPagar;

@Repository
public interface ContaAPagarRepository extends JpaRepository<ContaAPagar, Long> {

	public Optional<ContaAPagar> findById(Long id);
	
	public List<ContaAPagar> findByTipo(String tipo);
	
	public List<ContaAPagar> findByVencimentoBetween(Date dataInicial, Date dataFinal);
}
