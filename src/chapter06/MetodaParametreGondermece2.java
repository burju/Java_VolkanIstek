package chapter06;

public class MetodaParametreGondermece2 {

	public static void main(String[] args) {
		
		int num1= 1; 
		int num2=2;
		
		System.out.println("Before invoking the swap method, num1 is: " + num1 + " and num2 is: " + num2);
		//invoke the swap method to attempt to swap 2 variables
		swap(num1,num2);
		
		System.out.println("After invoking the swap method, num1 is: " + num1 + " and num2 is: " + num2);
	}

	 static void swap(int n1, int n2) {
		
		 System.out.println("now we are in the swap method: ");
		 System.out.println("Before swapping, num1 is: " + n1 + " and num2 is: " + n2);
		 
		 //swap n1 with n2
		 int temp=n1;
		 n1=n2;
		 n2=temp;
		 System.out.println("After swapping num1 is: " + n1 + " and num2 is: " + n2);
		
	}
}
