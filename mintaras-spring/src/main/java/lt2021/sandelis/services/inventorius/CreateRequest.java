package lt2021.sandelis.services.inventorius;

import java.util.Date;

public class CreateRequest {

	private String pavadinimas;
	private double svoris;
	private String talpinimoSektorius;
	private Date data;
	private long klientasId;

	public CreateRequest(String pavadinimas, double svoris, String talpinimoSektorius, Date data, long klientasId) {
		super();
		this.pavadinimas = pavadinimas;
		this.svoris = svoris;
		this.talpinimoSektorius = talpinimoSektorius;
		this.data = data;
		this.klientasId = klientasId;
	}

	public CreateRequest() {
		super();
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public double getSvoris() {
		return svoris;
	}

	public void setSvoris(double svoris) {
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

	public long getKlientasId() {
		return klientasId;
	}

	public void setKlientasId(long klientasId) {
		this.klientasId = klientasId;
	}

}
