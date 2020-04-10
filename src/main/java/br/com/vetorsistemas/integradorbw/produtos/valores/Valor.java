package br.com.vetorsistemas.integradorbw.produtos.valores;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "CADPRO")
public class Valor  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codpro")
	@JsonProperty("Id_Produto")
	private Integer id;
	@Column(name = "venpra")
	@JsonProperty("Preco")
	private double preco;
	@Transient
	@JsonProperty("Id_Lista_CodSinc")
	private Integer id_Lista; 
    @Transient
	@JsonProperty("CodSinc")
	private Integer codSinc; 

	public Valor() {

	}

	public Valor(Integer id, double preco, Integer id_Lista) {
		super();
		this.id = id;
		this.preco = preco;
		this.id_Lista = id_Lista;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Integer getId_Lista() {
		return 2;
	}

	public void setId_Lista(Integer id_Lista) {
		this.id_Lista = id_Lista;
	}

	public Integer getCodSinc() {
		return codSinc;
	}

	public void setCodSinc(Integer codSinc) {
		this.codSinc = this.id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valor other = (Valor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
