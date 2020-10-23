package chapter05;

import java.util.Scanner;

public class SayiTahminTekSans {

	public static void main(String[] args) {
		int sayi = (int) (Math.random() * 101);

		Scanner klavye = new Scanner(System.in);
		System.out.println("0 ile 100 arasinda bir sayi giriniz");
		int tahmin = klavye.nextInt();
		
		System.out.println("Tuttugumuz sayi: " + sayi);
		
		if (sayi == tahmin) {
			System.out.println("Bildiniz");
		} else if (sayi < tahmin) {
			System.out.println("Buyuk bir sayi girdiniz");
		} else {
			System.out.println("Kucuk bir sayi girdiniz");
		}

	}

}
