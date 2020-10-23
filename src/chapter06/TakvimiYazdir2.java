package chapter06;

import java.util.Scanner;

/* kullanicidan yil ve ay girmesini iste
 * o yil-ayin aylik takvimini bastir.
 */
public class TakvimiYazdir2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the year and the month as a number between 1-12");
		int year = input.nextInt();
		int month = input.nextInt();
		//int day = 0;
		String stringMonth = stringMonth(month);
		//stringDay(day);
		System.out.println("          " + stringMonth + " " + year);
		System.out.println("-----------------------------------");
		for (int i = 0; i < 7; i++) {
			System.out.print(" " + stringDay(i) + " ");
		}
		System.out.println();
		// buraya kadar standart takvim basligini ve gunleri bastirdik. 
		//simdi ayin 1'i hangi gune denk geliyor bunu bulalim. see:hangiGunIlk(month,year) Method below.
		
		int hangiGunIlk= hangiGunIlk(month, year);
		
		for (int i = 0; i < hangiGunIlk; i++) {
			System.out.print("     ");
		}
		
		for (int i = 1; i <= kacGunVar(month, year); i++) {
			System.out.printf("%4d", i );
			System.out.print(" ");
			hangiGunIlk++;
			if (hangiGunIlk % 7 == 0) {
				System.out.println();
			}
		}

	}

	


	//METHODS: 
	
	public static String stringDay(int day) {
		// returns the name of the day in String, takes integer value of the day
		// between 0-6

		switch (day) {
		case 0:
			return "Sun";
		case 1:
			return "Mon";
		case 2:
			return "Tue";
		case 3:
			return "Wed";
		case 4:
			return "Thr";
		case 5:
			return "Fri";
		case 6:
			return "Sat";
		default:
			return " ";
		}
	}
	// ------------------------------------------------------------------------------------------------------------------

	public static String stringMonth(int month) {
		// returns the name of the month in String, takes integer value of the month
		// between 1-12
		String stringMonth = "";
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "";
		}

	}
	// -------------------------------------------------------------------------------------------------

	public static int kacGunVar(int month, int year) {
		// girilen ayin kac gun oldugunu bulan metod(30, 31, 28-29 gibi)
		if (month % 2 == 1) // tek aylar -31 gun ceker
			return 31;
		else if (month==2) //subat ayinda o yil icin kac gun cekerse onu bastir
				return (isLeapYear(year))? 29: 28;
			else
				 return 30;
			}

	
	//--------------------------------------------------------------------------
	
	public static int whichLeapYear(int year) {
		// How many days in February for the year entered

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {// artik yil ise takvime 29 gun bastir
		    return 29;

			}
		else {
		return 28;
			}
		}


	//---------------------------------------------------------------------------------------------
	
	public static int hangiGunIlk(int month, int year) {
	   // the first day of 1900 jan1st was Monday(int day=1). we calculated how many days passed since that day 
		//with HowManyYear Days method. 
		return (1+howManyYearDays(month, year))%7;
	}

    //-----------------------------------------------------------------------------------------------------
	public static int howManyYearDays(int month, int year) {
		// calculate how many year days have passed since Jan 1st 1800 till Jan 1st "yearEntered" &
		// calculate how many days have passed since the Jan 1st of that year
		int totalDays=0;
		int totalMonthDays=0;
		int total;
		for(int i=1900; i<year; i++) {
			totalDays+= isLeapYear(i) ? 366: 365 ;
			}
		for (int j= 1; j<month; j++) {
			if(j%2==1) {
				totalMonthDays+=31;
			}
			else if(j==2) {
				totalMonthDays+= isLeapYear(year)?29:28;
			}
			else {
				totalMonthDays+=30;
			}
		}
		total= totalDays+totalMonthDays;
		return total;
		}
		
	

//--------------------------------------------------------------------------------------------------

	public static boolean isLeapYear(int year) {
		// method returns boolean value, is the year leap or not
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {// artik yil ise takvime 29 gun bastir
		    return true;
			}
		else { return false;
		}
	}
	
}