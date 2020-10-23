package chapter06;

import chapter06.TestMax;

public class BasitMetod {

	public static void main(String[] args) {
		int toplam = toplam(1, 10);
		System.out.println(" 1 den 10 a kadar olan sayilarin toplami: " + toplam);

		toplam = toplam(15, 44);
		System.out.println("15 den 44 e kadar olan sayilarin toplami: " + toplam);

		toplam = toplam(30, 33);
		System.out.println("30 dan 33 e kadar olan sayilarin toplami: " + toplam);
		
		
		System.out.println(TestMax.max(2, 8));
		
		System.out.println(Math.random());
	}

	static int toplam(int sayi1, int sayi2) {
		int toplam = 0;

		for (int i = sayi1; i <= sayi2; i++) {
			toplam += i;
		}

		return toplam;
	}

	static int carp(int sayi1, int sayi2) {
		int carpim = sayi1 * sayi2;

		return carpim;
	}

	public static int sign(int n) {
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		else // negatif sayi
			return -1;
	}

}
