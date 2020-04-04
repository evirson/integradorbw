package br.com.vetorsistemas.integradorbw.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Integer>{
	
	   default List<Lista> findAll(){
	        List<Lista> lista = new ArrayList<>();
	        for (int i = 1; i <= 1; i++){
	            Lista x = new Lista();
	            x.setId(i);
	            x.setDescricao("Padrao");

	            lista.add(x);
	        }

	        return lista;
	    }
}
