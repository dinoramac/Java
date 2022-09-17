package zavrsni;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import zavrsni.model.Autobus;
import zavrsni.model.Relacija;
import zavrsni.model.Vozac;
import zavrsni.util.DatumVrijemeUtil;
import zavrsni.util.Pomocno;
import zavrsni.util.RelacijaCRUD;

public class Start {
	
	private List<Relacija> relacije;
	private List<Vozac> vozaci;
	private List<Autobus> autobusi;

	public Start() {
		
		relacije = new ArrayList<>();
		vozaci = new ArrayList<>();
		autobusi = new ArrayList<>();
		
		Pomocno.ulaz= new Scanner(System.in);
		DatumVrijemeUtil.setSimpleDateFormat(new SimpleDateFormat(DatumVrijemeUtil.getFormatZaDatum()));
		DatumVrijemeUtil.setSimpleDateFormat(new SimpleDateFormat(DatumVrijemeUtil.getFormatZaVrijeme()));
		
		inicijalniPodatci();
		
		
		System.out.println("***** Autobusni kolodvor - prodaja karti  *****");
		System.out.println("*********** konzolna aplikacija v1  ***********");
		glavniIzbornik();

		Pomocno.ulaz.close();
		
	}

	private void inicijalniPodatci() {
		
		vozaci.add(new Vozac(1,"Pero","Perić","01234567891"));
		vozaci.add(new Vozac(2,"Ivo","Ivić","01234567892"));
		vozaci.add(new Vozac(3,"Đuro","Đurić","01234567893"));
		
		autobusi.add(new Autobus(1,"0123",50,true));
		autobusi.add(new Autobus(2,"0123",50,false));
		autobusi.add(new Autobus(3,"0123",50,true));
		
		relacije.add(new Relacija(1,"Osijek","Zagreb",new Date(),240,vozaci.get(0),autobusi.get(0)));
		relacije.add(new Relacija(1,"Osijek","Đakovo",new Date(),40,vozaci.get(1),autobusi.get(1)));
		relacije.add(new Relacija(1,"Osijek","Rijeka",new Date(),480,vozaci.get(2),autobusi.get(2)));
		
		
		
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
			System.out.println("");
			System.out.println("Doviđenja");
		}
		
	}
	
	
	
	

	private void vozniRed() {
		System.out.print("---> ");
		System.out.println("Vozni red");
		vozniRedProgram();
	}
	
	private void vozniRedProgram() {
//		RelacijaCRUD.ispis(relacije);
//		System.out.println("");
//		 = Pomocno.ucitajStringStajalista("Pocetno Stajaliste ");
//		zavrsnoStajaliste = Pomocno.ucitajStringStajalista("Zavrsno Stajaliste ");
//		datumPolaska = Pomocno.ucitajDatum("Unesi datum polaska ");
//		
		//pretrazivanje
	}
	
	
	


	private void rezervacije() {
		System.out.println("");
		System.out.println("Rezervacije");
		rezervacijeProgram();
	}

	private void rezervacijeProgram() {
		// pregled svih napravljenih rezervacija
		
	}




	public static void main(String[] args) {
		new Start();
	}
}
