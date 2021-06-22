package lt2021.sandelis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lt2021.sandelis.services.ataskaita.AtaskaitaService;
import lt2021.sandelis.services.klientas.KlientasResponse;

@RestController
@Api(value = "klientas")
@RequestMapping(value = "/api/ataskaita")
public class AtaskaitaController {

	@Autowired
	private AtaskaitaService service;

	// getall
	@RequestMapping(path = "/1", method = RequestMethod.GET)
	@ApiOperation(value = "Gauna klientus", notes = "Grazinami 5 klientai su bendru didžiausiu registruotų inventoriaus svoriu")
	public List<KlientasResponse> getAtaskaiata1() {
		return service.get5KlientaiBendruDidžiausiuRegistruotųInventoriausSvoriu();
	}

	// getall
	@RequestMapping(path = "/2", method = RequestMethod.GET)
	@ApiOperation(value = "Gauna klientus", notes = "Grazinami 5 klientai su bendru didžiausiu registruotu inventoriaus skaičiumi")
	public List<KlientasResponse> getAtaskaiata2() {
		return service.get5KlientaiBendruDidžiausiuRegistruotuInventoriausskaiciumi();
	}

}