package lt2021.sandelis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lt2021.sandelis.services.klientas.CreateRequest;
import lt2021.sandelis.services.klientas.KlientasResponse;
import lt2021.sandelis.services.klientas.KlientasService;
import lt2021.sandelis.services.klientas.UpdateRequest;

@RestController
@Api(value = "klientas")
@RequestMapping(value = "/api/klientas")
public class KlientasController {

	@Autowired
	private KlientasService service;

	// getall
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Gauna klientus", notes = "Grazina visus klientus")
	public List<KlientasResponse> getInventorius() {
		return service.getKlientas();
	}

	// create
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Sukuria klienta", notes = "Sukuria nauja klienta")
	public void createSvente(@RequestBody CreateRequest request) {
		service.createKlientas(request);
	}

	// getone
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Gauna klienta", notes = "Grazina klienta")
	public KlientasResponse getKlienta(@PathVariable long id) {
		return service.getKlientas(id);
	}

	// update
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Atnaujina klienta", notes = "Atnaujina viena klienta")
	public void updateKlientas(@PathVariable long id, @RequestBody UpdateRequest request) {
		service.updateKlientas(id, request);
	}

	// delete
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Instrina Klienta", notes = "Istrina viena klienta")
	public void deleteSvnete(@PathVariable long id) {
		service.deleteKlientas(id);
	}

	// test
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	String test() {
		return "Test pass";
	}

}
