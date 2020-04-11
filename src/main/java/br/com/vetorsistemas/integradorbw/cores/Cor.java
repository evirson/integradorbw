package br.com.vetorsistemas.integradorbw.cores;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cadbar")
public class Cor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("CodSinc")
	private String id;
	@JsonProperty("Descricao")
	private String descricao;
	@Column(name="datasinc")
	@JsonProperty("DataSinc")
	private Date dataSinc;

	public Cor() {

	}

	public Cor(String id, String descricao, Date dataSinc) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dataSinc = dataSinc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataSinc() {
		return dataSinc;
	}

	public void setDataSinc(Date dataSinc) {
		this.dataSinc = dataSinc;
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
		Cor other = (Cor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
