package chapter03;

import java.util.Scanner;

public class TestBooleanOperatorler {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sayi = input.nextInt();

		if (sayi % 2 == 0 && sayi % 3 == 0) {
			System.out.println(" Girdiginiz sayi 2 ve 3'e tam bolunur.");
		}

		if (sayi % 2 == 0 || sayi % 3 == 0) {
			System.out.println("Girdiginiz sayi2 veya 3'e tam bolunur");
		}
		if (sayi % 2 == 0 ^ sayi % 3 == 0) {
			System.out.println(" Girdiginiz sayi 2 veya 3'e bolunur ancak her ikisine ayni anda bolunmez");
		}

	}
}
