package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
		// Korisnik unosi dimenzije 
		// matrice (x i y)
		// program puni matricu slučajnim 
		// vrijednostima između 5 i 9
		// program ispisuje izgrađenu matricu

	public static void main(String[] args) {
		
		int x=0,y=0;
		
		while(true) {
			try {
				
				x = Integer.parseInt(JOptionPane.showInputDialog("X"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Y"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}
		
		int[][] matrica = new int[y][x];
		
		for(int i = 0; i<y; i++) {
			for(int j = 0; j<x; j++) {
				matrica[i][j]=5 + (int)(Math.random() * ((9 - 5) + 1));
			}
		}
		
		for(int i = 0; i<y; i++) {
			for(int j = 0; j<x; j++) {
				System.out.printf("%4d",matrica[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
