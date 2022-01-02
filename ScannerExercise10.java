// Jain Aarush
// February 10 2019
// Assignment 4: Using Scanner for Exercise 10
// ICS3U7 Mrs.Strelkovska


import java.util.Scanner;

public class ScannerExercise10 {

	public static void main(String[] args) {


		int birthyear = 0, birthmonth = 0, birthday = 0, newyear = 0, newmonth = 0, newday = 0;

		Scanner object1 = new Scanner(System.in);

		System.out.println("Enter your birthdate:");
		System.out.print("Year: ");
		birthyear = object1.nextInt();
		System.out.print("Month: ");
		birthmonth = object1.nextInt();
		System.out.print("Day: ");
		birthday = object1.nextInt();
		System.out.println("Enter today's date:");
		System.out.print("Year: ");
		newyear = object1.nextInt();
		System.out.print("Month: ");
		newmonth = object1.nextInt();
		System.out.print("Day: ");
		newday = object1.nextInt();

		int years = newyear - birthyear - 1;
		int months = (newmonth - 1) + (12 - birthmonth);
		int days = newday + (30 - birthday);
		int totalDays = (years * 365) + (months * 30) + days;
	

		System.out.println("You have been alive for " + totalDays + " days.");

		int hours = totalDays * 8;

		System.out.println("You have slept " + hours + " hours.");





	}



}
