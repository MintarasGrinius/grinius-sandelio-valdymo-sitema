package lt2021.sventes.svente;

public class SventeInfo {

	private long id;
	private String pavadinimas;
	private String aprasymas;
	private String paveiksliukas;
	private Tipas tipas;

	public SventeInfo(long id, String pavadinimas, String aprasymas, String paveiksliukas, Tipas tipas) {
		super();
		this.id = id;
		this.pavadinimas = pavadinimas;
		this.aprasymas = aprasymas;
		this.paveiksliukas = paveiksliukas;
		this.tipas = tipas;
	}

	public SventeInfo() {
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

	public SventeInfo(String pavadinimas, String aprasymas, String paveiksliukas, Tipas tipas) {
		super();
		this.pavadinimas = pavadinimas;
		this.aprasymas = aprasymas;
		this.paveiksliukas = paveiksliukas;
		this.tipas = tipas;
	}

}
