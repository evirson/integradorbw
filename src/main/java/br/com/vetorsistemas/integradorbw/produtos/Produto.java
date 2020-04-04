package br.com.vetorsistemas.integradorbw.produtos;

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
@Table(name = "SP_PRODUTOSBW")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "SPProdutos", procedureName = "SP_PRODUTOSBW") })
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String referencia;
	private String descricao;
	private String descricao_Completa;
	private double largura;
	private double altura;
	private double comprimento;
	private double peso;
	private boolean ativo;
	private double qtd_Estoque;
	private Integer tipo_Cadastro;
	private String id_Hierarquia;
	@Column(name="sigla_unidade_medida")
	private String sigla_Unidade_Medida;
	@Column(name="fatormultiplicacao")
	private double fatorMultiplicacao;
	@Column(name="datasinc")
	private Date dataSinc;

	public Produto() {

	}

	public Produto(Integer id, String referencia, String descricao, String descricao_Completa, double largura,
			double altura, double comprimento, double peso, boolean ativo, double qtd_Estoque, Integer tipo_Cadastro,
			String id_Hierarquia, String sigla_Unidade_Medida, double fatorMultiplicacao, Date dataSinc) {
		super();
		this.id = id;
		this.referencia = referencia;
		this.descricao = descricao;
		this.descricao_Completa = descricao_Completa;
		this.largura = largura;
		this.altura = altura;
		this.comprimento = comprimento;
		this.peso = peso;
		this.ativo = ativo;
		this.qtd_Estoque = qtd_Estoque;
		this.tipo_Cadastro = tipo_Cadastro;
		this.id_Hierarquia = id_Hierarquia;
		this.sigla_Unidade_Medida = sigla_Unidade_Medida;
		this.fatorMultiplicacao = 1;
		this.dataSinc = dataSinc;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao_Completa() {
		return descricao_Completa;
	}

	public void setDescricao_Completa(String descricao_Completa) {
		this.descricao_Completa = descricao_Completa;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
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

	public double getQtd_Estoque() {
		return qtd_Estoque;
	}

	public void setQtd_Estoque(double qtd_Estoque) {
		this.qtd_Estoque = qtd_Estoque;
	}

	public Integer getTipo_Cadastro() {
		return tipo_Cadastro;
	}

	public void setTipo_Cadastro(Integer tipo_Cadastro) {
		this.tipo_Cadastro = tipo_Cadastro;
	}

	public String getId_Hierarquia() {
		return id_Hierarquia;
	}

	public void setId_Hierarquia(String id_Hierarquia) {
		this.id_Hierarquia = id_Hierarquia;
	}

	public String getSigla_Unidade_Medida() {
		return sigla_Unidade_Medida;
	}

	public void setSigla_Unidade_Medida(String sigla_Unidade_Medida) {
		this.sigla_Unidade_Medida = sigla_Unidade_Medida;
	}

	public double getFatorMultiplicacao() {
		return fatorMultiplicacao;
	}

	public void setFatorMultiplicacao(double fatorMultiplicacao) {
		this.fatorMultiplicacao = fatorMultiplicacao;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
