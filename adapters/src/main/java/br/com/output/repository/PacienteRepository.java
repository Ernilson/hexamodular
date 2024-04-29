package br.com.output.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.output.entity.PacienteEntity;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long>{

}
