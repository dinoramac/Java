package zavrsni.model;

import java.util.Date;

public class Rezervacija {

	private Date datumRezervacije;
	private Relacija Relacija;
	private Putnik putnik;
	
	public Date getDatumRezervacije() {
		return datumRezervacije;
	}
	public void setDatumRezervacije(Date datumRezervacije) {
		this.datumRezervacije = datumRezervacije;
	}
	public Relacija getRelacija() {
		return Relacija;
	}
	public void setRelacija(Relacija relacija) {
		Relacija = relacija;
	}
	public Putnik getPutnik() {
		return putnik;
	}
	public void setPutnik(Putnik putnik) {
		this.putnik = putnik;
	}
}
