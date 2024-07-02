package br.com.output.entity.converters;

import org.springframework.stereotype.Component;

import br.com.core.domain.PacienteDomain;
import br.com.input.controller.dtos.PacienteDTO;
import br.com.output.entity.PacienteEntity;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PacienteConverter {

	// Converte de Domain para Entity
	public PacienteEntity toEntity(PacienteDomain domain) {
		PacienteEntity entity = new PacienteEntity();
		entity.setId(domain.getId());
		entity.setNome(domain.getNome());
		entity.setEmail(domain.getEmail());
		entity.setTelefone(domain.getTelefone());
		entity.setCpf(domain.getCpf());
		return entity;

	}
	
	 //Converte de Entity para Domain
    public PacienteDomain toDomain(PacienteEntity entity) {
    	PacienteDomain domain = new PacienteDomain();
    	entity.setId(domain.getId());
		entity.setNome(domain.getNome());
		entity.setEmail(domain.getEmail());
		entity.setTelefone(domain.getTelefone());
		entity.setCpf(domain.getCpf());
        return domain;
    }
    
  //Converte de DTO para Domain
    public PacienteDomain toDTO(PacienteDTO dto) {
    	PacienteDomain domain = new PacienteDomain();    	
    	domain.setNome(dto.getNome());
    	domain.setTelefone(dto.getTelefone());
    	domain.setCpf(dto.getCpf());
        return domain;
    }
    
  //Converte de DTO para Entity
    public PacienteDTO toDT(PacienteDomain domain) {
		PacienteDTO dto = new PacienteDTO();
    	dto.setNome(domain.getNome());
    	dto.setTelefone(domain.getTelefone());
    	dto.setCpf(domain.getCpf());
        return dto;
    }

	// Converte uma lista de Entities para uma lista de DTOs
	public List<PacienteDTO> toDTOList(List<PacienteDomain> domainList) {
		return domainList.stream()
				.map(this::toDT)
				.collect(Collectors.toList());
	}

}
