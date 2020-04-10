package br.com.vetorsistemas.integradorbw.cores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorService {

	@Autowired
	private CorRepository repo;

	public Cor buscar(Integer id) {

		Optional<Cor> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
	
	public List<Cor> buscarTodos(){
		
		List<Cor> cores  =  repo.findAll();
		
		return cores;
	}

}
