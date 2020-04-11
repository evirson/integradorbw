package br.com.vetorsistemas.integradorbw.variacao;

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
@RequestMapping(value="/variacao")
public class VariacaoController {
	
	@Autowired
	private VariacaoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() throws JsonProcessingException {
	
		List<Variacao>  variacoes = service.buscarTodos();

		List<Variacao> paginado = new ArrayList<>();

		int c = variacoes.size();
		int i = 0;
		int p = 1;

		while (i < c) {
			paginado.add(variacoes.get(i));

			if ((p == 100) || (p == (c))) {
				Servicebw.enviaDados(paginado, "produtos/variacao");

				p = 1;

				paginado.clear();
			}
			i++;
			p++;
		}

		return ResponseEntity.ok().body(paginado);

	}


}
