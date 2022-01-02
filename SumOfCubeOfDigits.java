// Jain Aarush
// March 3rd, 2019
// Program: Outputting sum of cubes of digits
// Mrs.Strelkovska ICS3U7


import java.util.Scanner;

public class SumOfCubeOfDigits {

	public static void main(String[] args) {

		System.out.print("Enter a two digit positive integer: ");
		int firstint = 0;
		Scanner sn = new Scanner(System.in);
		firstint = sn.nextInt();
		

		int sum1 = 0;
		while (true) {

			sum1 += Math.pow(firstint % 10, 3);
			
			
			if (firstint / 10 < 1) {

				break;

			}

			firstint -= (firstint % 10);
			firstint /= 10;


		}
		

		System.out.println("The sum of the cubes of the digit is " + sum1);


	}



}
