package edunova;

import javax.swing.JOptionPane;

public class CiklicnaTablica {

	public static void main(String[] args) {

		ispisTablice(popunjavanjeTablice(kreiranjeTablice()));

	}

	static void ispisTablice(int[][] tablica) {

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[0].length; j++) {
				if (tablica[i][j] < 10) {
					System.out.print("  ");
				} else if (tablica[i][j] >= 10 && tablica[i][j] < 100) {
					System.out.print(" ");
				}
				System.out.print(tablica[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	static int[][] kreiranjeTablice() {

		int brojRedova = 0;
		int brojStupaca = 0;

		while (true) {
			try {
				brojRedova = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
				brojStupaca = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}

		int[][] tablica = new int[brojRedova][brojStupaca];

		return tablica;
	}

	static int[][] popunjavanjeTablice(int[][] tablica) {

		int brojRedova = tablica.length;
		int brojStupaca = tablica[0].length;

		int broj = 1;
		int stupac = 0;
		int red = 0;

		while (red < brojRedova && stupac < brojStupaca) {
			if (stupac < brojStupaca) {
				for (int i = brojStupaca - 1; i >= stupac; i--) {
					tablica[brojRedova - 1][i] = broj++;
				}
				brojRedova--;
			}

			for (int i = brojRedova - 1; i >= red; i--) {
				tablica[i][stupac] = broj++;
			}

			stupac++;

			for (int i = stupac; i < brojStupaca; i++) {
				tablica[red][i] = broj++;
			}

			red++;

			if (red < brojRedova) {
				for (int i = red; i < brojRedova; i++) {
					tablica[i][brojStupaca - 1] = broj++;
				}
				brojStupaca--;
			}
		}

		return tablica;

	}
}
