package zavrsni.util;

import java.util.Scanner;

public class vozniRedCRUD {
	

	public static Scanner ulaz;

	public static String vozniRedUcitajString(String poruka) {
		String s;
		while (true) {
			System.out.print(poruka);
			s = ulaz.nextLine();
			if (s.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}

			return s;
		}
	}
	
	
	
	
	
}
