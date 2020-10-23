package chapter05;

import java.util.Scanner;

public class SayiTahminiOyunu {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Guess a magic number between 0-10 ");
		int number = (int) (Math.random() * 10);
		int guess = input.nextInt();


			while (guess != number) {

				if (guess > number) {
					System.out.println(" Buyuk bir sayi girdiniz");
					guess = input.nextInt();
				} else if (guess < number) {
					System.out.println("Kucuk Bir sayi girdiniz");
					guess = input.nextInt();
				} 
				}
			System.out.println(" Tebrikler, bildiniz! ");

		}
	}


