package br.com.vetorsistemas.integradorbw.produtos.valores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorRepository extends JpaRepository<Valor, Integer> {
	
	@Query(value = "select codpro id_produto, codpro id_produto_codsinc, 2 id_lista_codsinc, venpra preco, codpro codsinc  "
			     + " from cadpro ", nativeQuery = true)
	
	List<Valor> findAll();

}