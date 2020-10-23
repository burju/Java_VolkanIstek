package chapter05;

public class PrimeNumberMi {

	public static void main(String[] args) {
		int number = 2;
		boolean isPrimeNumber = true;
		int count = 0;

		while (count < 50) // ilk 50 asal sayiyi bastirmak icin
		{
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					isPrimeNumber = false;
				} else {
					isPrimeNumber = true;
					count++;
					System.out.println(count + "th prime number is"+ number);
				}
			}
			number++;
		}
	}
}
