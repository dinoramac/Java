package edunova;

import javax.swing.JOptionPane;

public class E04PrviProgram {

	public static void main(String[] args) {

		String unos = JOptionPane.showInputDialog("Unesi broj");

		int b = Integer.parseInt(unos);

		System.out.println(b);

	}
}