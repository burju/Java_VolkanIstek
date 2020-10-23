package chapter07;

import java.util.Scanner;

// dizide elemani arayip kacinci index'te oldugunu gosterelim: 
public class LinearSearch_Burcu {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		double key= input.nextDouble();
		
		
		double [] numbers= {1, 2, 4, 6, 9, 72};
        
		int indexNum= linearSearch(numbers, key);
		if(indexNum>0) {
		System.out.println("The index number for " + key+ " is : "+ indexNum) ;
		} 
		else {
			System.out.println("The number doesn't exist in the array.");
		}
		
	}

	
	
	public static int linearSearch(double[] numbers, double key) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] ==key) {
				return (i+1);
			}
		
		}
		
		return -1;
	}


}