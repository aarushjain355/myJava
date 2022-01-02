// Jain Aarush
// February 10 2019
// Assignment 4: Using Scanner for exercise 7
// ICS3U7 Mrs.Strelkovska



import java.util.Scanner;

public class ScannerAJ {

	public static void main(String[] args) {


		int number = 0;

		Scanner object1 = new Scanner(System.in);

		System.out.print("Enter a three-digit number: ");
		
		number = object1.nextInt();

		int hundreds = number / 100;
	
		int tens = (number - hundreds * 100) / 10;

		int ones = (number - hundreds * 100 - tens * 10);
	
		System.out.println("");
		System.out.println("The hundreds-place digit is: " + hundreds);
		System.out.println("The tens-place digit is: " + tens);
		System.out.println("The ones-place digit is: " + ones);
 
                
	

	}

}
