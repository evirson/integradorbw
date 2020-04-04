package br.com.vetorsistemas.integradorbw.listas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaService {

	@Autowired
	private ListaRepository repo;

	public List<Lista> buscarTodos(){
		
		List<Lista> cores  = repo.findAll();
		
		return cores;
	}

}
