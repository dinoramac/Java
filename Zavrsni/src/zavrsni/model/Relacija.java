package zavrsni.model;

import java.util.Date;

public class Relacija extends Entitet{

	private Date vrijemePolaska;
	private String mjestoPolaska;
	private String destinacija;
	private int trajanjeVoznje;
	private Vozac vozac;
	private Autobus autobus;
	
	
	
	public Date getVrijemePolaska() {
		return vrijemePolaska;
	}
	public void setVrijemePolaska(Date vrijemePolaska) {
		this.vrijemePolaska = vrijemePolaska;
	}
	public String getMjestoPolaska() {
		return mjestoPolaska;
	}
	public void setMjestoPolaska(String mjestoPolaska) {
		this.mjestoPolaska = mjestoPolaska;
	}
	public String getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}
	public int getTrajanjeVoznje() {
		return trajanjeVoznje;
	}
	public void setTrajanjeVoznje(int trajanjeVoznje) {
		this.trajanjeVoznje = trajanjeVoznje;
	}
	public Vozac getVozac() {
		return vozac;
	}
	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}
	public Autobus getAutobus() {
		return autobus;
	}
	public void setAutobus(Autobus autobus) {
		this.autobus = autobus;
	}
}
