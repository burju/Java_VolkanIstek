package chapter06;

public class Overloading {
	public static void main(String[] args) {
		double d1 = 5.67;
		double d2 = 23.99;

		double max = max(d1, d2);

		System.out.println(max);

		int m = max(5, 89);
		System.out.println(m);
		
		System.out.println(max(2, 5.89, 6));
	}

	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

	public static int max(int sayi1, int sayi2) {
		return (sayi1 > sayi2) ? sayi1 : sayi2;
	}

	public static double max(double sayi1, double sayi2) {
		double max;

		if (sayi1 > sayi2) {
			max = sayi1;
		} else {
			max = sayi2;
		}

		// alternatifi
		max = (sayi1 > sayi2) ? sayi1 : sayi2;

		return max;
	}
}
