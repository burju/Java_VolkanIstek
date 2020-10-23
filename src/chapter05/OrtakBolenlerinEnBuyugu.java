package chapter05;

import java.util.Scanner;

public class OrtakBolenlerinEnBuyugu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" Please enter 2 integers that you want us to calculate the greatest divider");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		int ebob = 1; // ilk ebob 1'dir. buradan teste baslayalim ve arttirarak kontrol edelim.
		int x = 2; // eger sayilar cift sayi ise ebob 2 de olabilir. bunun icin de kontrol edelim
					// ve arttiralim.

		while (x <= n1 && x <= n2) {
			if (n1 % x == 0 && n2 % x == 0) {
				ebob = x;
			}
			x++;
		}
		System.out.println(" EBOB = " + ebob);
	}


	}


