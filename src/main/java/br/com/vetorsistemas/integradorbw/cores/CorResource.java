package br.com.vetorsistemas.integradorbw.cores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cores")
public class CorResource {
	
	@Autowired
	private CorService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		
		Cor obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
			
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> find1() {
		
		
		List<Cor>  cobj = service.buscarTodos();
		
		return ResponseEntity.ok().body(cobj);
			
	}


}
