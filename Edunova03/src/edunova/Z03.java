package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		if (prvi > drugi) {
			System.out.println(prvi);
		} else {
			System.out.println(drugi);
		}

	}
}
