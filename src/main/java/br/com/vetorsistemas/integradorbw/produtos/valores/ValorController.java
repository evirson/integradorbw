package br.com.vetorsistemas.integradorbw.produtos.valores;

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
@RequestMapping(value = "/valores")
public class ValorController {

	@Autowired
	private ValorService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() throws JsonProcessingException {

		List<Valor> valores = service.buscarTodos();
		List<Valor> paginado = new ArrayList<>();

		int c = valores.size();
		int i = 0;
		int p = 1;
		
		while (i < c) {
			paginado.add(valores.get(i));

			if ((p == 100) || (p == (c))) {
				Servicebw.enviaDados(paginado, "produtos/valores");
				
				p = 1;
			    
			    paginado.clear();
			}
			i++;
			p++;
		}

		return ResponseEntity.ok().body(paginado);


	}

}
