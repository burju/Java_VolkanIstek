package chapter04;

import java.util.Scanner;

public class KarakterAnalizi1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String yazi = input.next();
		char ch = yazi.charAt(0);

		if ('A' <= ch && ch <= 'Z') {
			System.out.println(ch + " buyuk harf");
		} else if ('a' <= ch && ch <= 'z')
			System.out.println(ch + " kucuk harf");
		else if ('0' <= ch && ch <= '9')
			System.out.println(ch + " rakam");
	}

}
