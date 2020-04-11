package br.com.vetorsistemas.integradorbw.produtos.valores;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "CADPRO")
public class Valor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_produto")
	@JsonProperty("Id_Produto")
	private Integer id_Produto;
	@Column(name = "id_produto_codsinc")
	@JsonProperty("Id_Produto_CodSinc")
	private String id_Produto_CodSInc;
	@Column(name = "preco")
	@JsonProperty("Preco")
	private double preco;
	@Column(name = "id_lista_codsinc")
	@JsonProperty("Id_Lista_CodSinc")
	private Integer id_Lista_CodSinc;
	@Column(name = "codsinc")
	@JsonProperty("CodSinc")
	private Integer codSinc;

	public Valor() {

	}

	public Valor(Integer id_Produto, String id_Produto_CodSInc, double preco, Integer id_Lista_CodSinc,
			Integer codSinc) {
		super();
		this.id_Produto = id_Produto;
		this.id_Produto_CodSInc = id_Produto_CodSInc;
		this.preco = preco;
		this.id_Lista_CodSinc = id_Lista_CodSinc;
		this.codSinc = codSinc;
	}

	public Integer getId_Produto() {
		return id_Produto;
	}

	public void setId_Produto(Integer id_Produto) {
		this.id_Produto = id_Produto;
	}

	public String getId_Produto_CodSInc() {
		return id_Produto_CodSInc;
	}

	public void setId_Produto_CodSInc(String id_Produto_CodSInc) {
		this.id_Produto_CodSInc = id_Produto_CodSInc;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Integer getId_Lista_CodSinc() {
		return id_Lista_CodSinc;
	}

	public void setId_Lista_CodSinc(Integer id_Lista_CodSinc) {
		this.id_Lista_CodSinc = id_Lista_CodSinc;
	}

	public Integer getCodSinc() {
		return codSinc;
	}

	public void setCodSinc(Integer codSinc) {
		this.codSinc = codSinc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codSinc == null) ? 0 : codSinc.hashCode());
		result = prime * result + ((id_Lista_CodSinc == null) ? 0 : id_Lista_CodSinc.hashCode());
		result = prime * result + ((id_Produto == null) ? 0 : id_Produto.hashCode());
		result = prime * result + ((id_Produto_CodSInc == null) ? 0 : id_Produto_CodSInc.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Valor other = (Valor) obj;
		if (codSinc == null) {
			if (other.codSinc != null)
				return false;
		} else if (!codSinc.equals(other.codSinc))
			return false;
		if (id_Lista_CodSinc == null) {
			if (other.id_Lista_CodSinc != null)
				return false;
		} else if (!id_Lista_CodSinc.equals(other.id_Lista_CodSinc))
			return false;
		if (id_Produto == null) {
			if (other.id_Produto != null)
				return false;
		} else if (!id_Produto.equals(other.id_Produto))
			return false;
		if (id_Produto_CodSInc == null) {
			if (other.id_Produto_CodSInc != null)
				return false;
		} else if (!id_Produto_CodSInc.equals(other.id_Produto_CodSInc))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}


}
