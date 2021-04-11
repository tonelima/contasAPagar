package br.com.tonelima.contasapagar.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class ContaAPagarDTO {
	
	@EqualsAndHashCode.Include
	private Long id;

	private String descricao;

	private Double valor;

	private Date vencimento;
}