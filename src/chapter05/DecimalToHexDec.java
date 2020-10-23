package chapter05;

import java.util.Scanner;

public class DecimalToHexDec {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//ask an integer & read it
		System.out.println(" Please enter an integer to convert hexdex:");
		int girilenSayi = input.nextInt();
		String hexSayi ="";
		int tamsayi = girilenSayi;
		
		// convert it to hex
		
		while (tamsayi > 0) {
			int basamak = tamsayi % 16;
			if (basamak < 10) {
				hexSayi = basamak + hexSayi;
			} else {
				hexSayi = (char) ('A' + (basamak - 10)) + hexSayi;
			}
			tamsayi = tamsayi / 16;
		}

		System.out.println("" + girilenSayi + " degerinin hex karsiligi " + hexSayi + " dir");
		
		
		}
	
}

