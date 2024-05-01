package br.com.output.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.core.domain.PacienteDomain;
import br.com.output.entity.converters.PacienteConverter;
import br.com.output.repository.PacienteRepository;
import br.com.ports.input.InsertPacienteDomainInputPort;
import br.com.ports.output.InsertPacienteDomainOutputPort;

@Service
public class InsertPacienteServiceAdapter implements InsertPacienteDomainInputPort{

	@Autowired
	private PacienteRepository repository;
	
	@Autowired
	private PacienteConverter converter;

	@Override
	public void insert(PacienteDomain paciente) {
		var pacienteEntity = converter.toEntity(paciente);
		repository.save(pacienteEntity);		
	}
	
}
