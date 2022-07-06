package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {

	// za upisani cjeli broj
	// ispiši zbroj svih znamenki

	// ulaz: 263736
	// izlaz: 27

	// ulaz: 26
	// izlaz: 8

	public static void main(String[] args) {

		int broj;
		int suma = 0;

		while (true) {
			try {

				broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}

		while (broj > 0) {
			suma += broj % 10;
			broj /= 10;
		}

		System.out.println(suma);

	}
}
