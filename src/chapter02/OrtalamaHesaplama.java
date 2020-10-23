package chapter02;

import java.util.Scanner;

public class OrtalamaHesaplama {

	public static void main(String[] args) {

		// kullanici verisi ile ortalama hesaplama:

		System.out.println("ortalama hesaplamak icin 3 tam sayi giriniz: ");

		Scanner ahmet = new Scanner(System.in);

		int girdi1 = ahmet.nextInt();
		int girdi2 = ahmet.nextInt();
		int girdi3 = ahmet.nextInt();

		// ortalama hesaplama:
		int ortalama = (girdi1 + girdi2 + girdi3);

		System.out.println("Girisi yapilan sayilarinin ortalamasi " + ortalama + "dir");
	}
}
