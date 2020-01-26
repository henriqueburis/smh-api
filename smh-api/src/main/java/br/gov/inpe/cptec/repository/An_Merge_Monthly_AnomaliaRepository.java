package br.gov.inpe.cptec.repository;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.inpe.cptec.model.An_Merge_Monthly_Anomalia;

public interface An_Merge_Monthly_AnomaliaRepository extends JpaRepository<An_Merge_Monthly_Anomalia, BigInteger> {

	@Query(value = "SELECT mb.fid, mb.geocodigo, cast((amm.media - anm.media) AS NUMERIC(15,2))*30 as valor , to_char(amm.execution_date, 'Month') as mes, mb.nome1, mb.uf, EXTRACT(YEAR from amm.execution_date) ano FROM municipios_brasil mb INNER JOIN an_municipio_clim_monthly anm ON mb.fid = anm.fid INNER JOIN an_municipio_monthly amm ON mb.fid = amm.fid where mb.geocodigo = :geocodigo and amm.execution_date BETWEEN :dataInit and :dataFim and EXTRACT(Month from anm.execution_date) = EXTRACT(Month from amm.execution_date) Order by amm.execution_date", nativeQuery = true)
	List<An_Merge_Monthly_Anomalia> findAn_Merge_Monthly_Anomalia(String geocodigo, Date dataInit, Date dataFim);

}
