package chapter07;

import java.util.Scanner;

public class CharArrayiTerseCevir_Burcu {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Lutfen bir yazi giriniz");
		String yazi= input.nextLine();
		
		// girilen yazidan karakter arrayi olusturan metodu cagiralim:
		
		char[] yazi_chr = stringToCharArray(yazi);
		// bu hazir java metodu da kullanilabilrdi : yazi.toCharArray()
		
		System.out.print("Girilen yazi: " );
		System.out.println(yazi_chr);
		
		
		System.out.print("Girilen yazinin tersi: ");
		System.out.println(reverseYazi(yazi_chr));
	}

	public static char[] stringToCharArray(String yazi) {
		char[] yazi_chr_in_method= new char[yazi.length()];
		for (int i = 0; i < yazi_chr_in_method.length; i++) {
		  yazi_chr_in_method[i]= yazi.charAt(i);	
		}
		return yazi_chr_in_method;
	}

	public static char[] reverseYazi(char[] yazi_chr) {
		// yukaridaki ana metoda yollanacak char arrayi:  
		char[] tersYazi= new char[yazi_chr.length];
		 
		// olusturulan arrayin elemanlarini sondan basa diziyoruz.
		for(int i=0, j=yazi_chr.length-1; i<yazi_chr.length; i++, j--) {
			tersYazi[i]= yazi_chr[j];
		}
		 
		 return tersYazi;
		 
		
		
	}

}
