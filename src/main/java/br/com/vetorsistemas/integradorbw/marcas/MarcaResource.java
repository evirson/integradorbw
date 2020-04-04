package br.com.vetorsistemas.integradorbw.marcas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaResource {

	@Autowired
	private MarcaService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {

		List<Marca> cobj = service.buscarTodos();

		return ResponseEntity.ok().body(cobj);

	}

}
