package chapter06;

public class TestRassalKarakter {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.buyukHarfBul() + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.kucukHarfBul() + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.rakamBul() + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.herhangiBirKarakterBul() + " ");
		}
	}
}
