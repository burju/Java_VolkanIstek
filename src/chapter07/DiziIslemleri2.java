package chapter07;

import java.util.Scanner;

public class DiziIslemleri2 {
	public static void main(String[] args) {
		int[] dizi = new int [4];
		Scanner input= new Scanner(System.in);
		int diziToplam=0;
		
		System.out.println("Please enter 4 numbers");
		for (int i = 0; i <= dizi.length; i++) {
			dizi[i]= input.nextInt();
			 diziToplam+=dizi[i];  
		}
	System.out.println("girilen sayilarin toplami: " + diziToplam);
	}
    
}
