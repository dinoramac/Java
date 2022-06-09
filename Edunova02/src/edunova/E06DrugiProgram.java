package edunova;

import javax.swing.JOptionPane;

public class E06DrugiProgram {

	// Za upisana dva cjela broja
	// program ispisuje njihov zbroj

	public static void main(String[] args) {


		int prvi = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
		);

		int drugi = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj")
		);

		int rez = prvi + drugi;

		System.out.println(rez);



	}
}
