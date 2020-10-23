package chapter02;

import java.util.Scanner;

public class VergiliSatis {

	public static void main(String[] args) {

		System.out.println("Satin alinacak urunun fiyatini giriniz: ");
		Scanner input = new Scanner(System.in);

		double satisUcreti = input.nextDouble();

		double odenecekVergi = satisUcreti * 0.06;

		System.out.println(" ALdiginiz urun icin " + (int) (odenecekVergi * 100) / 100.0 + "lira vergi verdiniz");
		// yukaridaki islem sayesinde noktadan sonra sadece 2 basamak birakabildik.
	}

}
