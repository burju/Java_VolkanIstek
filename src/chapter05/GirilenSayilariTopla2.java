
package chapter05;

import java.util.Scanner;

public class GirilenSayilariTopla2 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		int sayi;
		int toplam = 0;
		do {
			System.out.println("Toplanacak sayiyi giriniz (cikis icin sifir 0 giriniz) ");
			sayi = klavye.nextInt();
			toplam += sayi;
		} while (sayi != 0);

		System.out.println("Toplam: " + toplam);
	}

}
