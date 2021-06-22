package lt2021.sandelis.services.inventorius;

import java.util.Date;

public class UpdateRequest {

	private String pavadinimas;
	private String svoris;
	private String talpinimoSektorius;
	private Date data;

	public UpdateRequest(String pavadinimas, String svoris, String talpinimoSektorius, Date data) {
		super();
		this.pavadinimas = pavadinimas;
		this.svoris = svoris;
		this.talpinimoSektorius = talpinimoSektorius;
		this.data = data;
	}

	public UpdateRequest() {
		super();
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

}
