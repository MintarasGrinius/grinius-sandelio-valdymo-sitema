package lt2021.sventes.svente;

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
@Api(value = "svente")
@RequestMapping(value = "/api/sventes")
public class SventeController {
	
	@Autowired
	private SventeService service;
	
	
	//getall
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Gauna sveikinimus", notes = "Grazina visus sveikinimus")
	public List<SventeInfo> getSventes(){
		return service.getSventes();
	}
	
	//create
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Sukuria sveikinimus", notes = "Sukuria nauja sveikinimus")
	public void createSvente(@RequestBody SventeInfo info) {
		service.createSvente(info);
	}
	
	//getone
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Gauna sveikinima", notes = "Grazina viena sveikinima")
	public SventeInfo getSvente(@PathVariable long id) {
		return service.getSvente(id);
	}
	
	//update
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Atnaujina sveikinimus", notes = "Atnaujina viena sveikinima")
	public void updateSvente(@PathVariable long id, @RequestBody SventeInfo info) {
		service.updateSvente(id, info);
	}
	
	//delete
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Instrina sveikinimus", notes = "Istrina viena sveikinima")
	public void deleteSvnete(@PathVariable long id) {
		service.deleteSvente(id);
	}
	
	//test
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	String test() {
		return "Test pass";
	}
	
}
