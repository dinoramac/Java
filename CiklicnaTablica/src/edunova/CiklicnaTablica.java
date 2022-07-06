package edunova;

import javax.swing.JOptionPane;

public class CiklicnaTablica {

	public static void main(String[] args) {

		ispisTablice(popunjavanjeTablice(kreiranjeTablice()));

	}

	static void ispisTablice(int[][] tablica) {

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[0].length; j++) {
				System.out.printf("%4d", tablica[i][j]);
			}
			System.out.println();
		}
	}

	static int[][] kreiranjeTablice() {

		int brojRedova = 0;
		int brojStupaca = 0;

		while (true) {
			try {
				brojStupaca = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
				brojRedova = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}

		int[][] tablica = new int[brojRedova][brojStupaca];

		return tablica;
	}

	static int[][] popunjavanjeTablice(int[][] tablica) {

		int brojRedova = tablica.length - 1;
		int brojStupaca = tablica[0].length - 1;

		int broj = 1;
		int stupac = 0;
		int red = 0;

		while (red < brojRedova && stupac < brojStupaca) {

			for (int i = brojStupaca; i >= stupac; i--) {
				tablica[brojRedova][i] = broj++;
			}
			brojRedova--;

			for (int i = brojRedova; i >= red; i--) {
				tablica[i][stupac] = broj++;
			}
			stupac++;

			for (int i = stupac; i <= brojStupaca; i++) {
				tablica[red][i] = broj++;
			}
			red++;

			for (int i = red; i <= brojRedova; i++) {
				tablica[i][brojStupaca] = broj++;
			}
			brojStupaca--;

		}

		if (stupac < brojStupaca && red >= brojRedova && (tablica.length) % 2 != 0) {
			for (int i = brojStupaca; i >= stupac; i--) {
				tablica[brojRedova][i] = broj++;
			}
		} else if (red < brojRedova && stupac >= brojStupaca && (tablica[0].length) % 2 != 0) {
			for (int i = brojRedova; i >= red; i--) {
				tablica[i][stupac] = broj++;
			}
		} else if ((tablica.length) % 2 != 0 && (tablica.length) == tablica[0].length) {
			tablica[brojRedova][brojStupaca] = broj++;
		}

		return tablica;

	}
}
