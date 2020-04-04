package br.com.vetorsistemas.integradorbw.listas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/listas")
public class ListaResource {
	
	@Autowired
	private ListaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		
		
		List<Lista>  cobj = service.buscarTodos();
		
		return ResponseEntity.ok().body(cobj);
			
	}


}
