package br.com.vetorsistemas.integradorbw.hierarquias;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HierarquiaService {

	@Autowired
	private HierarquiaRepository repo;

	public List<Hierarquia> buscarTodos(){
		
		List<Hierarquia> hierarquias  = repo.findAll();
		
		return hierarquias;
	}

}
