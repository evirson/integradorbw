package br.com.vetorsistemas.integradorbw.variacao;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SP_VARIACAOBW")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "SPVariacao", procedureName = "SP_VARIACAOBW") })
public class Variacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Integer id;
	private String referencia;
	private Integer estoque;
	private double peso;
	private boolean ativo;
	private Integer id_produto;
	private String id_cor_codsinc;
	private String id_tamanho_codsinc;
	private Date datasinc;

	public Variacao() {

	}

	public Variacao(Integer id, String referencia, Integer estoque, double peso, boolean ativo, Integer id_produto,
			String id_cor_codsinc, String id_tamanho_codsinc, Date datasinc) {
		super();
		this.id = id;
		this.referencia = referencia;
		this.estoque = estoque;
		this.peso = peso;
		this.ativo = ativo;
		this.id_produto = id_produto;
		this.id_cor_codsinc = id_cor_codsinc;
		this.id_tamanho_codsinc = id_tamanho_codsinc;
		this.datasinc = datasinc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getId_produto() {
		return id_produto;
	}

	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}

	public String getId_cor_codsinc() {
		return id_cor_codsinc;
	}

	public void setId_cor_codsinc(String id_cor_codsinc) {
		this.id_cor_codsinc = id_cor_codsinc;
	}

	public String getId_tamanho_codsinc() {
		return id_tamanho_codsinc;
	}

	public void setId_tamanho_codsinc(String id_tamanho_codsinc) {
		this.id_tamanho_codsinc = id_tamanho_codsinc;
	}

	public Date getDatasinc() {
		return datasinc;
	}

	public void setDatasinc(Date datasinc) {
		this.datasinc = datasinc;
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
		Variacao other = (Variacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
