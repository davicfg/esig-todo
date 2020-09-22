package br.com.esig.teste.tarefa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tarefa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String descricao;
	@NotNull
	private Boolean estado;

	public Tarefa() {
		this.id = null;
		this.estado = false;
	}

	public Tarefa(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
		this.estado = false;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(@NotBlank String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}
