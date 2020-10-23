package chapter03;

import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {

		// a year is a leap year if it is divisible by 4 but not by 100,or if it is
		// divisible by 400

		// a leap year is divisible by 4

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");

		int year = input.nextInt();

		boolean isLeapYear = (year % 4 == 0);

		// a leap year is NOT divisible by 100

		isLeapYear = isLeapYear && year % 100 != 0;

		// a leap year us is divisible by 4 but not by 100 or divisible by 400.

		isLeapYear = isLeapYear || (year % 400 == 0);
		
		/*
		 * yukaridakiyle ayni
		 * 
		 * isLeapYear = ( year % 4 == 0 && year % 100 !== 0) || (year % 400 == 0);
		 */
		
		if (isLeapYear) {
			System.out.println(year + " is a Leap Year ");
		} else {
			System.out.println(year + " is not a Leap Year ");
		}
	}
}
