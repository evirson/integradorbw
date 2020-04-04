package br.com.vetorsistemas.integradorbw.cores;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table(name = "SP_CORESBW")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "SPCores", procedureName = "SP_CORESBW") })
public class Cor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String descricao;
	private Date dataSinc;

	public Cor() {

	}

	public Cor(String descricao, Date dataSinc) {
		super();
		this.descricao = descricao;
		this.dataSinc = dataSinc;
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
		Cor other = (Cor) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	
	
	

}
