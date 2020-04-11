package br.com.vetorsistemas.integradorbw.variacao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VariacaoRepository extends JpaRepository<Variacao, Integer> {

	@Query(value = " select  cb.codbar codsinc " + " , cb.codpro referencia"
			+ " , coalesce((select sum(ce.qtdest) from cadest ce where ce.codbar = cb.codbar),0) estoque "
			+ " , 0.00 peso, case when cp.inativ = 'S' then false else true end ativo "
			+ " , cb.codpro id_produto, cb.codpro id_produto_codsinc "
			+ " , udf_cores(c1.nomcor, c2.nomcor, c3.nomcor) id_cor_codsinc " 
			+ " , tm.nomtam id_tamanho_codsinc "
			+ " from cadbar cb join cadpro cp on cp.codpro = cb.codpro "
			+ " join cadcor c1 on c1.codcor = cb.codcr1 join cadcor c2 on c2.codcor = cb.codcr2 "
			+ " join cadcor c3 on c3.codcor = cb.codcr3 join cadtam tm on tm.codtam = cb.codtam "
			+ " left join mvl_detpro dt on dt.codpro = cb.codpro "
			+ " order by cb.codpro ", nativeQuery = true)

	List<Variacao> findAll();

}
