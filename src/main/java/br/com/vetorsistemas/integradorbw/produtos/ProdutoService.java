package br.com.vetorsistemas.integradorbw.produtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public List<Produto> buscarTodos() {

		List<Produto> produtos  = repo.findAll();
		
		return produtos;

	}

}
