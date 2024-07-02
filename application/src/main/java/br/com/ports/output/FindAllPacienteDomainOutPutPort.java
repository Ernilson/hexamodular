package br.com.ports.output;

import br.com.core.domain.PacienteDomain;

import java.util.List;

public interface FindAllPacienteDomainOutPutPort {
    public List<PacienteDomain> findAll();
}
