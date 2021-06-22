package lt2021.sandelis.services.inventorius;

import java.util.Date;

public class GetInventroiusResponse {

	private String pavadinimas;
	private double svoris;
	private String talpinimoSektorius;
	private Date data;

	public GetInventroiusResponse() {
		super();
	}

	public GetInventroiusResponse(String pavadinimas, double svoris, String talpinimoSektorius, Date data) {
		super();
		this.pavadinimas = pavadinimas;
		this.svoris = svoris;
		this.talpinimoSektorius = talpinimoSektorius;
		this.data = data;
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

}
