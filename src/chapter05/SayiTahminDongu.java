package chapter05;

import java.util.Scanner;

public class SayiTahminDongu {

	public static void main(String[] args) {
		int sayi = (int) (Math.random() * 101);

		Scanner klavye = new Scanner(System.in);
		System.out.println("0 ile 100 arasinda bir sayi giriniz");
		int tahmin = klavye.nextInt();

		while (sayi != tahmin) {
			if (sayi < tahmin) {
				System.out.println("Buyuk bir sayi girdiniz");
			} else {
				System.out.println("Kucuk bir sayi girdiniz");
			}
			System.out.println("0 ile 100 arasinda bir sayi giriniz");
			tahmin = klavye.nextInt();
		}
		
		System.out.println("Bildiniz");

	}

}
