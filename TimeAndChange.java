// Jain Aarush
// February 7, 2019
// Assignment 3: Displaying correct time and change  
// ISC3U Mrs.Strelkovska

public class TimeAndChange {
	public static void main(String[] args) {
	
		// time assignment
	
		int seconds = (int)(Math.random() * 1001) + 999;
		int minutes = seconds / 60;
		int seconds1 = seconds % 60;
		int difference = seconds - seconds1;
		int minutes2 = difference / 60;
		int hours1 = minutes2 / 60;
		int minutes1 = minutes2 % 60;
		System.out.println("Number of seconds is " + seconds);
		System.out.format("The time is: %02d:%02d:%02d\n\n\n", hours1, minutes1, seconds1); 
		// Displaying the right time in 24 hour format

		
		// money and change assignment with math class		

		double money = (double)(Math.random() * 986) + 15;
		double cost = 64.97;
		double number = money / cost;
		double tickets = Math.floor(number);
		double leftover = money % cost;
		double dollars = Math.floor(leftover);
		double cents = leftover - dollars;
		double cents1 = cents * 100;
		double realcents = Math.floor(cents1);

		// Creating objects with class Double to convert a double to an integer
		Double cents2 = new Double(realcents);
		Double dollars2 = new Double(dollars);
		Double tickets2 = new Double(tickets);

		System.out.format("Cost of 1 ticket " + cost + "\n");
		System.out.format("With %.2f dollars you can buy " + tickets2.intValue() + " tickets\n", money);
		System.out.println("The change is " + dollars2.intValue() + " dollars and " + cents2.intValue() + " cents");
		
		// Displaying the number of possible tickets that can be bought and the change in dollars/cents




	}










}
