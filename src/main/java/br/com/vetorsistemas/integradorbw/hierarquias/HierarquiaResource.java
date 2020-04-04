package br.com.vetorsistemas.integradorbw.hierarquias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/hierarquias")
public class HierarquiaResource {
	
	@Autowired
	private HierarquiaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		
		
		List<Hierarquia>  cobj = service.buscarTodos();
		
		return ResponseEntity.ok().body(cobj);
		
		
	}


}
