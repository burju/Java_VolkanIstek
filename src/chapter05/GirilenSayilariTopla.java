
package chapter05;

import java.util.Scanner;

public class GirilenSayilariTopla {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Toplanacak sayiyi giriniz (cikis icin sifir 0 giriniz) ");
		int sayi = klavye.nextInt();
		
		int toplam = 0;
		while (sayi != 0) {
			toplam += sayi;
			System.out.println("Toplanacak sayiyi giriniz (cikis icin sifir 0 giriniz) ");
			sayi = klavye.nextInt();
		}

		System.out.println("Toplam: " + toplam);
	}

}
