// Jain Aarush
// March 3rd, 2019
// Program: Printing hailstone sequence
// Mrs.Strelkovska ICS3U7


import java.util.Scanner;

public class HailstoneSequence {

	public static void main(String[] args) {


		System.out.print("Enter an integer: ");
		int num1 = 0;
		Scanner sn = new Scanner(System.in);

		num1 = sn.nextInt();
		printHailstones(num1);


	}



	public static void printHailstones(int num) {

		System.out.print(num);		


		do {

			if (num % 2 == 0) {

				num /= 2;


			} else {

				num *= 3;
				num++;

			}
			System.out.print(" " + num);



		}
		while (num != 1);


	






	}



}
