package br.com.output.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.output.entity.AgendaEntity;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Long>{

}
