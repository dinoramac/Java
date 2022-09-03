package edunova;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {

	public static int rekurzija(String niz) {

		if(niz.length()<=2) {
			return Integer.parseInt(niz);
		}
		
		StringBuilder iduciNiz = new StringBuilder();
		String[] nizVrijednosti = niz.split("");
		
		for (int i = 0, j=niz.length()-1; i<=j; i++, j--) {
			if (i==j) {
				iduciNiz.append(nizVrijednosti[i]);
                break;
			}
			
			iduciNiz.append(Integer.parseInt(nizVrijednosti[i]) + Integer.parseInt(nizVrijednosti[j]));
		}
		System.out.println(iduciNiz);
		
		return rekurzija(iduciNiz.toString());
	}
	
	public static String ucitajString(String poruka) {
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

	public LjubavniKalkulator() {

		String ime1 = ucitajString("Unesi prvo ime:");
		String ime2 = ucitajString("Unesi drugo ime:");
		
		System.out.println(ime1 + " " + ime2);
		
		int brojac = 0;

		String spojImena = ime1.trim().toLowerCase() + ime2.trim().toLowerCase();
		StringBuilder brojevi = new StringBuilder();

		for (int i = 0; i < spojImena.length(); i++) {
			brojac = 0;
			for (int j = 0; j < spojImena.length(); j++) {
				if (spojImena.charAt(i) == spojImena.charAt(j)) {
					brojac++;
				}
			}
			System.out.print(brojac);
			brojevi.append(brojac);
		}

		System.out.println("");
		rekurzija(brojevi.toString());

	}

	public static void main(String[] args) {
		new LjubavniKalkulator();
	}

}
