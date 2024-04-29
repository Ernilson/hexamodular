package br.com.output.entity.converters;


import br.com.core.domain.AgendaDomain;
import br.com.core.domain.PacienteDomain;
import br.com.output.entity.AgendaEntity;
import br.com.output.entity.PacienteEntity;

public class AgendaConverter {
	
	// Converte de Domain para Entity
	public AgendaEntity toEntity(AgendaDomain domain) {
	    AgendaEntity entity = new AgendaEntity();
	    entity.setId(domain.getId());
	    entity.setDescricao(domain.getDescricao());
	    entity.setDataCriacao(domain.getDataCriacao());
	    entity.setHorario(domain.getHorario());
	    entity.setPaciente(convertToPacienteEntity(domain.getPaciente()));
	    return entity;
	}
	
	// Método para converter PacienteDomain em PacienteEntity
	private PacienteEntity convertToPacienteEntity(PacienteDomain pacienteDomain) {
	    PacienteEntity pacienteEntity = new PacienteEntity();
	    pacienteEntity.setId(pacienteDomain.getId());
	    pacienteEntity.setNome(pacienteDomain.getNome());
	    pacienteEntity.setEmail(pacienteDomain.getEmail());
	    pacienteEntity.setTelefone(pacienteDomain.getTelefone());
	    pacienteEntity.setCpf(pacienteDomain.getCpf());
	    return pacienteEntity;
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

}
