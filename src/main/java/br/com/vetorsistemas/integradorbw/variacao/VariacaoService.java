package br.com.vetorsistemas.integradorbw.variacao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VariacaoService {

	@Autowired
	private VariacaoRepository repo;

	public Variacao buscar(Integer id) {

		Optional<Variacao> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
	
	public List<Variacao> buscarTodos(){
		
		List<Variacao> variacao  = repo.findAll();
		
		return variacao;
	}

}
