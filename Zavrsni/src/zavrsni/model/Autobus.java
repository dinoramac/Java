package zavrsni.model;

public class Autobus extends Entitet{

	private String brojAutobusa;
	private int brojSjedala;
	private String stanjeAutobusa;
	
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
	public String getStanjeAutobusa() {
		return stanjeAutobusa;
	}
	public void setStanjeAutobusa(String stanjeAutobusa) {
		this.stanjeAutobusa = stanjeAutobusa;
	}
}
