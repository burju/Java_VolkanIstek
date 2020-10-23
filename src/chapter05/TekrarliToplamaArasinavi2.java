package chapter05;

import java.util.Scanner;

public class TekrarliToplamaArasinavi2 {

	public static void main(String[] args) {
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		Scanner klavye = new Scanner(System.in);
		System.out.println(sayi1 + " + " + sayi2 + " =?");
		int cevap = klavye.nextInt();
		
		int yanlisSayaci = 0;
		while (sayi1 + sayi2 != cevap && yanlisSayaci < 3) {
			yanlisSayaci++;
			System.out.println("Yanlis cevap girdiniz tekrar deneyiniz.");
			System.out.println(sayi1 + " + " + sayi2 + " =?");
			cevap = klavye.nextInt();
		}
		
		if (sayi1 + sayi2 != cevap) {
			// bu satira gelinebilmesi icin dogru cevap girilmis olmali
			System.out.println("Bildiniz."); 
		} else {
			System.out.println("Yeter artik oynama benimle ");
		}
	}

}
