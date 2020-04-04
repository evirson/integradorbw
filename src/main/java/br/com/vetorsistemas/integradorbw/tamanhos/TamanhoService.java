package br.com.vetorsistemas.integradorbw.tamanhos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TamanhoService {

	@Autowired
	private TamanhoRepository repo;

	public Tamanho buscar(Integer id) {

		Optional<Tamanho> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
	
	public List<Tamanho> buscarTodos(){
		
		List<Tamanho> cores  = repo.findAll();
		
		return cores;
	}

}
