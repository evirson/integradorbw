package br.com.vetorsistemas.integradorbw.produtos.valores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValorService {

	@Autowired
	private ValorRepository repo;

	public List<Valor> buscarTodos() {

		List<Valor> produtos  = repo.findAll();
		
		return produtos;

	}

}
