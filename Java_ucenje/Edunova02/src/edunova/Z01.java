package edunova;

import javax.swing.JOptionPane;

public class Z01 {

		// Napisati program koji unosi
		// tri decimalna broja
		// i ispisuje umnožak prvog i trećeg
		// umanjeno za drugi broj

	public static void main(String[] args) {

		float prvi = Float.parseFloat(JOptionPane.showInputDialog("Unesite prvi broj"));
		float drugi = Float.parseFloat(JOptionPane.showInputDialog("Unesite drugi broj"));
		float treci = Float.parseFloat(JOptionPane.showInputDialog("Unesite treci broj"));

		System.out.println(prvi * treci - drugi);
	}
}
