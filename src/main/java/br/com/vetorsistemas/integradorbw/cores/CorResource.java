package br.com.vetorsistemas.integradorbw.cores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cores")
public class CorResource {
	
	@Autowired
	private CorService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		
		
		List<Cor>  cobj = service.buscarTodos();
		
		return ResponseEntity.ok().body(cobj);
			
	}


}
