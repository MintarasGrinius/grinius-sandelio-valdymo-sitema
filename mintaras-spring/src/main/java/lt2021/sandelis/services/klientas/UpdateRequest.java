package lt2021.sandelis.services.klientas;

import java.util.Date;

public class UpdateRequest {

	private long id;
	private String vardas;
	private String pavarde;
	private Date gimimoData;
	private KlientoTipas tipas;

	public UpdateRequest() {
		super();
	}

	public UpdateRequest(long id, String vardas, String pavarde, Date gimimoData, KlientoTipas tipas) {
		super();
		this.id = id;
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.gimimoData = gimimoData;
		this.tipas = tipas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public Date getGimimoData() {
		return gimimoData;
	}

	public void setGimimoData(Date gimimoData) {
		this.gimimoData = gimimoData;
	}

	public KlientoTipas getTipas() {
		return tipas;
	}

	public void setTipas(KlientoTipas tipas) {
		this.tipas = tipas;
	}

}
