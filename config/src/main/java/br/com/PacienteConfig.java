package br.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class PacienteConfig<InsertPacienteDomainUseCase, InsertPacienteServiceAdapter> {
	
	@SuppressWarnings("unchecked")
	@Bean
	public InsertPacienteDomainUseCase insertPacienteDomainUseCase(InsertPacienteServiceAdapter service) {
		return (InsertPacienteDomainUseCase) service;
	}
	
}
