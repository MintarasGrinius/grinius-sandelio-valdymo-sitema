package lt2021.sandelis.services.ataskaita;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt2021.sandelis.services.inventorius.GetInventroiusResponse;
import lt2021.sandelis.services.inventorius.Inventorius;
import lt2021.sandelis.services.inventorius.InventoriusDAO;
import lt2021.sandelis.services.klientas.Klientas;
import lt2021.sandelis.services.klientas.KlientasDAO;
import lt2021.sandelis.services.klientas.KlientasResponse;

@Service
public class AtaskaitaService {
	@Autowired
	private InventoriusDAO inventoriusDAO;
	@Autowired
	private KlientasDAO klientasDAO;

	public int compare(Klientas obj1, Klientas obj2) {
		Double sumWeightOfObj1 = obj1.getInventorius().stream().map(Inventorius::getSvoris).reduce(0D, Double::sum);
		Double sumWeightOfObj2 = obj2.getInventorius().stream().map(Inventorius::getSvoris).reduce(0D, Double::sum);
		if (sumWeightOfObj1 > sumWeightOfObj2)
			return -1;
		else if (sumWeightOfObj2 > sumWeightOfObj1)
			return 1;
		else
			return 0;

	}

	@Transactional
	public List<KlientasResponse> get5KlientaiBendruDidžiausiuRegistruotųInventoriausSvoriu() {
		List<Klientas> klientai = klientasDAO.findAll();
		klientai.sort((Klientas obj1, Klientas obj2) -> compare(obj1, obj2));

		return klientai.subList(0, klientai.size() > 5 ? 5 : klientai.size()).stream()
				.map(k -> new KlientasResponse(k.getId(), k.getVardas(), k.getPavarde(), k.getGimimoData(),
						k.getTipas(),
						k.getInventorius().stream()
								.map(in -> new GetInventroiusResponse(in.getPavadinimas(), in.getSvoris(),
										in.getTalpinimoSektorius(), in.getData()))
								.collect(Collectors.toList())))
				.collect(Collectors.toList());
	}

	@Transactional
	public List<KlientasResponse> get5KlientaiBendruDidžiausiuRegistruotuInventoriausskaiciumi() {
		List<Klientas> klientai = klientasDAO.findAll();
		klientai.sort((Klientas obj1, Klientas obj2) -> obj2.getInventorius().size() - obj1.getInventorius().size());
		return klientai.subList(0, klientai.size() > 5 ? 5 : klientai.size()).stream()
				.map(k -> new KlientasResponse(k.getId(), k.getVardas(), k.getPavarde(), k.getGimimoData(),
						k.getTipas(),
						k.getInventorius().stream()
								.map(in -> new GetInventroiusResponse(in.getPavadinimas(), in.getSvoris(),
										in.getTalpinimoSektorius(), in.getData()))
								.collect(Collectors.toList())))
				.collect(Collectors.toList());
	}

}
