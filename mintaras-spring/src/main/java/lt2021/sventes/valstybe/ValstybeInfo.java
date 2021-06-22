package lt2021.sventes.valstybe;

public class ValstybeInfo {

	private long id;
	private String pavadinimas;
	private String veliavosNuotrauka;
	private String prezidentas;

	public ValstybeInfo() {
	}

	public ValstybeInfo(long id, String pavadinimas, String veliavosNuotrauka, String prezidentas) {
		super();
		this.id = id;
		this.pavadinimas = pavadinimas;
		this.veliavosNuotrauka = veliavosNuotrauka;
		this.prezidentas = prezidentas;
	}

	public ValstybeInfo(String pavadinimas, String veliavosNuotrauka, String prezidentas) {
		super();
		this.pavadinimas = pavadinimas;
		this.veliavosNuotrauka = veliavosNuotrauka;
		this.prezidentas = prezidentas;
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

	public String getVeliavosNuotrauka() {
		return veliavosNuotrauka;
	}

	public void setVeliavosNuotrauka(String veliavosNuotrauka) {
		this.veliavosNuotrauka = veliavosNuotrauka;
	}

	public String getPrezidentas() {
		return prezidentas;
	}

	public void setPrezidentas(String prezidentas) {
		this.prezidentas = prezidentas;
	}

}