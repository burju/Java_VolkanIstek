package chapter02;

import java.util.Scanner;

/*we intend to compute the monthly payments and the total payments of a loan given the 
 * interest rat, loan amount, #of years
*/
public class FaizHesaplama {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		double monthlyInterestRate = interestRate / 1200;
				
		System.out.println(" Enter the loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.println(" Enter the number of years you wish to pay back");
		int numberOfYears = input.nextInt();

				

	
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1
				- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.println(" Monthly Payments are: $" + (int) (monthlyPayment * 100) / 100.0);
		System.out.println(" Total Payment is: $" + (int) (totalPayment * 100) / 100.0);
	}

}
