import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Game {

	public ArrayList<String> takenCards = new ArrayList<String>();
	public static String[] cards = {
"A clubs", "2 clubs", "3 clubs", "4 clubs", "5 clubs", "6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "J clubs", "Q clubs", "K clubs",

"A hearts", "2 hearts", "3 hearts", "4 hearts", "5 hearts", "6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "J hearts", "Q hearts",
 "K hearts",

"A spades", "2 spades", "3 spades", "4 spades", "5 spades", "6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "J spades", "Q spades", 
"K spades",

"A diamonds", "2 diamonds", "3 diamonds", "4 diamonds", "5 diamonds", "6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds",
"J diamonds", "Q diamonds", "K diamonds"
};

	public String[] cardsCopy = {
"A clubs", "2 clubs", "3 clubs", "4 clubs", "5 clubs", "6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "J clubs", "Q clubs", "K clubs",

"A hearts", "2 hearts", "3 hearts", "4 hearts", "5 hearts", "6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "J hearts", "Q hearts",
 "K hearts",

"A spades", "2 spades", "3 spades", "4 spades", "5 spades", "6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "J spades", "Q spades", 
"K spades",

"A diamonds", "2 diamonds", "3 diamonds", "4 diamonds", "5 diamonds", "6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds",
"J diamonds", "Q diamonds", "K diamonds"
};



	public void printDeck(boolean shuffle) { 

		if (shuffle) {

			shuffleDeck();

		}
		for (int cardID = 0; cardID < cards.length; cardID++) {

			System.out.print(cards[cardID] + " ");


		} 

		System.out.println("\n");

	}

	private void shuffleDeck() {

		
		int start = 0;
                int numofCards = cards.length;

                for (int i = 0; i < cards.length; i++) {

                        int random = (int)(Math.random() * numofCards) + start;
                        String temp = cards[random];
                        cards[random] = cards[i];
                        cards[i] = temp;
                        numofCards--;
                        start++;

                }

		
	} 

	public void printCards(boolean result) {

		
		System.out.println("Hello, this is printCards method in Game class");

	}




	public int getSum(char letter, String card, int typeSum) {


		if (letter > 'B') {
			typeSum += 10;

		} else if (letter == 'A') {
			if (typeSum <= 5 || typeSum == 10) {

				typeSum += 11;
			} else {

				typeSum += 1;
			}

		} else if (letter == '1') {

			typeSum += 10;

		} else {


			typeSum += Integer.parseInt(Character.toString(card.charAt(0)));


		}

		return typeSum;

	}



	public boolean isBusted(int i){
		if (i > 21) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWinner(int i) {
		if (i == 21) {
			return true;
		} else {
			return false;
		}

	}

	private String[] removeCard(int ID) {

		String[] cards2 = new String[cards.length - 1];

		for (int i = ID; i < cards.length - 1; i++) {

			cards[i] = cards[i + 1];

		} 

	//	cards[cards.length - 1] = "";
		for (int i = 0; i < cards.length - 1; i++) {

			cards2[i] = cards[i]; 

		}
		cards = cards2;

		return cards;




	}

	public String[] repopulate() {

		if (cards.length < 10) {

			cards = cardsCopy;
		}
		return cards;

	}


	public ArrayList<String> generateCards(int numOfcards) {


		ArrayList<String> currentCards = new ArrayList<String>();
		ArrayList<String> listCards = null;
		int random;

		if (numOfcards == 2) {

			random = 0;
			random = (int)(Math.random() * cards.length);
			currentCards.add(cards[random]);
			cards = removeCard(random);


		} 

		
				
		random = (int)(Math.random() * cards.length);
		currentCards.add(cards[random]);
		cards = removeCard(random);


		return currentCards;



	}













}

	


	





