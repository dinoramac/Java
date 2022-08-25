package zavrsni.util;

import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;

	public static String ucitajString(String poruka) {
		String s;
		while (true) {
			System.out.println(poruka);
			s = ulaz.nextLine();
			if (s.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}

			return s;
		}
	}

	public static int ucitajInt(String poruka) {
		while (true) {
			System.out.print(poruka + ": ");
			try {
				return Integer.parseInt(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Niste unijeli broj");
			}
		}
	}

	public static int ucitajInt(String poruka, int min, int max) {
		int i = ucitajInt(poruka);
		while (true) {
			System.out.print(poruka + ": ");
			try {
				if (i >= min && i <= max) {
					return i;
				}
			} catch (Exception e) {
				System.out.println("Niste unjeli broj između" + min + "-" + max);
			}
		}
	}

}
