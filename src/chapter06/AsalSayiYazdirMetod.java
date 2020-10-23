package chapter06;

public class AsalSayiYazdirMetod {
	
	public static void main(String[] args) {
		System.out.println("Ilk 500 asal sayi:");
		asalSayilariYazdir(500);
	}

	private static void asalSayilariYazdir(int asalsayiAdeti) {
		final int SATIRDAKI_ASAL_SAYISI = 20;
		
		int asalSayiSayaci = 0;
		int sayi = 2;
		while(asalSayiSayaci < asalsayiAdeti) {
			if (asalMi(sayi)) {
				System.out.printf("%8d", sayi);
				asalSayiSayaci++;
				if (asalSayiSayaci % SATIRDAKI_ASAL_SAYISI == 0) {
					System.out.println();
				}
			}
			sayi++;
		}
	}

	public static boolean asalMi(int s) {
		
		for (int i = 2; i < s; i++) {
			if (s % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
