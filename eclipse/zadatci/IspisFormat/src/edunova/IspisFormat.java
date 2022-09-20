package edunova;

public class IspisFormat {
	
	public IspisFormat() {
		primjer2();
	}

	private void primjer2() {

		int x = 10;
		int y = 10;

		int max = x * y;
		int brojZnakova = saznajBrojZnakova(max);
		System.out.println(max);
		System.out.println(brojZnakova);
		String osnovica = "", broj;
		for (int i = 0; i < brojZnakova; i++) {
			osnovica += " ";
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				broj = osnovica + (i + 1) * (j + 1);
				System.out.print(broj.substring(broj.length() - brojZnakova) + " ");
				
			}
			System.out.println();
		}
	}
	
	private int saznajBrojZnakova(int max) {
		int ukupno = 0;
		while (max > 0) {
			max /= 10;
			ukupno++;
		}
		return ukupno;
	}
	
	public static void main(String[] args) {
		new IspisFormat();
	}
	
}
