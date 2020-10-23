package chapter05;

public class CarpimTablosu2 {
	public static void main(String[] args) {

		System.out.println(" \t\t\t\t Carpim Tablosu ");

		for (int i = 1; i < 10; i++) {
			System.out.print("\t " + i);
		}
		System.out.println("\n---------------------------------------------------------------------------");

		for (int j = 1; j < 10; j++) {
			System.out.print(j + "|");
			for (int k = 1; k < 10; k++) {
				System.out.printf("\t%2d", j * k);
			}
			System.out.println();

		}
	}
}
