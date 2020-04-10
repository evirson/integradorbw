package br.com.vetorsistemas.integradorbw.marcas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="cadpro")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codsinc")
	@JsonProperty("CodSinc")
	private Integer codsinc;
	
	@Column(name="marpro")
	@JsonProperty("Descricao")
	private String descricao;

	public Marca() {

	}

	public Marca(Integer codsinc, String descricao) {
		super();
		this.codsinc = codsinc;
		this.descricao = descricao;
	}

	public Integer getCodsinc() {
		return codsinc;
	}

	public void setCodsinc(Integer codsinc) {
		this.codsinc = codsinc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codsinc == null) ? 0 : codsinc.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
		Marca other = (Marca) obj;
		if (codsinc == null) {
			if (other.codsinc != null)
				return false;
		} else if (!codsinc.equals(other.codsinc))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	
	
}
