package chapter03;

import java.util.Scanner;

public class MathRandomOrnek {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*
		 * 1. Generate two single-digit integers into number1 and number2 . 2. If
		 * number1 < number2 , swap number1 with number2 . 3. Prompt the student to
		 * answer, "What is number1 – number2?" 4. Check the student’s answer and
		 * display whether the answer is correct
		 */

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		if (number1 < number2) {
			// we'll use swap algorithm to sawp number1 & number2

			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.println(" What is " + number1 + " - " + number2 + " = ? ");

		int answer = input.nextInt();

		if (answer == (number1 - number2)) {
			System.out.println("The answer is correct");
		}

		else {
			System.out.println("The answer is false");
		}

	}

}
