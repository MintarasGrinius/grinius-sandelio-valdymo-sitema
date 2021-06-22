package lt2021.sandelis.services.klientas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt2021.sandelis.services.inventorius.GetInventroiusResponse;

@Service
public class KlientasService {

	@Autowired
	private KlientasDAO klientasDAO;

	// create
	@Transactional
	public void createKlientas(CreateRequest request) {
		Klientas klientas = new Klientas(request.getVardas(), request.getPavarde(), request.getGimimoData(),
				request.getTipas(), new ArrayList<>());
		klientasDAO.save(klientas);
	}

	// update
	@Transactional
	public void updateKlientas(long id, UpdateRequest request) {
		Klientas klientas = klientasDAO.getOne(id);
		klientas.setVardas(request.getVardas());
		klientas.setPavarde(request.getPavarde());
		klientas.setGimimoData(request.getGimimoData());
		klientas.setTipas(request.getTipas());
		klientasDAO.save(klientas);
	}

	// delete
	@Transactional
	public void deleteKlientas(long id) {
		klientasDAO.deleteById(id);
	}

	// getall
	@Transactional
	public List<KlientasResponse> getKlientas() {
		return klientasDAO.findAll().stream()
				.map(k -> new KlientasResponse(k.getId(), k.getVardas(), k.getPavarde(), k.getGimimoData(),
						k.getTipas(),
						k.getInventorius().stream()
								.map(in -> new GetInventroiusResponse(in.getPavadinimas(), in.getSvoris(),
										in.getTalpinimoSektorius(), in.getData()))
								.collect(Collectors.toList())))
				.collect(Collectors.toList());
	}

	// getone
	@Transactional
	public KlientasResponse getKlientas(long id) {
		KlientasResponse response = null;
		Klientas klientas = klientasDAO.findById(id).orElse(null);
		if (klientas != null) {
			List<GetInventroiusResponse> inventorius = klientas.getInventorius().stream()
					.map(in -> new GetInventroiusResponse(in.getPavadinimas(), in.getSvoris(),
							in.getTalpinimoSektorius(), in.getData()))
					.collect(Collectors.toList());
			response = new KlientasResponse(klientas.getId(), klientas.getVardas(), klientas.getPavarde(),
					klientas.getGimimoData(), klientas.getTipas(), inventorius);
		}
		return response;
	}
}
