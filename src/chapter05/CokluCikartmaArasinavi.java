package chapter05;

import java.util.Scanner;

public class CokluCikartmaArasinavi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		long baslangicZamani = System.currentTimeMillis();
		
		String rapor = "";
		int sayac = 0;
		int dogruSayaci = 0;
		
		while (sayac < 3) {
			int sayi1 = (int) (Math.random() * 10);
			int sayi2 = (int) (Math.random() * 10);
			
			if (sayi1 < sayi2) {
				int geciciSayi = sayi1;
				sayi1 = sayi2;
				sayi2 = geciciSayi;
			}

			System.out.println(sayi1 + " - " + sayi2 + " =?");
			int cevap = klavye.nextInt();

			rapor += sayi1 + " - " + sayi2 + " = " + cevap;
			// += uzerine ekle demek.eger bunu silersem. sadece en sonuncuyu basar
			if (sayi1 - sayi2 == cevap) {
				System.out.println("Bildiniz");
				dogruSayaci++;
				rapor += " dogru\n";
			} else {
				System.out.println("Bilemediniz");
				rapor += " yanlis\n";
			}
			sayac++;
		}
		
		long bitisZamani = System.currentTimeMillis();
		int sure = (int)((bitisZamani - baslangicZamani) / 1000);
		
		System.out.println("Toplam süre: " + sure + " saniyedir");
		System.out.println(sayac + " tane soru soruldu");
		System.out.println(dogruSayaci + " tane dogru cevap verdiniz");
		System.out.println(rapor);
		
	}

}
