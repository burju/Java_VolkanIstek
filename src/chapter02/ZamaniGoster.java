package chapter02;

import java.util.Scanner;

public class ZamaniGoster {
	public static void main(String[] args) {

		// prompt for input

		System.out.println("Enter time in seconds that you wish to calculate: ");

		Scanner input = new Scanner(System.in);

		int saniye = input.nextInt();

		int dakika = saniye / 60;

		int kalansaniye = saniye % 60;

		System.out.println(saniye + " saniye: " + dakika + " dakika " + kalansaniye + " saniyedir ");

	}

}
