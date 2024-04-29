package br.com.input.controller.dtos;

import java.time.LocalDateTime;

import br.com.output.entity.PacienteEntity;

public class AgendaDTO {

	private String descricao;
	private LocalDateTime horario;
	private LocalDateTime dataCriacao;
	private PacienteEntity paciente;
	
	public AgendaDTO() {
		// TODO Auto-generated constructor stub
	}

	public AgendaDTO(String descricao, LocalDateTime horario, LocalDateTime dataCriacao, PacienteEntity paciente) {
		super();
		this.descricao = descricao;
		this.horario = horario;
		this.dataCriacao = dataCriacao;
		this.paciente = paciente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public PacienteEntity getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteEntity paciente) {
		this.paciente = paciente;
	}

	
	
}
