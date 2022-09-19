package zavrsni.util;

import java.text.ParseException;
import java.util.List;

import zavrsni.model.Relacija;

public class RelacijaCRUD {
	
	public static void ispis(List<Relacija> relacije) {
		int rb = 1;
		System.out.println("");
		System.out.println("Lista relacija: ");
		for (Relacija r : relacije) {
				System.out.println(rb++ + ". " + r.getPocetnoStajaliste() + " " + r.getZavrsnoStajaliste() + " " +
						"\n\tVrijeme vožnje: ");
		}
		System.out.println("----------");
	}
	
}
