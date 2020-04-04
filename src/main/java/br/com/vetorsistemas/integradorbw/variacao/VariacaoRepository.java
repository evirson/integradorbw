package br.com.vetorsistemas.integradorbw.variacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariacaoRepository extends JpaRepository<Variacao, Integer>{
	

}
