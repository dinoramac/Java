package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		if (broj > 999 || broj < 1) {
			System.out.println("Greska");
		} else if (broj / 100 > 0) {
			System.out.println(broj / 100);
		} else if (broj / 10 > 0) {
			System.out.println(broj / 10);
		} else {
			System.out.println(broj);
		}
	}

}
