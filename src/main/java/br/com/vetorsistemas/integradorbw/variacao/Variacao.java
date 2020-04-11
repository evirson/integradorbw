package br.com.vetorsistemas.integradorbw.variacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cadbar")
public class Variacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("CodSinc")
	private String codsinc;
	@JsonProperty("Referencia")
	private String referencia;
	@JsonProperty("Estoque")
	private Integer estoque;
	@JsonProperty("Peso")
	private double peso;
	@JsonProperty("Ativo")
	private boolean ativo;
	@JsonProperty("Id_Produto")
	private Integer id_produto;
	@JsonProperty("Id_Produto_CodSinc")
	private String id_produto_codsinc;
	@JsonProperty("Id_Cor_CodSinc")
	private String id_cor_codsinc;
	@JsonProperty("Id_Tamanho_CodSinc")
	private String id_tamanho_codsinc;

	public Variacao() {

	}

	public Variacao(String codsinc, String referencia, Integer estoque, double peso, boolean ativo, Integer id_produto,
			String id_produto_codsinc, String id_cor_codsinc, String id_tamanho_codsinc) {
		super();
		this.codsinc = codsinc;
		this.referencia = referencia;
		this.estoque = estoque;
		this.peso = peso;
		this.ativo = ativo;
		this.id_produto = id_produto;
		this.id_produto_codsinc = id_produto_codsinc;
		this.id_cor_codsinc = id_cor_codsinc;
		this.id_tamanho_codsinc = id_tamanho_codsinc;
	}

	public String getCodsinc() {
		return codsinc;
	}

	public void setCodsinc(String codsinc) {
		this.codsinc = codsinc;
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

	public String getId_produto_codsinc() {
		return id_produto_codsinc;
	}

	public void setId_produto_codsinc(String id_produto_codsinc) {
		this.id_produto_codsinc = id_produto_codsinc;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codsinc == null) ? 0 : codsinc.hashCode());
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
		if (codsinc == null) {
			if (other.codsinc != null)
				return false;
		} else if (!codsinc.equals(other.codsinc))
			return false;
		return true;
	}
	
	
	
}
