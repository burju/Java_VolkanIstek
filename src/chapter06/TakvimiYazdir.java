package chapter06;

import java.util.Scanner;

public class TakvimiYazdir {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Lutfen Yili girin (Or. 2001): ");
		int yil = klavye.nextInt();

		System.out.print("Lutfen 1 ile 12 arasinde bir ay girin: ");
		int ay = klavye.nextInt();
		
		takvimiYazdir(yil, ay);
	}

	private static void takvimiYazdir(int yil, int ay) {
		takvimBasliginiYazdir(yil, ay);
		takvimiGovdesiniyazdir(yil, ay);
	}

	private static void takvimBasliginiYazdir(int yil, int ay) {
		String ayinAdi = ayinIsminiBul(ay);
		
		System.out.println("          " + ayinAdi + " " + yil);
		System.out.println("-----------------------------");
		System.out.println(" Pzt Sal Car Per Cum Cmt Paz");
	}
	
	private static String ayinIsminiBul(int ay) {
		switch (ay) {
		case 1:
			return "Ocak";
		case 2:
			return "Subat";
		case 3:
			return "Mart";
		case 4:
			return "Nisan";
		case 5:
			return "Mayis";
		case 6:
			return "Haziran";
		case 7:
			return "Temmuz";
		case 8:
			return "Agustos";
		case 9:
			return "Eylul";
		case 10:
			return "Ekim";
		case 11:
			return "Kasin";
		case 12:
			return "Aralik";
		}
		
		return "";
	}

	private static void takvimiGovdesiniyazdir(int yil, int ay) {
		int baslangicGunu = baslangicGununuBul(yil, ay);
		
		int aydakiGunSayisi = birAydakiGunSayisiniBul(yil, ay);
		
		for (int i = 0; i < baslangicGunu; i++) {
			System.out.print("    ");
		}
		
		for (int i = 1; i <= aydakiGunSayisi; i++) {
			System.out.printf("%4d", i);
			baslangicGunu++;
			if (baslangicGunu % 7 == 0) {
				System.out.println();
			}
		}
	}

	private static int baslangicGununuBul(int yil, int ay) {
		final int OCAK_1_1800_GUNU = 2;
		int toplamGun = toplamGunSayisiniBul(yil, ay);
		
		return (toplamGun + OCAK_1_1800_GUNU) % 7;
	}

	private static int toplamGunSayisiniBul(int yil, int ay) {
		int toplamGun = 0;
		
		for (int i = 1800; i < yil; i++) {
			toplamGun += artikYilMi(i) ? 366 : 365;
		}
		
		for (int i = 1; i < ay; i++) {
			toplamGun += birAydakiGunSayisiniBul(yil, i);
		}
		
		return toplamGun;
	}
	
	public static int birAydakiGunSayisiniBul(int yil, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12)
			return 31;

		if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
			return 30;

		if (ay == 2)
			return artikYilMi(yil) ? 29 : 28;

		return 0; // If month is incorrect
	}

	private static boolean artikYilMi(int yil) {
		return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
	}

}
