package chapter03;

import java.util.Scanner;

public class VergiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Vergisi hesaplanacak yillik gelirinizi yaziniz: ");

		double yillikGelir = input.nextDouble();
		double vergi = 0.0;

		if (yillikGelir <= 12600) {

			vergi = (yillikGelir * 0.15);
		}

		else if (yillikGelir <= 30000) {
			vergi = ((12600 * 0.15) + ((yillikGelir - 12600) * 0.20));
		}

		else if (yillikGelir <= 69000) {
			vergi = (5370 + (yillikGelir - 30000) * 0.27);
		}

		else {
			vergi = (15900 + (yillikGelir - 69000) * 0.35);
		}

		System.out.println("Yillik odenecek gelir vergisi tutariniz: " + vergi + " TL'dir");
	}
}
