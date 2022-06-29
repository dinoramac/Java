package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class CiklickaTablica {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;

		while (true) {
			try {
				n = Integer.parseInt(JOptionPane.showInputDialog("X"));
				m = Integer.parseInt(JOptionPane.showInputDialog("Y"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}

		int[][] tablica = new int[n][m];

		int broj = 1;
		int x = m; // zadnji stupac
		int l = 0; // pocetni stupac
		int k = 0; // pocetni red
		int y = n; // zadnji red

		while (k < y && l < x) {
			
			for (int i = x - 1; i >= l; i--) {
				tablica[y - 1][i] = broj++;
			}

			y--;
			for (int i = y - 1; i >= k; i--) {
				tablica[i][l] = broj++;
			}

			l++;
			for (int i = l; i < x; i++) {
				tablica[k][i] = broj++;
			}

			k++;
			for (int i = k; i < y; i++) {
				tablica[i][x - 1] = broj++;
			}
			x--;
		}

		// ----------------------------------------------------------
		// ispis

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (tablica[i][j] < 10) {
					System.out.print("  ");
				} else if (tablica[i][j]>=10 && tablica[i][j]<100) {
					System.out.print(" ");
				}
				System.out.print(tablica[i][j] + " ");
			}
			System.out.print("\n");
		}

	}
}
