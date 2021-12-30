import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Blackjack {



	public static void main(String[] args) {
		System.out.println("Welcome to BLAKCJACK GAME\n");
		System.out.println("Enter your name: ");
		Scanner Scan = new Scanner(System.in);
		String name = Scan.nextLine();
		System.out.println();
		Game new1 = new Player();
		while (true) {
			new1.printDeck(false);
			new1.printDeck(true);
			Player player = new Player(name);
			Game gameP = player;

			Dealer dealer = new Dealer();
			Game gameD = dealer;
			Game.cards = gameP.repopulate();

			boolean player_win = false;
			boolean continue1 = true;

			ArrayList<String> pc = player.getPlayerCards();
			ArrayList<String> dc = dealer.getDealerCards();

			player.printCards();

			// all game1.printCards are example of polymorphism
			gameD.printCards(false);
			if (player.playerSum == 21) {
				player_win = true;
				System.out.println(name + " is winner");
				continue1 = false;

			} else if (dealer.dealerSum == 21) {

				continue1 = false;
				System.out.println("Dealer is winner");

			}
			while (continue1) {
			

				pc = player.Hit_Or_Stand();
				if (pc.get(pc.size() - 1).equals("STAND") == false) {

					Game.cards = gameP.repopulate();
					player.playerSum = player.getSum(pc.get(pc.size() - 1).charAt(0), pc.get(pc.size() - 1), player.playerSum);

					player.printCards();

					if (player.isBusted(player.playerSum)) {
						System.out.println(name + " has busted at " + player.playerSum);
						break;
				
					} else if (player.isWinner(player.playerSum)) {

						System.out.println(name + " is winner");
						player_win = true;
						break;
					}


				} else {
				
					pc.remove("STAND");
					player.printCards();

				}
		

				dc = dealer.Hit_Or_Stand();
				if (dc.get(dc.size() - 1).equals("STAND") == false) {
					System.out.println("Dealer hits");
					Game.cards = gameD.repopulate();
					dealer.dealerSum = dealer.getSum(dc.get(dc.size() - 1).charAt(0), dc.get(dc.size() - 1), dealer.dealerSum);
					gameD.printCards(false);
					if (dealer.isBusted(dealer.dealerSum)) {
						System.out.println("Dealer is busted at " + dealer.dealerSum);
						player_win = true;
						break;
				
					} else if (dealer.isWinner(dealer.dealerSum)) {

						System.out.println("Dealer is winner");
						break;
					}


				} else {
					System.out.println("Dealer Stands");
					dc.remove("STAND");
					gameD.printCards(false);

				}


			}

			if (player_win) {

				System.out.println(name + " says: " + Jokes.nextJoke() + "\n\n");

			} else {

				System.out.println("Dealer says " + Jokes.nextJoke() + "\n\n");

			}
			System.out.println("Results\n\n");
			player.printCards();
			gameD.printCards(true);
			gameP.printDeck(false);		
			System.out.println("Enter Y to play again or N to end the game");
			String playAgain = Scan.nextLine();
			if (playAgain.toUpperCase().equals("N")) {
				
				break;
				
			}
		}
	}


}
