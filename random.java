// Jain Aarush
// February 27th
// Rounding number and Random number generator assignment
// Mrs.Strelkovska ICS3U7


public class random {

	public static void main(String[] args) {


		// rounding assignment

		double expression1 = 1 / 4 + 10 - 3 / (5 - 0.00024);
		// round number to 2 decimal places
		double rounded1 = (Math.round(expression1 * 100)) / 100.0;
		System.out.format("%.2f\n", rounded1);

		double expression2 = (Math.pow(27.3 + 0.3, 3) - ((3 + 15.3) / (1.22 / 2)) + 15.34876) / (Math.sqrt(6));
		double rounded2 = (Math.round(expression2 * 100)) / 100.0;

		System.out.println(rounded2);



		// random number assignment

		System.out.println((int)(Math.random() * 21));
		System.out.println((int)((Math.random() * 10) - 6));
		System.out.println((int)((int)(Math.random() * 7) * 10));

	}


}
