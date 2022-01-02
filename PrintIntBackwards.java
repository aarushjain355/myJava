// Jain Aarush
// March 3rd, 2019
// Program: Printing integer backwards
// Mrs.Strelkovska ISC3U7

import java.util.Scanner;

public class PrintIntBackwards {

	public static void main(String[] args) {


		System.out.print("Enter a positive integer: ");
		int num1 = 0;
		Scanner sn = new Scanner(System.in);
		num1 = sn.nextInt();


		while (true) {

			System.out.println(num1 % 10);

			if (num1 < 10) {

				break;

			}

			num1 -= (num1 % 10);
			num1 /= 10;


		}


	}


}
