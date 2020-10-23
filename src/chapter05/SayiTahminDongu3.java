package chapter05;

import java.util.Scanner;

public class SayiTahminDongu3 {

	public static void main(String[] args) {
		int sayi = (int) (Math.random() * 101);

		Scanner klavye = new Scanner(System.in);
		
		int tahmin = -1;
		while (sayi != tahmin) {
			System.out.println("0 ile 100 arasinda bir sayi giriniz");
			tahmin = klavye.nextInt();

			if (sayi == tahmin) { 
				System.out.println("Bildiniz");
			} else if (sayi < tahmin) {
				System.out.println("Buyuk bir sayi girdiniz");
			} else {
				System.out.println("Kucuk bir sayi girdiniz");
			}
		}
	}

}
