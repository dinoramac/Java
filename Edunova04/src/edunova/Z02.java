package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {

		int unos = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));
		int[][] tablica = new int[unos][unos];

		if (unos < 10 || unos > 20) {
			System.out.println("Greska");
		} else {
			for (int i = 0; i < unos; i++) {
				for (int j = 0; j < unos; j++) {
					tablica[i][j] = (i + 1) * (j + 1);
				}
			}
		}

		for (int i = 0; i < unos; i++) {
			for (int j = 0; j < unos; j++) {
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
