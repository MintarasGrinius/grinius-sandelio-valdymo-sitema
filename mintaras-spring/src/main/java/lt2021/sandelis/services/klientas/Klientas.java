package lt2021.sandelis.services.klientas;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lt2021.sandelis.services.inventorius.Inventorius;

@Entity
public class Klientas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String vardas;

	@Column
	private String pavarde;

	@Column
	private Date gimimoData;

	@Column
	private KlientoTipas tipas;

	@OneToMany(mappedBy = "klientas")
	private List<Inventorius> inventorius;

	public Klientas() {
		super();
	}

	public Klientas(String vardas, String pavarde, Date gimimoData, KlientoTipas tipas, List<Inventorius> inventorius) {
		super();
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.gimimoData = gimimoData;
		this.tipas = tipas;
		this.inventorius = inventorius;
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

	public List<Inventorius> getInventorius() {
		return inventorius;
	}

	public void setInventorius(List<Inventorius> inventorius) {
		this.inventorius = inventorius;
	}

}