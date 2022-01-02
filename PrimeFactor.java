// Jain Aarush
// March 3rd, 2019
// Program: Giving prime factrization of a number
// Mrs.Strelkovska ICS3U7


import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		System.out.print("Enter an integer: ");
		int num1 = 0;
		Scanner sn = new Scanner(System.in);
		num1 = sn.nextInt();

		int num2 = num1;

		
		int primecheck = 0;
		for (int i = 1; i < num1; i++) {

			if (num1 % i == 0) {

				primecheck++;

			}


		}


		if (primecheck == 1) {


			System.out.println(num1 + " to the power of 1");

		} else {

		for (int i = 1; i < num1; i++) {

			int newnum = 0;
			for (int j = 1; j < (i + 1); j++) {

				if (i % j == 0) {

					newnum++;


				}				


			}

			if (newnum == 2 && num1 % i == 0) {
				int times = 0;
				while (true) {
					num2 /= i;
					times++;
					if (num2 % i != 0) {

						System.out.println(i + " to the power of " + times);
						break;

					}


				}

			}
			

			

		}

		}


		


	}


}
