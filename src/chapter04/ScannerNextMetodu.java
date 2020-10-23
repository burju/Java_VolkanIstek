package chapter04;

import java.util.Scanner;

public class ScannerNextMetodu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" enter 3 words seperated by space");
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();

		System.out.println("The first word is " + s1 + " the second is : " + s2 + " the last one is: " + s3);

	}

}
