package chapter02;

import java.util.Scanner;

public class FahrenheitCelciusCeviri {

	public static void main(String[] args) {

		System.out.println(" Enter the value you want to convert into Celcius ");

		Scanner input = new Scanner(System.in);

		double fahrenheit = input.nextDouble();

		double celcius = (fahrenheit - 32) * (5.0 / 9);
		/*
		 * neden 5.0 yaptik?cunku esitligin sag tarafin default olarak int. biz mudahale
		 * etmedigimiz surece de sagdaki int'i soldaki double'a islemeye calisacak. o
		 * yuzden (.0) koyduk ki 5/9= 0.xx'ten -int oldugu icin- 0 gelmesin
		 */

		System.out.println(" The value in Celcius is" + celcius);
	}

}
