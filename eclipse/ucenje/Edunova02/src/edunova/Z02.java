package edunova;

import javax.swing.JOptionPane;

public class Z02 {

		// Za uneseni dvoznamenkasti broj
		// ispišite jediničnu vrijednost

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesite dvo znamenkasti broj"));
		System.out.println("Uneseni broj je " + i);

		int mod = i % 10;
		System.out.println("Jedinicna vrijednost unesenog broja je " + mod);
	}
}
