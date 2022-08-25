package zavrsni;

import java.util.Scanner;

import zavrsni.util.Pomocno;

public class Start {
	
	

	public Start() {
		
		Pomocno.ulaz= new Scanner(System.in);
		
		System.out.println("***** Autobusni kolodvor - prodaja karti  *****");
		System.out.println("*********** konzolna aplikacija v1  ***********");
		glavniIzbornik();

		Pomocno.ulaz.close();
		
	}
	
	
	
	
	private void glavniIzbornik() {
		System.out.println("");
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("1 - Vozni red");
		System.out.println("2 - Moje rezervacije");
		System.out.println("3 - Izlaz");
		pokreniProgram();
	}




	private void pokreniProgram() {
		switch (Pomocno.ucitajInt("Odaberi program", 1, 3)) {
		case 1:
			vozniRed();
			break;

		case 2:
			rezervacije();
			break;

		case 3:
			System.out.println("Doviđenja");
		}
		
	}
	
	

	private void vozniRed() {
		System.out.println("Vozni red");
		
	}
	
	private void rezervacije() {
		
		
	}




	public static void main(String[] args) {
		new Start();
	}
}
