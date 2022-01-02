// Jain Aarush
// March 3rd, 2019
// Program: password checker
// Mrs.Strelkovska ICS3U7



import java.util.Scanner;


public class password {

	public static void main(String[] args) {


		int password = 0;

		int pin = 1234;

		boolean check = false;

		Scanner object1 = new Scanner(System.in);
                int i = 0;
		while (i < 3) {

			System.out.print("Please enter your 4 digit pin number: ");
		
			password = object1.nextInt();
			if (password == 1234) {
				check = true;
				break;
			
				
			} else {
				int remain = 2 - i;
				if (i != 2) {
					System.out.println("Wrong pin entered, you have " + remain + " attempts remaining\n");

				}

			}
			
			i++;
		}

		if (check) {

			System.out.println("Pin Accepted! Welcome to the system.");

		} else {

			System.out.println("Wrong pin entered, you have been locked out of the system");

		}
	

		


	


	
	}


}
