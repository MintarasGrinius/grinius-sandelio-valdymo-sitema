package lt2021.sventes.valstybe;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ValstybeService {

	@Autowired
	private ValstybeDAO valstybeDAO;

	// create
	@Transactional
	public void createValstybe(ValstybeInfo info) {
		Valstybe valstybe = new Valstybe(info.getPavadinimas(), info.getVeliavosNuotrauka(), info.getPrezidentas());
		valstybeDAO.save(valstybe);
	}

	// update
	@Transactional
	public void updateValstybe(long id,ValstybeInfo info) {
		Valstybe valstybe = valstybeDAO.getOne(id);
		valstybe.setPavadinimas(info.getPavadinimas());
		valstybe.setVeliavosNuotrauka(info.getVeliavosNuotrauka());
		valstybe.setPrezidentas(info.getPrezidentas());
		valstybeDAO.save(valstybe);
	}
	
	// delete
	@Transactional
	public void deleteValstybe(long id) {
		valstybeDAO.deleteById(id);
	}

	// getall
	@Transactional
	public List<ValstybeInfo> getValstybe() {
		return valstybeDAO.findAll().stream().map(sv -> new ValstybeInfo(sv.getId(), sv.getPavadinimas(), sv.getVeliavosNuotrauka(),sv.getPrezidentas())).collect(Collectors.toList());
	}

	// getone
	@Transactional
	public ValstybeInfo getValstybe(long id) {
		ValstybeInfo result = null;
		Valstybe valstybe = valstybeDAO.findById(id).orElse(null);
		if (valstybe != null) {
			result = new ValstybeInfo(id, valstybe.getPavadinimas(), valstybe.getVeliavosNuotrauka(), valstybe.getPrezidentas());
		}
		return result;
	}
}
