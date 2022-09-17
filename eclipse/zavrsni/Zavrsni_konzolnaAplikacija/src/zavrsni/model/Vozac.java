package zavrsni.model;

public class Vozac extends Entitet {

	private String ime;
	private String prezime;
	private String oib;

	public Vozac() {
		super();
	}

	public Vozac(Integer sifra, String ime, String prezime, String oib) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.oib = oib;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}
}
