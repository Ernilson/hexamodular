package br.com.output.service;

import br.com.core.domain.PacienteDomain;
import br.com.output.entity.PacienteEntity;
import br.com.output.entity.converters.PacienteConverter;
import br.com.output.repository.PacienteRepository;
import br.com.ports.output.FindAllPacienteDomainOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindAllPacienteServiceAdapter implements FindAllPacienteDomainOutPutPort {

    private PacienteRepository repository;

    @Autowired
    private PacienteConverter converter;

    @Override
    public List<PacienteDomain> findAll() {
        List<PacienteEntity> pacienteEntities = repository.findAll();
        return pacienteEntities.stream()
                .map(entity -> converter.toDomain(entity))
                .collect(Collectors.toList());
    }
}
