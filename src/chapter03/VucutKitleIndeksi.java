package chapter03;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {

		/*
		 * Body Mass Index (BMI) is a measure of health based on height and weight. It
		 * can be cal- culated by taking your weight in kilograms and dividing it by the
		 * square of your height in meters. The interpretation of BMI for people 20
		 * years or older is as follow BMI Interpretation BMI < 18.5 Underweight 18.5 <=
		 * BMI < 25.0 Normal 25.0 <=BMI < 30.0 Overweight 30.0 <=BMI Obese
		 * 
		 * Write a program that prompts the user to enter a weight in pounds and height
		 * in inches and displays the BMI. Note that one pound is 0.45359237 kilograms
		 * and one inch is 0.0254 meters.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println(" Please enter your weight in pounds: ");
		double weight = input.nextDouble();

		System.out.println(" Please enter your height in inches");
		double height = input.nextDouble();

		double weightInKgs = weight * 0.45359237;
		double heightInMeters = height * 0.0254;

		double BMI = weightInKgs / Math.pow(heightInMeters, 2);

		if (BMI < 18.5) {
			System.out.println("Your BMI is" + BMI + "You're underweight");
		} else if (BMI < 25.0) {
			System.out.println("Your BMI is" + BMI + " You're normal");
		}

		else if (BMI < 30.0) {
			System.out.println("Your BMI is" + BMI + "You're overweight");
		} else {
			System.out.println("Your BMI is" + BMI + "You're Obese");
		}
	}
}
