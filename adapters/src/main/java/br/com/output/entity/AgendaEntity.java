package br.com.output.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_agenda")
public class AgendaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private LocalDateTime horario;
	private LocalDateTime dataCriacao;
	
	@ManyToOne
	private PacienteEntity paciente;
	
	public AgendaEntity() {
		// TODO Auto-generated constructor stub
	}

	public AgendaEntity(Long id, String descricao, LocalDateTime horario, LocalDateTime dataCriacao,
			PacienteEntity paciente) {
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

	public PacienteEntity getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteEntity paciente) {
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
		AgendaEntity other = (AgendaEntity) obj;
		return Objects.equals(dataCriacao, other.dataCriacao) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(horario, other.horario) && Objects.equals(id, other.id)
				&& Objects.equals(paciente, other.paciente);
	}

	@Override
	public String toString() {
		return "AgendaEntity [id=" + id + ", descricao=" + descricao + ", horario=" + horario + ", dataCriacao="
				+ dataCriacao + ", paciente=" + paciente + "]";
	}

}
