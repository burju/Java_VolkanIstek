package chapter05;

import java.util.Scanner;

public class TekrarliToplamaArasinavi {

	public static void main(String[] args) {
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		Scanner klavye = new Scanner(System.in);
		System.out.println(sayi1 + " + " + sayi2 + " =?");
		int cevap = klavye.nextInt();
		
		while (sayi1 + sayi2 != cevap) {
			System.out.println("Yanlis cevap girdiniz tekrar deneyiniz.");
			System.out.println(sayi1 + " + " + sayi2 + " =?");
			cevap = klavye.nextInt();
		}
		
		// bu satira gelinebilmesi icin dogru cevap girilmis olmali
		System.out.println("Bildiniz.");
	}

}
