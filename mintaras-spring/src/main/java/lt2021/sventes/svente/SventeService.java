package lt2021.sventes.svente;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SventeService {

	@Autowired
	private SventeDAO sventeDAO;

	// create
	@Transactional
	public void createSvente(SventeInfo info) {
		Svente svente = new Svente(info.getPavadinimas(), info.getAprasymas(), info.getPaveiksliukas(), info.getTipas());
		sventeDAO.save(svente);
	}

	// update
	@Transactional
	public void updateSvente(long id,SventeInfo info) {
		Svente svente = sventeDAO.getOne(id);
		svente.setPavadinimas(info.getPavadinimas());
		svente.setAprasymas(info.getAprasymas());
		svente.setPaveiksliukas(info.getPaveiksliukas());
		svente.setTipas(info.getTipas());
		sventeDAO.save(svente);
	}
	
	// delete
	@Transactional
	public void deleteSvente(long id) {
		sventeDAO.deleteById(id);
	}

	// getall
	@Transactional
	public List<SventeInfo> getSventes() {
		return sventeDAO.findAll().stream().map(sv -> new SventeInfo(sv.getId(), sv.getPavadinimas(), sv.getAprasymas(),
				sv.getPaveiksliukas(), sv.getTipas())).collect(Collectors.toList());
	}

	// getone
	@Transactional
	public SventeInfo getSvente(long id) {
		SventeInfo result = null;
		Svente svente = sventeDAO.findById(id).orElse(null);
		if (svente != null) {
			result = new SventeInfo(svente.getId(), svente.getPavadinimas(), svente.getAprasymas(), svente.getPaveiksliukas(), svente.getTipas());
		}
		return result;
	}
}
