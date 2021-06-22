package lt2021.sandelis.services.inventorius;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt2021.sandelis.services.klientas.Klientas;
import lt2021.sandelis.services.klientas.KlientasDAO;

@Service
public class InventoriusService {

	@Autowired
	private InventoriusDAO inventoriusDAO;
	@Autowired
	private KlientasDAO klientasDAO;

	// create
	@Transactional
	public void createInventorius(CreateRequest request) {
		Klientas klientas = klientasDAO.getOne(request.getKlientasId());
		Inventorius inventorius = new Inventorius(request.getPavadinimas(), request.getSvoris(),
				request.getTalpinimoSektorius(), request.getData(), klientas);
		inventoriusDAO.save(inventorius);
	}

	// update
	@Transactional
	public void updateInventorius(long id, UpdateRequest request) {
		Inventorius inventorius = inventoriusDAO.getOne(id);
		inventorius.setPavadinimas(request.getPavadinimas());
		inventorius.setSvoris(request.getSvoris());
		inventorius.setTalpinimoSektorius(request.getTalpinimoSektorius());
		inventorius.setData(request.getData());
		inventoriusDAO.save(inventorius);
	}

	// delete
	@Transactional
	public void deleteInventorius(long id) {
		inventoriusDAO.deleteById(id);
	}

	// getall
	@Transactional
	public List<GetInventroiusResponse> getInventorius() {
		return inventoriusDAO.findAll().stream().map(iv -> new GetInventroiusResponse(iv.getPavadinimas(),
				iv.getSvoris(), iv.getTalpinimoSektorius(), iv.getData())).collect(Collectors.toList());
	}

	// getone
	@Transactional
	public GetInventroiusResponse getInventorius(long id) {
		GetInventroiusResponse response = null;
		Inventorius inventorius = inventoriusDAO.findById(id).orElse(null);
		if (inventorius != null) {
			response = new GetInventroiusResponse(inventorius.getPavadinimas(), inventorius.getSvoris(),
					inventorius.getTalpinimoSektorius(), inventorius.getData());
		}
		return response;
	}
}
