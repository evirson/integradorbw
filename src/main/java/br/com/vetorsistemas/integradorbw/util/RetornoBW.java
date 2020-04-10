package br.com.vetorsistemas.integradorbw.util;

import java.util.ArrayList;
import java.util.List;

public class RetornoBW {
	
	private List<String> registros = new ArrayList<>();
	private List<String> erros = new ArrayList<>();
	private String dataHoraServidor;
	private Integer totalRegistros;
	private Integer totalPaginas;
	private Integer limitePagina;
		
	public RetornoBW(List<String> registros, List<String> erros, String dataHoraServidor, Integer totalRegistros,
			Integer totalPaginas, Integer limitePagina) {
		super();
		this.registros = registros;
		this.erros = erros;
		this.dataHoraServidor = dataHoraServidor;
		this.totalRegistros = totalRegistros;
		this.totalPaginas = totalPaginas;
		this.limitePagina = limitePagina;
	}

	public List<String> getRegistros() {
		return registros;
	}

	public void setRegistros(List<String> registros) {
		this.registros = registros;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

	public String getDataHoraServidor() {
		return dataHoraServidor;
	}

	public void setDataHoraServidor(String dataHoraServidor) {
		this.dataHoraServidor = dataHoraServidor;
	}

	public Integer getTotalRegistros() {
		return totalRegistros;
	}

	public void setTotalRegistros(Integer totalRegistros) {
		this.totalRegistros = totalRegistros;
	}

	public Integer getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(Integer totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public Integer getLimitePagina() {
		return limitePagina;
	}

	public void setLimitePagina(Integer limitePagina) {
		this.limitePagina = limitePagina;
	}
	
	
	

}
