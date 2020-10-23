package chapter06;

public class AsalSayiYazdirMetod2 {
public static void main(String[] args) {
	
	//ilk 50 asal sayiyi yazdir. 
	
	int sayac=0;
	int sayi=2;
	
	while( sayac<50) {
		
		asalMetod(sayi);
		
		if(true) {//if(asalMetod(sayi)) olarak da yazabilirdik.
			System.out.printf("%4d", sayi);
				sayac++;
				if (sayac%10==0) {
					System.out.println();
				}
			  }
		sayi++;
	       
	}
	
 }

 static boolean asalMetod(int sayi) {
		for (int i = 2; i <sayi; i++) {
			if (sayi%i==0){
			return false;
		}}
				return true;
	
}
}
			
		 


