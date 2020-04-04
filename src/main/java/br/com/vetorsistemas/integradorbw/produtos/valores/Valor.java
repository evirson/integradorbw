package br.com.vetorsistemas.integradorbw.produtos.valores;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CADPRO")
public class Valor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codpro")
	private Integer id;
	@Column(name = "venpra")
	private double preco;
	@Column(name = "coddep")
	private Integer id_Lista; 
	@JsonIgnore
	private String ecomer; 

	public Valor() {

	}

	public Valor(Integer id, double preco, String ecomer, Integer id_Lista) {
		super();
		this.id = id;
		this.preco = preco;
		this.ecomer = ecomer;
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
	
	public String getEcomer() {
		return ecomer;
	}

	public void setEcomer(String ecomer) {
		this.ecomer = ecomer;
	}

	public Integer getId_Lista() {
		id_Lista = 1;
		return id_Lista;
	}

	public void setId_Lista(Integer id_Lista) {
		this.id_Lista = id_Lista;
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
		Valor other = (Valor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
