package chapter05;

import java.util.Scanner;

public class EnKucukBolen {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Bir tam sayi giriniz: ");
		int sayi = input.nextInt();
		
		int bolen = 2;
		
		while ( bolen< sayi) {
			
			if( sayi%bolen == 0)
			{
				System.out.println(" en kucuk bolen " + bolen + " dir");
				break;
			}
				bolen++;
			}
	}

}
