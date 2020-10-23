package chapter07;

import java.util.Scanner;

public class DiziIslemleri2_Burcu2 {
	public static void main(String[] args) {
		
		int[] sayiDizisi; // diziyi declere ettik
		sayiDizisi= new int[10]; // diziye kac eleman oldugunun atadik. tek satirda soyle de tanimlanablir: int[] sayiDizisi= new int[10];
		
		//array "new" anahtar kelimesiyle yaratiliyor.new heap alaniyla ilgili. ramin bir kismi stack bir kismi heap'e gider. program calismadan once byukluge kara veriliyorsa(statik ise) 
		// ram stackten alir, yoksa b=program calisirken ne kadar yer alacagina karar veriyorsa dinamiktir ve dinamik program Heap'ten memory alir. 
		//array bizim ogrendigimiz ilk dinamik obje. diger primitif tipler statikti.
		
		//simdi array tanittik, 10 tn elemani oldugunu soyledik ama bunlara atama yapmadik. atama islemi genellikle for dongusuyle yapilir. 
		
		// simdi array'in elemanlarina sayi atamasi yapalim
		
		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i]=i;
			System.out.println(sayiDizisi[i]);
		}
		
		
		//soyle bir syntax daha var:
		//int [] benimListem= new int[5]yerine --> 
		int[] benimListem= {1,2,3,5,6}; //yazabiliriz.
		
		//DIZI ISLEMLERI:
		//----------------------------------------------------------------------------------
		//kullanicidan deger alarak dizi elemanlarini atama: 
		
		int[] dizi= new int[10];
		Scanner input= new Scanner(System.in);
		/*
		 * System.out.println("lutfen" + dizi.length + "  10 tn sayi giriniz:");
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]= input.nextInt();
		}
		*/
		
		//random degerlerler  0-100 arasindadeger atayalim.
		dizi= new int[100];  //daha once 10 tn elemani olan diziyi simdi 100 elemanlik yaptik. onceden atanan degerler cop oldu, simdi yeni bir atama yapilincaya kadar dizinin tum elemanlari degeri 0
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]= (int)(Math.random()*100);
			System.out.printf("%3d", dizi[i]);
			if( (i+1) %10==0 ) {
				System.out.println();
			}
			}
		//karakter array'i olusturunca onunn ismini sysout'a koyup string gibi bastirabilirsin. ama char array disindaki arraylerde bunu yapamazsin. 
		char[] city= {'D', 'a', 'l', 'l','a','s'};
		System.out.println(city);
		
		
	
	
	}

}
