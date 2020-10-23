package chapter06;

public class NPrintln {

	public static void main(String[] args) {
		nPrintln("Merhaba java!", 5);
	}

	static void nPrintln(String mesaj, double donguSayisi) {
		for (int j = 0; j < donguSayisi; j++) {
			System.out.println(mesaj);
		}
	}

}
