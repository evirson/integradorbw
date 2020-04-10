package br.com.vetorsistemas.integradorbw.hierarquias;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "SP_HIERARQUIASBW")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "SPHierarquias", procedureName = "SP_HIERARQUIASBW") })
public class Hierarquia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo")
	@JsonProperty("Id")
	private String id;
	@Column(name = "descricao")
	@JsonProperty("Nome")
	private String nome;
	@Column(name = "ativo")
	@JsonProperty("Ativo")
	private boolean ativo;
	@Column(name = "nivel")
	@JsonProperty("Nivel")
	private Integer nivel;

	public Hierarquia() {

	}

	public Hierarquia(String id, String nome, boolean ativo, Integer nivel) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.nivel = nivel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hierarquia other = (Hierarquia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
