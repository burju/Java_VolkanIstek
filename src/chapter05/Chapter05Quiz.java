package chapter05;

import java.util.Scanner;

public class Chapter05Quiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a1 = (int) (Math.random() * 10);
		int a2 = (int) (Math.random() * 10);

		System.out.println(" What is the sum of " + a1 + " + " + a2 + " = ? ");

		int girdi = input.nextInt();

		int answer = a1 + a2;
		int yanlisSayaci = 0;

		while (girdi != answer & yanlisSayaci < 3) {
			System.out.println(" Wrong answer. Please try again!");
			System.out.println(" What is the sum of " + a1 + " + " + a2 + " = ? ");
			girdi = input.nextInt();
			yanlisSayaci++;
		}
		if (yanlisSayaci == 3) {
			System.out.println(" Yeter artik oynayip durma! ");
		} else {
			System.out.println(" Tebrikler, bildiniz! ");
		}

	}
}
