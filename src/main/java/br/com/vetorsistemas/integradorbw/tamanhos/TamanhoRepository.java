package br.com.vetorsistemas.integradorbw.tamanhos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TamanhoRepository extends JpaRepository<Tamanho, Integer> {
	@Query(value = " select nomtam codsinc, nomtam descricao from cadtam order by nomtam ", nativeQuery = true)

	List<Tamanho> findAll();
}