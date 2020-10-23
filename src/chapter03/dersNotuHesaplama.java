package chapter03;

import java.util.Scanner;

public class dersNotuHesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ders notunuzu giriniz: ");
		
		int dersNotu = input.nextInt();
		
		if (dersNotu >= 90) {
			System.out.println("Harf notunuz A!");
		}
	
		
		else if (dersNotu >= 80) {
		System.out.println("Harf notunuz B!");
		}
		
		else if (dersNotu >= 70) {
		System.out.println("Harf notunuz C!");
		}
 
		else
		{
			System.out.println("Harf notunuz F!");
	
		}
	}
}

