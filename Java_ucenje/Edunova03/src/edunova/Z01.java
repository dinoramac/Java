package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		if (prvi + drugi > 10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Edunova");
		}

	}
}
