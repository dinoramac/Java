package zavrsni.model;

public class Autobus extends Entitet {

	private String brojAutobusa;
	private int brojSjedala;
	private Boolean dostupnostAutobusa;

	public Autobus() {
		super();
	}

	public Autobus(Integer sifra, String brojAutobusa, int brojSjedala, Boolean dostupnostAutobusa) {
		super(sifra);
		this.brojAutobusa = brojAutobusa;
		this.brojSjedala = brojSjedala;
		this.dostupnostAutobusa = dostupnostAutobusa;
	}

	public String getBrojAutobusa() {
		return brojAutobusa;
	}

	public void setBrojAutobusa(String brojAutobusa) {
		this.brojAutobusa = brojAutobusa;
	}

	public int getBrojSjedala() {
		return brojSjedala;
	}

	public void setBrojSjedala(int brojSjedala) {
		this.brojSjedala = brojSjedala;
	}

	public Boolean getDostupnostAutobusa() {
		return dostupnostAutobusa;
	}

	public void setDostupnostAutobusa(Boolean dostupnostAutobusa) {
		this.dostupnostAutobusa = dostupnostAutobusa;
	}

}
