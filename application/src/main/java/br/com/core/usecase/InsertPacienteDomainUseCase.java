package br.com.core.usecase;

import br.com.core.domain.PacienteDomain;
import br.com.ports.input.InsertPacienteDomainInputPort;
import br.com.ports.output.InsertPacienteDomainOutputPort;

public class InsertPacienteDomainUseCase implements InsertPacienteDomainInputPort{
	
	private InsertPacienteDomainOutputPort insertPacienteDomainOutputPort;
	
	public InsertPacienteDomainUseCase(InsertPacienteDomainOutputPort insertPacienteDomainOutputPort) {
		this.insertPacienteDomainOutputPort = insertPacienteDomainOutputPort;
	}

	@Override
	public void insert(PacienteDomain paciente) {
		insertPacienteDomainOutputPort.insert(paciente);
		
	}

}
