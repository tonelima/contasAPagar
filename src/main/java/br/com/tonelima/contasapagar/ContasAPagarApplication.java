package br.com.tonelima.contasapagar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.tonelima.contasapagar")
public class ContasAPagarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContasAPagarApplication.class, args);
	}

}
