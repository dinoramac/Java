package edunova;

import javax.swing.JOptionPane;

public class Z03 {

		// Za unesena dva cijela broja
		// ispišite rezutat djeljenja

	public static void main(String[] args) {

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi cijeli broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi cijeli broj"));

		System.out.println((float)prvi/drugi);

	}
}
