package br.com.vetorsistemas.integradorbw.hierarquias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HierarquiaRepository extends JpaRepository<Hierarquia, Integer>{
	

}
