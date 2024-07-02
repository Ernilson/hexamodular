package br.com.core.usecase;

import br.com.core.domain.PacienteDomain;
import br.com.ports.output.FindAllPacienteDomainOutPutPort;

import java.util.List;

public class FindAllPacienteDomainUseCase implements FindAllPacienteDomainOutPutPort {

    private final FindAllPacienteDomainOutPutPort findAllPacienteDomainOutPutPort;

    public FindAllPacienteDomainUseCase(FindAllPacienteDomainOutPutPort findAllPacienteDomainOutPutPort){
        this.findAllPacienteDomainOutPutPort = findAllPacienteDomainOutPutPort;
    }

    @Override
    public List<PacienteDomain> findAll() {
        return findAllPacienteDomainOutPutPort.findAll();
    }
}
