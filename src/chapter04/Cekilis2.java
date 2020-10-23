package chapter04;

import java.util.Scanner;

/*
 * The lottery program involves generating random numbers, comparing digits, and
using Boolean operators.
Suppose you want to develop a program to play lottery. The program randomly generates a
lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
Note that the digits of a two-digit number may be 0 . If a number is less than 10 , we assume
the number is preceded by a 0 to form a two-digit number. For example, number 8 is treated
as 08 and number 0 is treated as 00 in the program.
 */
public class Cekilis2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String piyangoSayisi = "" + ((int) (Math.random() * 90) + 10);

		char birlerBasamagiA = piyangoSayisi.charAt(1);

		char onlarBasamagiB = piyangoSayisi.charAt(0);

		System.out.println("Lutfen iki basamakli bir sayi giriniz: (Orn: 10 gibi) ");

		String girilenSayi = input.next();

		char girilenSayiBirlerBasamagiA = girilenSayi.charAt(1);

		char girilenSayiOnlarBasamagiB = girilenSayi.charAt(0);

		System.out.println(" Piyango sayisi: " + piyangoSayisi);

		// check whether the user input match all the numbers in the exact order

		if (piyangoSayisi == girilenSayi) {
			System.out.println("Tebrikler! $10.000 kazandiniz!");
		}

		// check whether all digits in the user input match all digits in the lottery
		// number
		else if (birlerBasamagiA == girilenSayiOnlarBasamagiB && onlarBasamagiB == girilenSayiBirlerBasamagiA) {
			System.out.println("Tebrikler! yazdiginiz numaralar, piyango sayilariya eslesti." + " $3.0000 kazandiniz.");
		}

		// check whether one digit in the user input matches a digit in the lottery
		// number

		else if (birlerBasamagiA == girilenSayiBirlerBasamagiA || birlerBasamagiA == girilenSayiOnlarBasamagiB
				|| onlarBasamagiB == girilenSayiOnlarBasamagiB || onlarBasamagiB == girilenSayiBirlerBasamagiA) {
			System.out.println(
					" Tebrikler! yazdiginiz numaralardan en az bir tanesi ile piyango sayisi eslesti. $1.000 kazandiniz!");
		}

		else {
			System.out.println("Uzgunuz, kaybettiniz!");
		}
	}

}
