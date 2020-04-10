package br.com.vetorsistemas.integradorbw.marcas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {

	@Autowired
	private MarcaRepository repo;

	public List<Marca> buscarTodos() {

		List<Marca> marcas  = repo.findAll();
		
		return marcas;

	}

}
