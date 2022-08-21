package lovecalc;

import java.util.Arrays;

public class LoveCalc {
	
	public static int loveCalc(String niz) {
		
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
		return loveCalc(iduciNiz.toString());
	}
	
	
	public static void main(String[] args) {
		
		String ime1 = "Marta";
		String ime2 = "Manuel";
		int brojac = 0;
		
		String spojImena = ime1.toLowerCase() + ime2.toLowerCase();
		char[] niz = new char[spojImena.length()];
		
		for (int i = 0; i < spojImena.length(); i++) {
			brojac = 0;
			for (int j = 0; j < spojImena.length(); j++) {
				if (spojImena.charAt(i) == spojImena.charAt(j)) {
					brojac++;
				}
			}
			System.out.print(brojac);
			niz[i] = (char) (brojac + '0');
			
		}
		
		loveCalc(niz.toString());
	}
	
}
