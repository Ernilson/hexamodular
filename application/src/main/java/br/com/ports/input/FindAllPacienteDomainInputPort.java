package br.com.ports.input;

import br.com.core.domain.PacienteDomain;

import java.util.List;

public interface FindAllPacienteDomainInputPort {
    public List<PacienteDomain> findAll();
}
