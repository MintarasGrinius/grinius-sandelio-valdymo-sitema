package lt2021.sventes.valstybe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "valstybe")
@RequestMapping(value = "/api/valstybes")
public class ValstybeController {
	
	@Autowired
	private ValstybeService service;
	
	
	//getall
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Gauna valstybes", notes = "Grazina visus valstybes")
	public List<ValstybeInfo> getValstybes(){
		return service.getValstybe();
	}
	
	//create
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Sukuria valstybes", notes = "Sukuria nauja valstybes")
	public void createValstybe(@RequestBody ValstybeInfo info) {
		service.createValstybe(info);
	}
	
	//getone
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Gauna valstybe", notes = "Grazina viena valstybe")
	public ValstybeInfo getValstybe(@PathVariable long id) {
		return service.getValstybe(id);
	}
	
	//update
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Atnaujina valstybes", notes = "Atnaujina viena valstybe")
	public void updateValstybe(@PathVariable long id, @RequestBody ValstybeInfo info) {
		service.updateValstybe(id, info);
	}
	
	//delete
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Instrina valstybes", notes = "Istrina viena valstybe")
	public void deleteSvnete(@PathVariable long id) {
		service.deleteValstybe(id);
	}
	
	//test
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	String test() {
		return "Test pass";
	}
	
}
