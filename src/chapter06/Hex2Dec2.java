package chapter06;

import java.util.Scanner;

public class Hex2Dec2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter a hexadecimal number");
	String hex=input.next();
	
	
	hexMetodu(hex.toUpperCase());
	
	int dec= hexMetodu(hex);
}

public static int hexMetodu(String hex) {
	
	//son basamaktan baslayip sayilari bulalim.
	for( int i= hex.length()-1; i<=hex.length(); i--) {
		char hexKarakteri=hex.charAt(i);
		int decKarakterKarsiligi= hexKarakteri-'A'+10;
		return decKarakterKarsiligi;
		
		
	}

}
}
