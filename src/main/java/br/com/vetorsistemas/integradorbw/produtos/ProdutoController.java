package br.com.vetorsistemas.integradorbw.produtos;

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
@RequestMapping(value = "/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() throws JsonProcessingException {

		List<Produto> produtos = service.buscarTodos();
		List<Produto> paginado = new ArrayList<>();

		int c = produtos.size();
		int i = 0;
		int p = 0;
		
		while (i < c) {
			paginado.add(produtos.get(i));
			i++;
			p++;
			
		
			if ((p == 100) || (p == (c-1))) {
				Servicebw.enviaDados(paginado, "produtos");
				
				p = 0;
			    
			    paginado.clear();
			}
		}

		return ResponseEntity.ok().body(paginado);


	}

}
