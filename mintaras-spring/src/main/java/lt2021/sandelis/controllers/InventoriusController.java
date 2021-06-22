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
import lt2021.sandelis.services.inventorius.CreateRequest;
import lt2021.sandelis.services.inventorius.GetInventroiusResponse;
import lt2021.sandelis.services.inventorius.InventoriusService;
import lt2021.sandelis.services.inventorius.UpdateRequest;

@RestController
@Api(value = "inventorius")
@RequestMapping(value = "/api/inventorius")
public class InventoriusController {

	@Autowired
	private InventoriusService service;

	// getall
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Gauna inventorius", notes = "Grazina visa inventoriu")
	public List<GetInventroiusResponse> getInventorius() {
		return service.getInventorius();
	}

	// create
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Sukuria inventoriu", notes = "Sukuria nauja inventoriu")
	public void createSvente(@RequestBody CreateRequest request) {
		service.createInventorius(request);
	}

	// getone
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Gauna inventoriu", notes = "Grazina inventoriaus vieneta")
	public GetInventroiusResponse getSvente(@PathVariable long id) {
		return service.getInventorius(id);
	}

	// update
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Atnaujina inventoriu", notes = "Atnaujina viena inventoriu")
	public void updateInventoriu(@PathVariable long id, @RequestBody UpdateRequest request) {
		service.updateInventorius(id, request);
	}

	// delete
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Instrina inventoriu", notes = "Istrina viena inventoriu")
	public void deleteSvnete(@PathVariable long id) {
		service.deleteInventorius(id);
	}

	// test
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	String test() {
		return "Test pass";
	}

}
