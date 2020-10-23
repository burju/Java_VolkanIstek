package chapter05;

import java.util.Scanner;

public class CokluCikartmaIslemi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sayac = 0;
		int girdi = 0;
		int number1 = -1;
		int number2 = -1;
		int dogruCevapSayisi = 0;
		String rapor = " ";
		

		while (sayac < 5) {

			number1 = (int) (Math.random() * 10);
			number2 = (int) (Math.random() * 10);

			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			System.out.println(" What is " + number1 + " - " + number2 + " = ?");
			girdi = input.nextInt();


			if (girdi != number1 - number2) {
				System.out.println(" Bilemediniz");
				rapor += number1 + " - " + number2 + " = " + girdi;
				rapor += " Yanlis! \n";
			} else {
				System.out.println(" Tebrikler, bildiniz! ");
				rapor += number1 + " - " + number2 + " = " + girdi;
				rapor += " Dogru! \n";
				dogruCevapSayisi++;
			}
			sayac++;
		}

		System.out.println(
				sayac + " tane soru soruldu ve " + dogruCevapSayisi + " tanesini bildiniz.\n" + rapor);
		
		}

	}
