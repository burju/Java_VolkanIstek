package chapter05;

public class OkulHarci {
	public static void main(String[] args) {

		System.out.println(" Okul harci $10.000 dir. \n Yillik %7 faizle kac"
				+ "yil sonunda okul harcinin ilk baslangic miktarinin 2 katina ulasacagini bulalim:");

		double tuition = 10000;
		int year = 0;

		while (tuition <= 20000) {
			tuition = tuition * 1.07;
			year++;
		}
		System.out.println("\n " + year + " yil sonunda harc iki katina cikar");
	}

}
