package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {

	// program prima dva cijela broja
	// ispisuje sve prim brojeve između
	// dva primljena broja

	public static void main(String[] args) {

		int broj1, broj2;

		while (true) {
			try {

				broj1 = Integer.parseInt(JOptionPane.showInputDialog("1. Broj"));
				broj2 = Integer.parseInt(JOptionPane.showInputDialog("2. Broj"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}

		int min = broj2 < broj1 ? broj2 : broj1;
		int max = broj2 > broj1 ? broj2 : broj1;

		boolean prim = true;
		for (int i = min; i <= max; i++) {
			prim = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prim = false;
					break;
				}
			}
			if (prim) {
				System.out.println(i + " je prim.");
			}
		}

	}
}
