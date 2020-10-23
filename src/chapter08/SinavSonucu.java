package chapter08;

public class SinavSonucu {

	public static void main(String[] args) {
		char[][] cevaplar = { 
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		char[] cevapAnahtari = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		
		for (int satir = 0; satir < cevaplar.length; satir++) {
			int dogruCevapSayisi = 0;
			for (int sutun = 0; sutun < cevaplar[satir].length; sutun++) {
				if (cevaplar[satir][sutun] == cevapAnahtari[sutun]) {
					dogruCevapSayisi++;
				}
			}
			System.out.println((satir + 1) + ". ogrenci " + dogruCevapSayisi + " tane dogru cevap vermistir");
		}
	}

}
