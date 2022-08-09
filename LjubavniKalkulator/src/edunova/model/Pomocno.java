package edunova.model;

import javax.swing.JOptionPane;

public class Pomocno {

	/**
	 * Metoda osigurava unos stringa
	 * @param poruka Koja se prikazuje korisniku
	 * @return Učitani string
	 */
	
	
	public String ucitajString(String poruka) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, 
						"Obavezan unos");
				continue;
			}
			return s;
		}
	}
	
}
