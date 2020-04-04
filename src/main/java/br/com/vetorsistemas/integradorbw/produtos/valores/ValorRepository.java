package br.com.vetorsistemas.integradorbw.produtos.valores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorRepository extends JpaRepository<Valor, Integer> {
	


	
	
}