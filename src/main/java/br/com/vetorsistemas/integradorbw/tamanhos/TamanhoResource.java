package br.com.vetorsistemas.integradorbw.tamanhos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/tamanhos")
public class TamanhoResource {
	
	@Autowired
	private TamanhoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		
		
		Tamanho obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
			
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		
		
		List<Tamanho>  cobj = service.buscarTodos();
		
		return ResponseEntity.ok().body(cobj);
			
	}


}
