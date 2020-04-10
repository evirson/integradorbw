package br.com.vetorsistemas.integradorbw.listas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.vetorsistemas.integradorbw.Servicebw;

@RestController
@RequestMapping(value="/listas")
public class ListaController {
	
	@Autowired
	private ListaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() throws JsonProcessingException {
		
		
		List<Lista>  listas = service.buscarTodos();
       
		Servicebw.enviaDados(listas, "listas");
		
		return ResponseEntity.ok().body(listas);
			
	}


}
