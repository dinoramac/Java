package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// Program od korisnika unosi
	// cjele brojeve dok korisnik
	// ne unese broj -1
	// program ispisuje sumu svih unesenih
	// brojeva
	// koristeći while

	public static void main(String[] args) {

		int broj = 0;
		int suma = 0;

		while (broj != -1) {
			try {
				broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj"));
				suma += broj;

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}

		System.out.println(suma+1);

	}
}
