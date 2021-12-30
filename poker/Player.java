import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Player extends Game {

	private ArrayList<String> playerCards = new ArrayList<String>();
	private String name;
	public int playerSum = 0;

	public Player(String name) {


		this.playerCards = generateCards(2);
		this.name = name;
		this.playerSum = getSum(playerCards.get(0).charAt(0), playerCards.get(0) , this.playerSum);
		this.playerSum = getSum(playerCards.get(1).charAt(0), playerCards.get(1) , this.playerSum);

	}

	public Player() {}

	public ArrayList<String> getPlayerCards() {

		return this.playerCards;


	}



	public ArrayList<String> Hit_Or_Stand() {


		Scanner object1 = new Scanner(System.in);
		System.out.println("Hit or Stand? ");
		String input = object1.nextLine();

		if (input.toUpperCase().equals("HIT")) {

			ArrayList<String> cards = super.generateCards(1);
			for (int i = 0; i < cards.size(); i++) {

				playerCards.add(cards.get(i));
		

			}


		} else {


			playerCards.add("STAND");

		}

		return playerCards;


	}


	public void printCards() {

		System.out.print(name + "'s hand: ");

		for (int i = 0; i < playerCards.size(); i++) {

			System.out.print(playerCards.get(i) + " ");


		}

		System.out.print("Sum: " + playerSum + " \n");

	}

}



