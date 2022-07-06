package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	// program osigurava unos niza
	// znakova (String) koji ima
	// minimalno 3 znaka
	// ako nema tri znaka ispisuje korisniku
	// poruku: Minimalno 3 znaka

	public static void main(String[] args) {

		String s;

		while (true) {

			s = JOptionPane.showInputDialog("Unesi niz od minimalno 3 znaka");

			if (s.length() < 3) {
				System.out.println("Unos minimalno 3 znaka");
				continue;
			}
			break;
		}

	}
}
