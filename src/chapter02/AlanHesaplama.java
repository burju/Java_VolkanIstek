package chapter02;

import java.util.Scanner;

public class AlanHesaplama {

	// kullanici girisi ile alan hesaplama
	public static void main(String[] args) {
		System.out.println("Cemberin alanini hesaplamak icin yaricap giriniz: ");

		Scanner giris = new Scanner(System.in);
		
		double yaricap = giris.nextDouble();
		
		final double PI = 3.14159;
				
		double alan = yaricap * yaricap * PI;
		
		System.out.println(" Yaricapi " + yaricap + " olan cemberin alani " + alan + " dir ");
				
	}
} 



