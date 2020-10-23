package chapter05;

import java.util.Scanner;

public class PalidronMu2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Palidron kontrolu icin bir giris yapiniz");
		
		String cumle = input.nextLine(); // nextline ile line in tamamini tarar. 
		
		//char harfIlk= cumle.charAt(0);
		//char harfSon= cumle.charAt((cumle.length()-1));
		boolean palindronMu= true;
		
	for (int i=0 , j= cumle.length()-1 ; i<=j ; i++, j--) {
		
		if (cumle.charAt(i) != cumle.charAt(j)) {
			palindronMu = false;
			break;			
		}
	}		
		
		if ( palindronMu == true) {
		System.out.println(" girdiginiz " + cumle + "cumlesi bir palindrondur");
		}else
			System.out.println(" girdiginiz " + cumle + " bir palindron degildir");
		
	}
}
