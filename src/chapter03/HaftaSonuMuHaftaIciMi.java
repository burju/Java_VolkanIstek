package chapter03;

import java.util.Scanner;

public class HaftaSonuMuHaftaIciMi {

	public static void main(String[] args) {

		/* Weekdays for day of 1 to 5 and Weekends for day 0 and 6 */

		Scanner input = new Scanner(System.in);

		System.out.println(" bir gun giriniz (pazartesi icin 1, pazar icin 7)");

		int gun = input.nextInt();

		switch (gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta ici");
			break;
		case 6:
		case 7:
			System.out.println("Haftasonu");
			break;
		default:
			System.out.println(" Yanlis bir sayi girdiniz");
			break;
	
		}
		System.out.println(" Devam etmek istiyor musunuz?" );
		String cevap = input.next();
		
		switch (cevap.charAt(0)) {
		//burada da cevap.toLowerCase().charAt(0) yapip ilk karakteri kucuk harfe cevirip asagi sadee 
		// kucuk e h koyabilirdik.
		case 'e':
		case 'E':
			System.out.println("Devam etmek icin programi tekrar calistirabilirsiniz");
			break; //break koymazsam alttakine gecer. akisi durdurmaz. 
			
		case 'h':
		case 'H':
			System.out.println("siz bilirsiniz");
			break;
		default:
			System.out.println(" Ne dediginizi anlayamiyorum");
				
		}
		
	}

}
