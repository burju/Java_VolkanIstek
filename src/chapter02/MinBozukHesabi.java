package chapter02;

import java.util.Scanner;

public class MinBozukHesabi {

	public static void main(String[] args) {

		System.out.println(" Bozdurmak istediginiz para miktarini giriniz (11.5$ gibi) ");

		Scanner kasa = new Scanner(System.in);

		double girilenmiktar = kasa.nextDouble();

		int kalanpara = (int) (girilenmiktar * 100);

		// birlik miktari:
		int birlikmiktari = kalanpara / 100;
		kalanpara = kalanpara % 100;

		// quarter hesaplama:

		int quartermiktari = kalanpara / 25;
		kalanpara = kalanpara % 25;

		// dime hesaplama;

		int dimemiktari = kalanpara / 10;
		kalanpara = kalanpara % 10;

		// nickel hesaplama;

		int nickelmiktari = kalanpara / 5;
		kalanpara = kalanpara % 5;

		// cent hesaplama;

		int centmiktari = kalanpara / 1;

		System.out.println(" Bozdurulan" + girilenmiktar + " miktarina karsilik: ");
		System.out.println(" " + birlikmiktari + (" adet 1$"));
		System.out.println(" " + quartermiktari + (" adet .25$"));
		System.out.println(" " + dimemiktari + (" adet .10$"));
		System.out.println(" " + nickelmiktari + (" adet .5$"));
		System.out.println(" " + centmiktari + (" adet .1$ verilecektir."));

	}
}
