package chapter08;

public class IkiBoyutluDiziIslemleri {

	public static void main(String[] args) {
		int[][] ikiBoyutliDizi = new int[10][10];
		
		rassalDegerlerleDoldur(ikiBoyutliDizi);
		
		diziyiYazdir(ikiBoyutliDizi);
		
		int toplam = tumElemanlarinToplami(ikiBoyutliDizi);
		System.out.println("Matristeki elemanlarin toplami: " + toplam);
		
		sutunlarinToplaminiYazdir(ikiBoyutliDizi);
		
		toplamiEnBuyukSatirinIndeksiniVeToplaminiYazdir(ikiBoyutliDizi);
		
		ikiBoyutluDiziyiKar(ikiBoyutliDizi);
		
		diziyiYazdir(ikiBoyutliDizi);
		
	}

	public static void rassalDegerlerleDoldur(int[][] ikiBoyutliDizi) {
		for (int satir = 0; satir < ikiBoyutliDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutliDizi[satir].length; sutun++) {
				ikiBoyutliDizi[satir][sutun] = (int) (Math.random() * 100);
			}
		}
	}
	
	public static void diziyiYazdir(int[][] ikiBoyutliDizi) {
		/*
		for (int satir = 0; satir < ikiBoyutliDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutliDizi[satir].length; sutun++) {
				System.out.printf("%3d", ikiBoyutliDizi[satir][sutun]);
			}
			System.out.println();
		}
		*/
		
		for (int[] is : ikiBoyutliDizi) {
			for (int i : is) {
				System.out.printf("%3d", i);
			}
			System.out.println();
		}
	}
	
	public static int tumElemanlarinToplami(int[][] ikiBoyutliDizi) {
		int toplam = 0;
		
		for (int satir = 0; satir < ikiBoyutliDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutliDizi[satir].length; sutun++) {
				toplam += ikiBoyutliDizi[satir][sutun];
			}
		}
		
		return toplam;
	}
	

	public static void sutunlarinToplaminiYazdir(int[][] ikiBoyutliDizi) {
		for (int sutun = 0; sutun < ikiBoyutliDizi[0].length; sutun++) {
			int toplam = 0;
			for (int satir = 0; satir < ikiBoyutliDizi.length; satir++) {
				toplam += ikiBoyutliDizi[satir][sutun];
			}
			System.out.println((sutun + 1) + ". sutunun toplami: " + toplam);
		}
	}
	

	public static void toplamiEnBuyukSatirinIndeksiniVeToplaminiYazdir(int[][] ikiBoyutliDizi) {
		int enBuyukSatirToplami = -1;
		int enBuyukSatirIndeksi = -1;
		
		for (int satir = 0; satir < ikiBoyutliDizi.length; satir++) {
			int toplam = 0;
			for (int sutun = 0; sutun < ikiBoyutliDizi[satir].length; sutun++) {
				toplam += ikiBoyutliDizi[satir][sutun];
			}
			if (toplam > enBuyukSatirToplami) {
				enBuyukSatirToplami = toplam;
				enBuyukSatirIndeksi = satir;
			}
		}
		
		System.out.println((enBuyukSatirIndeksi + 1) + ". satir toplami en buyuktur. Toplam: " + enBuyukSatirToplami);
		
	}
	
	public static void ikiBoyutluDiziyiKar(int[][] ikiBoyutliDizi) {
		for (int satir = 0; satir < ikiBoyutliDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutliDizi[satir].length; sutun++) {
				int rassalSatir = (int)(Math.random() * ikiBoyutliDizi.length);
				int rassalSutun = (int)(Math.random() * ikiBoyutliDizi[satir].length);
				
				int gecici = ikiBoyutliDizi[satir][sutun];
				ikiBoyutliDizi[satir][sutun] = ikiBoyutliDizi[rassalSatir][rassalSutun];
				ikiBoyutliDizi[rassalSatir][rassalSutun] = gecici;
			}
		}
	}
	
	public static void ikiBoyutluDiziyiKarSadeceSatirIci(int[][] ikiBoyutliDizi) {
		for (int satir = 0; satir < ikiBoyutliDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutliDizi[satir].length; sutun++) {
				int rassalSutun = (int)(Math.random() * ikiBoyutliDizi[satir].length);
				
				int gecici = ikiBoyutliDizi[satir][sutun];
				ikiBoyutliDizi[satir][sutun] = ikiBoyutliDizi[satir][rassalSutun];
				ikiBoyutliDizi[satir][rassalSutun] = gecici;
			}
		}
	}
}
