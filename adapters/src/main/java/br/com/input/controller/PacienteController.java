package br.com.input.controller;

import br.com.core.domain.PacienteDomain;
import br.com.output.entity.PacienteEntity;
import br.com.ports.input.FindAllPacienteDomainInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.input.controller.dtos.PacienteDTO;
import br.com.output.entity.converters.PacienteConverter;
import br.com.ports.input.InsertPacienteDomainInputPort;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	private final InsertPacienteDomainInputPort insertPacienteDomainInputPort;
	private final FindAllPacienteDomainInputPort findAllPacienteDomainInputPort;

	public PacienteController(InsertPacienteDomainInputPort insertPacienteDomainInputPort,
							  FindAllPacienteDomainInputPort findAllPacienteDomainInputPort){
		this.insertPacienteDomainInputPort = insertPacienteDomainInputPort;
		this.findAllPacienteDomainInputPort = findAllPacienteDomainInputPort;
	}
	
	@Autowired
	private PacienteConverter converter;

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody PacienteDTO dto){
		var paciente = converter.toDTO(dto);
		insertPacienteDomainInputPort.insert(paciente);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<PacienteDTO>> listarTodos(){
		List<PacienteDomain> pacienteDomainsList = findAllPacienteDomainInputPort.findAll();
		List<PacienteDTO> dto = converter.toDTOList(pacienteDomainsList);
		return ResponseEntity.ok().body(dto);
	}
}
