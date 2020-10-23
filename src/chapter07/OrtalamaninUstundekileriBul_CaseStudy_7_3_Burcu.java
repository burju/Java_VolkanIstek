package chapter07;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;

/*
 * The problem is to write a program that finds the number of items above the average of
all items.
Now you can write a program using arrays to solve the problem proposed at the beginning of
this chapter. The problem is to read 100 numbers, get the average of these numbers, and find the
number of the items greater than the average. To be flexible for handling any number of input, we
will let the user enter the number of input, rather than fixing it to 100. Listing 7.1 gives a solution.
 */
public class OrtalamaninUstundekileriBul_CaseStudy_7_3_Burcu {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter thenumber of items you want to enter");
		int items= input.nextInt();
		
		double[] itemDizi= new double[items];
		double toplam=0;
		double average=0;
		int count=1; //ortalama hesaplamak icin kac kez giris yapildigini saymaya yarayacak
		System.out.println("Please enter each number in the sequence one by one"); 
			for (int i= 0; i<itemDizi.length; i++) {
				
				itemDizi[i]= input.nextDouble();	
				
				toplam+= itemDizi[i];
				
				average= toplam/count;
			    
				count++;		
			}
			
			int biggerThanAverageCount=0;
			
			for(int i= 0 ; i <itemDizi.length; i++ ) {
				if( itemDizi[i] > average) {
					biggerThanAverageCount++;
				}
			     
			}
			System.out.println("The average is:" + average);
			System.out.println("The number of items entered that are bigger than the average is " + biggerThanAverageCount);
	}

}
