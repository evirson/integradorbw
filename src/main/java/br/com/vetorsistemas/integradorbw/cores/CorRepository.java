package br.com.vetorsistemas.integradorbw.cores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CorRepository extends JpaRepository<Cor, Integer> {
	
	@Query(value = " select udf_cores(c1.nomcor, c2.nomcor, c3.nomcor) id, "
			+ " udf_cores(c1.nomcor, c2.nomcor, c3.nomcor) descricao, " + " max(cb.datexp) datasinc  "
			+ " from cadbar cb " + " join cadcor c1 on c1.codcor = cb.codcr1 "
			+ " join cadcor c2 on c2.codcor = cb.codcr2 " + " join cadcor c3 on c3.codcor = cb.codcr3 "
			+ " group by udf_cores(c1.nomcor, c2.nomcor, c3.nomcor) "
			+ " order by udf_cores(c1.nomcor, c2.nomcor, c3.nomcor) ", nativeQuery = true)

	List<Cor> findAll();

}
