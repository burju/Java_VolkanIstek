package chapter06;

public class RassalKarakter {
	
	public static char rassalKaraterBul(char ch1, char ch2) {
		return (char) (Math.random() * (ch2 - ch1 + 1) + ch1);
	}
	
	public static char buyukHarfBul() {
		return rassalKaraterBul('A', 'Z');
	}
	
	public static char kucukHarfBul() {
		return rassalKaraterBul('a', 'z');
	}

	public static char rakamBul() {
		return rassalKaraterBul('0', '9');
	}
	
	public static char herhangiBirKarakterBul() {
		return rassalKaraterBul('\u0000', '\uFFFF');
	}
}
