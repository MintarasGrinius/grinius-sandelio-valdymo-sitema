package lt2021.sventes.valstybe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Valstybe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String pavadinimas;

	@Column
	private String veliavosNuotrauka;

	@Column
	private String prezidentas;

	public Valstybe() {
	}

	public Valstybe(String pavadinimas, String veliavosNuotrauka, String prezidentas) {
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