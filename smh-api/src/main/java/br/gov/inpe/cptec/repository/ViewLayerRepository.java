package br.gov.inpe.cptec.repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import br.gov.inpe.cptec.model.ViewLayer;

public interface ViewLayerRepository extends JpaRepository<ViewLayer, Integer> {

//	Optional<ViewLayer> findByDescricaoAndNomeProspecto(String layername);

//	@Query("SELECT c FROM an_municipio_clim_daily c where c.fid = :fid")
//	Optional<ViewLayer> findNomeById(@Param("fid") Long id);

//	List<ViewLayer> findByNome(@Param("name") String name);

	@Query(value = "SELECT l.id,l.name As layername,workspace,uri, v.name, v.source_type from terrama2.layers l inner join terrama2.registered_views rv on l.registered_view_id = rv.id inner join terrama2.views v on rv.view_id = v.id", nativeQuery = true)
	List<ViewLayer> findAllLayers();

	

}
