package br.gov.inpe.cptec.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
//import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import br.gov.inpe.cptec.model.An_Merge_Monthly_Anomalia;
import br.gov.inpe.cptec.model.An_Merge_Monthly_Media;
import br.gov.inpe.cptec.model.An_Merge_Monthly_Maxima;
import br.gov.inpe.cptec.model.Municipios;
import br.gov.inpe.cptec.model.ViewLayer;
import br.gov.inpe.cptec.repository.An_Merge_Monthly_AnomaliaRepository;
import br.gov.inpe.cptec.repository.An_Merge_Monthly_MaximaRepository;
import br.gov.inpe.cptec.repository.An_Merge_Monthly_MediaRepository;
import br.gov.inpe.cptec.repository.MunicipioRepository;
import br.gov.inpe.cptec.repository.ViewLayerRepository;

@CrossOrigin
@RestControllerAdvice
@RequestMapping("/smh-api/resources")
public class SmhController {

	SimpleDateFormat dateFormate = new SimpleDateFormat("MM-dd-yyyy hh:mm");

	@Autowired
	private ViewLayerRepository viewLayer;

	@Autowired
	private MunicipioRepository municipio;

	@Autowired
	private An_Merge_Monthly_MaximaRepository an_Merge_Monthly_Maxima;

	@Autowired
	private An_Merge_Monthly_MediaRepository an_Merge_Monthly_Media;

	@Autowired
	private An_Merge_Monthly_AnomaliaRepository an_Merge_Monthly_Anomalia;

	@GetMapping("/teste")
	public ResponseEntity<String> buscar() {
		return ResponseEntity.ok("OK");
	}

	@GetMapping("/viewslayers")
	public List<ViewLayer> listarLayers() {
		return viewLayer.findAllLayers();
	}

	@GetMapping("/municipios/{uf}")
	public List<Municipios> listarMunicipio(@PathVariable String uf) {
		return municipio.findMunicipioByUF(uf);
	}

	@GetMapping("/an_merge_monthly_maxima/{geocodigo}/{dataInit}/{dataFim}")
	public List<An_Merge_Monthly_Maxima> listarAn_Merge_Monthly_Maxima(@PathVariable String geocodigo,
			@PathVariable String dataInit, @PathVariable String dataFim) throws ParseException {
		return an_Merge_Monthly_Maxima.findAn_Merge_Monthly_Maxima(geocodigo, dateFormate.parse(dataInit),
				dateFormate.parse(dataFim));
	}

	@GetMapping("/an_Merge_Monthly_Anomalia/{geocodigo}/{dataInit}/{dataFim}")
	public List<An_Merge_Monthly_Anomalia> listarAn_Merge_Monthly_Anomalia(@PathVariable String geocodigo,
			@PathVariable String dataInit, @PathVariable String dataFim) throws ParseException {
		return an_Merge_Monthly_Anomalia.findAn_Merge_Monthly_Anomalia(geocodigo, dateFormate.parse(dataInit),
				dateFormate.parse(dataFim));
	}

	@GetMapping("/an_Merge_Monthly_Media/{geocodigo}/{dataInit}/{dataFim}")
	public List<An_Merge_Monthly_Media> listarAn_Merge_Monthly_Media(@PathVariable String geocodigo,
			@PathVariable String dataInit, @PathVariable String dataFim) throws ParseException {
		return an_Merge_Monthly_Media.findAn_Merge_Monthly_Media(geocodigo, dateFormate.parse(dataInit),
				dateFormate.parse(dataFim));
	}

}
