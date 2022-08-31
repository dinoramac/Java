package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		int niz[] = new int[4];
		int suma = 0;

		for (int i = 0; i < 4; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesite " + (i + 1) + ". cijeli broj"));
			suma = suma + niz[i];
		}
		System.out.println(suma);

	}
}
