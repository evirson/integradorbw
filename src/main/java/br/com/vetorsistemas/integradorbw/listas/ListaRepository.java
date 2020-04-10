package br.com.vetorsistemas.integradorbw.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Integer> {

	default List<Lista> findAll() {
		List<Lista> lista = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			Lista x = new Lista();

			x.setId(i);
			x.setIndice(1);

			switch (i) {
			case 1:
				x.setDescricao("Clientes");
				x.setTipo(1);
				break;

			case 2:
				x.setDescricao("Normal");
				x.setTipo(2);
				break;

			case 3:
				x.setDescricao("Oferta");
				x.setTipo(2);
				break;
			default:
				x.setDescricao("Não Nominado");
				x.setTipo(2);

			}

			lista.add(x);
		}

		return lista;
	}
}
