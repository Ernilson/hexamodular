package br.com;

import br.com.core.usecase.InsertPacienteDomainUseCase;
import br.com.output.service.InsertPacienteServiceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class PacienteConfig {

	@Bean
	public InsertPacienteDomainUseCase insertPacienteDomainUseCase(InsertPacienteServiceAdapter service) {
		return new InsertPacienteDomainUseCase(service);
	}
	
}
