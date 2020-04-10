package br.com.vetorsistemas.integradorbw.marcas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, String> {

	@Query(value = "select marpro codsinc, marpro  from cadpro group by marpro", nativeQuery = true)
	
	List<Marca> findAll();
	
}