package br.com.input.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.input.controller.dtos.PacienteDTO;
import br.com.output.entity.converters.PacienteConverter;
import br.com.ports.input.InsertPacienteDomainInputPort;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private InsertPacienteDomainInputPort insertPacienteDomainInputPort;
	
	@Autowired
	private PacienteConverter converter;

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody PacienteDTO dto){
		var paciente = converter.toDTO(dto);
		insertPacienteDomainInputPort.insert(paciente);
		return ResponseEntity.ok().build();
		
	}
}
