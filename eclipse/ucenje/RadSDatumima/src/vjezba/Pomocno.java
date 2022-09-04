package vjezba;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;

	public static int ucitajInt(String poruka) {
		while (true) {
			System.out.print(poruka + ": ");
			try {
				return Integer.parseInt(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Niste unijeli cijeli broj");
			}
		}
	}

	public static int ucitajInt(String poruka, boolean pozitivni) {
		int i = ucitajInt(poruka);
		if (!pozitivni) {
			return i;
		}
		while (true) {
			if (i < 0) {
				System.out.println("UÄ?itani broj mora biti pozitivan");
				i = ucitajInt(poruka);
				continue;
			}
			return i;
		}
	}

	public static int ucitajInt(String poruka, int min, int max) {
		int i = ucitajInt(poruka);
		while (true) {
			if (i >= min && i <= max) {
				return i;
			} else {
				System.out.println("Broj mora biti izmeÄ‘u " + min + " " + max);
				i = ucitajInt(poruka);
			}
		}
	}

	public static String ucitajString(String poruka) {
		String s;
		while (true) {
			System.out.print(poruka + ": ");
			s = ulaz.nextLine();
			if (s.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}
	}

	public static String FORMAT_DATUM = "dd.MM.yyyy";
	public static SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATUM);

	public static String ucitajDatum(String poruka) {
		System.out.println(poruka);
		
		Date date = new Date();
		String ispisDatuma;

		while (true) {
			try {
				date = sdf.parse(ulaz.nextLine());
				ispisDatuma = sdf.format(date);
				return ispisDatuma;
			} catch (Exception e) {
				System.out.println("Neispravan format datuma.");
			}
		}
	}

	public static int slucajniBroj(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

}