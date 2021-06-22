package lt2021.sandelis.services.inventorius;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lt2021.sandelis.services.klientas.Klientas;

@Entity
public class Inventorius {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String pavadinimas;

	@Column
	private String svoris;

	@Column
	private String talpinimoSektorius;

	@Column
	private Date data;

	@ManyToOne
	@JoinColumn(name = "klientas_id")
	private Klientas klientas;

	public Inventorius() {
		super();
	}

	public Inventorius(String pavadinimas, String svoris, String talpinimoSektorius, Date data, Klientas klientas) {
		super();
		this.pavadinimas = pavadinimas;
		this.svoris = svoris;
		this.talpinimoSektorius = talpinimoSektorius;
		this.data = data;
		this.klientas = klientas;
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

	public String getSvoris() {
		return svoris;
	}

	public void setSvoris(String svoris) {
		this.svoris = svoris;
	}

	public String getTalpinimoSektorius() {
		return talpinimoSektorius;
	}

	public void setTalpinimoSektorius(String talpinimoSektorius) {
		this.talpinimoSektorius = talpinimoSektorius;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Klientas getKlientas() {
		return klientas;
	}

	public void setKlientas(Klientas klientas) {
		this.klientas = klientas;
	}

}
