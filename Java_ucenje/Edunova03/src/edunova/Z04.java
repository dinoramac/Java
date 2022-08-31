package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int treci = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));

		if (prvi > drugi && prvi > treci) {
			System.out.println(prvi);
		} else if (drugi > treci) {
			System.out.println(drugi);
		} else {
			System.out.println(treci);
		}

	}
}
