package br.com.core.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class AgendaDomain {
	
	private Long id;
	private String descricao;
	private LocalDateTime horario;
	private LocalDateTime dataCriacao;
	
	private PacienteDomain paciente;
	
	public AgendaDomain() {
		// TODO Auto-generated constructor stub
	}

	public AgendaDomain(Long id, String descricao, LocalDateTime horario, LocalDateTime dataCriacao,
			PacienteDomain paciente) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.horario = horario;
		this.dataCriacao = dataCriacao;
		this.paciente = paciente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public PacienteDomain getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteDomain paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCriacao, descricao, horario, id, paciente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgendaDomain other = (AgendaDomain) obj;
		return Objects.equals(dataCriacao, other.dataCriacao) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(horario, other.horario) && Objects.equals(id, other.id)
				&& Objects.equals(paciente, other.paciente);
	}

	@Override
	public String toString() {
		return "AgendaDomain [id=" + id + ", descricao=" + descricao + ", horario=" + horario + ", dataCriacao="
				+ dataCriacao + ", paciente=" + paciente + "]";
	}
	
	

}