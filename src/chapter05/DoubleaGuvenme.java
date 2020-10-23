package chapter05;

public class DoubleaGuvenme {

	public static void main(String[] args) {
		double item = 1;
		double sum = 0;
		while (item != 0) { // No guarantee item will be 0
			sum += item;
			item -= 0.1;
			System.out.println(item);
		}
		System.out.println(sum);
	}

}
