package chapter02;

import java.util.Scanner;

public class ScannerTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a byte value: ");
		byte byteValue = input.nextByte();
		System.out.println("The value entered is: " + byteValue);

		System.out.println("Enter a short value: ");
		short shortValue = input.nextShort();
		System.out.println("The value entered is: " + shortValue);

		System.out.println("Enter an int value: ");
		int intValue = input.nextInt();
		System.out.println("The value entered is: " + intValue);

		System.out.println("Enter a double value: ");
		double doubleValue = input.nextDouble();
		System.out.println("The value entere is:" + doubleValue);

		// ... gibi

	}

}
