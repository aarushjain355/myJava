import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Dealer extends Game {


	private ArrayList<String> dealerCards = new ArrayList<String>();
	public int dealerSum = 0;
	private int firstCardValue = 0;
	private String numOfCards = "";

	public Dealer() {


		this.dealerCards = generateCards(2);
		this.firstCardValue = getSum(dealerCards.get(0).charAt(0), dealerCards.get(0) , 0);
		this.dealerSum = getSum(dealerCards.get(1).charAt(0), dealerCards.get(1) , this.firstCardValue);


	}

	public ArrayList<String> getDealerCards() {

		return dealerCards;


	}


	public ArrayList<String> Hit_Or_Stand() {

		ArrayList<String> c_cards = new ArrayList<String>();
		if (dealerSum <= 16) {

			c_cards = super.generateCards(1);				

		} else if (dealerSum > 16) {

			dealerCards.add("STAND");

		}


		for (int i = 0; i < c_cards.size(); i++) {

			dealerCards.add(c_cards.get(i));
		

		} 

		return dealerCards;


	}

	public void printCards(boolean result) {

		String final_result = "";
		if (result) {
			
			final_result = "Dealer's hand: ";
			for (int i = 0; i < dealerCards.size(); i++) {

				final_result = final_result + dealerCards.get(i) + " ";


			}
			final_result = final_result + " Sum: " + dealerSum;
		} else {
			final_result = "Dealer's hand: " + dealerCards.get(0) + " ? " + " Sum > " + firstCardValue;
			
		}

		System.out.println(final_result + "\n");

	}

}

