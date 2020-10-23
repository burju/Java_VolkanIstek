package chapter07;

import java.util.Scanner;

public class ArrayIslemleri_Burcu {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter a number");
		int number = input.nextInt();

		int[] numberArray = new int[number];
		int total = 0;

		for (int i = 1; i <= numberArray.length; i++) {
			System.out.printf("%-3d", i);
			if ((i) % 10 == 0) {
				System.out.println();
			}
			total += i;
		}
		System.out.println();
		System.out.println("The total of numbers from 0 to " + number + " is equal to " + total);

		// girilen sayi (number) kadar rastgele sayi uretelim

		diziyiRassalSAyilarlaDoldur(number, numberArray);
		System.out.println();

		// find the max value in the array of numbers created by the math.random
		// this code also finds & prints the first max number displayed in the array
		dizidekiMaxSayiyiBulYazdir(number, numberArray);

		// assign edilen random sayilarin yerini degistirelim, kagitlari karalim
		// ilk asamada dizi icinde random bir yer bulacagiz ve ilk sayinin yerini bu
		// sayi ile swap edecegiz.

		System.out.println("After we shuffled the randomly generated numbers, we have the following: ");
		for (int i = 0; i < number; i++) {

			int random = (int) (Math.random() * number);
			int temp = 0;
			temp = numberArray[i];
			numberArray[i] = numberArray[random];
			numberArray[random] = temp;
		}

		for (int i = 0; i < number; i++) {
			System.out.printf("%-3d", numberArray[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		// shifting elements to left
		System.out.println("After shifting the already shuffled elements to left, we have the follwong: ");
		int temp = numberArray[0];
		for (int i = 0; i < numberArray.length - 1; i++) {
			numberArray[i] = numberArray[i + 1];
		}
		numberArray[numberArray.length - 1] = temp;

		for (int i = 0; i < numberArray.length; i++) {
			System.out.printf("%-3d", numberArray[i]); 
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static void dizidekiMaxSayiyiBulYazdir(int number, int[] numberArray) {
		int max = 0;
		int index = -1;
		for (int i = 0; i < number; i++) {

			if (numberArray[i] > max) {
				max = numberArray[i];
				index = i;
			}
		}
		System.out.println("the max number is:" + max);
		System.out.println("The index of the first max number is:" + index);
		System.out.println();
	}

	public static void diziyiRassalSAyilarlaDoldur(int number, int[] numberArray) {
		for (int i = 0; i < number; i++) {
			numberArray[i] = (int) (Math.random() * 100);
			System.out.printf("%-3d", numberArray[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
