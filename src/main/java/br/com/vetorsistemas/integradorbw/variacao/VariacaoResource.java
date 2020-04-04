package br.com.vetorsistemas.integradorbw.variacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/variacao")
public class VariacaoResource {
	
	@Autowired
	private VariacaoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		
		
		List<Variacao>  cobj = service.buscarTodos();
		
		return ResponseEntity.ok().body(cobj);
			
	}


}
