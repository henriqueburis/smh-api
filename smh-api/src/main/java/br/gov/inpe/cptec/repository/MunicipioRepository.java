package br.gov.inpe.cptec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.inpe.cptec.model.Municipios;

public interface MunicipioRepository extends JpaRepository<Municipios, Integer> {

	@Query(value = "SELECT m.fid, m.geocodigo, m.nome1, m.latitude, m.longitude FROM municipios_brasil m where m.uf = :uf", nativeQuery = true)
	List<Municipios> findMunicipioByUF(@Param("uf") String uf);

}
