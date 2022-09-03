package edunova;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {
		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		if (prvi%2==0 && drugi%2==0) {
			System.out.println(prvi + drugi);
		}else {
			System.out.println(prvi - drugi);
		}
	}
}
