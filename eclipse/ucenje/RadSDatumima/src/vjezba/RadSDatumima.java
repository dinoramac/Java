package vjezba;

import java.util.Scanner;

public class RadSDatumima {

	public RadSDatumima() {

		Pomocno.ulaz = new Scanner(System.in);
		primjer1();
		Pomocno.ulaz.close();

	}

	private void primjer1() {
		String s;
		s = Pomocno.ucitajDatum("Ucitaj datum");
		System.out.println(s);
	}

	public static void main(String[] args) {
		new RadSDatumima();
	}
}
