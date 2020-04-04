package br.com.vetorsistemas.integradorbw.produtos.valores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/valores")
public class ValorResource {

	@Autowired
	private ValorService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {

		List<Valor> obj = service.buscarTodos();

		return ResponseEntity.ok().body(obj);

	}

}
