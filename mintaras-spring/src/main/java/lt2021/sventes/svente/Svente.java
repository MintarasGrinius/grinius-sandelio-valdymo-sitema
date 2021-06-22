package lt2021.sventes.svente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Svente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String pavadinimas;

	@Column
	private String aprasymas;

	@Column
	private String paveiksliukas;

	@Column
	private Tipas tipas;

	public Svente() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getAprasymas() {
		return aprasymas;
	}

	public void setAprasymas(String aprasymas) {
		this.aprasymas = aprasymas;
	}

	public String getPaveiksliukas() {
		return paveiksliukas;
	}

	public void setPaveiksliukas(String paveiksliukas) {
		this.paveiksliukas = paveiksliukas;
	}

	public Tipas getTipas() {
		return tipas;
	}

	public void setTipas(Tipas tipas) {
		this.tipas = tipas;
	}

	public Svente(String pavadinimas, String aprasymas, String paveiksliukas, Tipas tipas) {
		super();
		this.pavadinimas = pavadinimas;
		this.aprasymas = aprasymas;
		this.paveiksliukas = paveiksliukas;
		this.tipas = tipas;
	}

}
