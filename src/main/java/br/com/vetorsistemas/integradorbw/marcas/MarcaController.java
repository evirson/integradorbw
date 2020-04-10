package br.com.vetorsistemas.integradorbw.marcas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.vetorsistemas.integradorbw.Servicebw;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaController {

	@Autowired
	private MarcaService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() throws JsonProcessingException {

		List<Marca> marcas = service.buscarTodos();

		List<Marca> paginado = new ArrayList<>();

		int c = marcas.size();
		int i = 1;
		int p = 1;

		while (i < c) {
			paginado.add(marcas.get(i));
		
			if ((p == 100) || (p == (c))) {
				Servicebw.enviaDados(paginado, "marcas");
				
				p = 0;
			    
			    paginado.clear();
			}
			
			i++;
			p++;
		}

		return ResponseEntity.ok().body(paginado);

	}

}
