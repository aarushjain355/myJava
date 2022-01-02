// Jain Aarush
// March 13th, 2020
// String Game Assignment: Hangman
// Mrs.Strelkovska ICS3U7

import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.InputMismatchException;

public class string_game {

	static int num1 = 0;
	static Scanner object1 = new Scanner(System.in);
	static int wins = 0;
	static int losses = 0;
	static int win_streak = 0;
	public static void main(String[] args) throws IOException, InterruptedException, InputMismatchException {
		
		menu();
		
	}

	// method to catch input errors for integers and characters
	public static int correct_input(int ceiling, boolean integer) throws IOException, InterruptedException, InputMismatchException {
		int input = 0;
	
		while (true) {

			try {
				// checks if the the input value required is an integer
				if (integer) {
					input = object1.nextInt();
					// checks if the input value is within the range of possible inputs
					if (input >= 1 && input <= ceiling) {					
						break;
					} else {
				
						System.out.println("The number you entered is not within the boundries specified, try again");

					}
				// if not an integer, this block runs for characters
				} else {

					char input1 = object1.next().charAt(0);
					input = (int)(input1);
					// checks if the character is a letter
					if ((input1 >= 'a' && input1 <= 'z') || (input1 >= 'A' && input1 <= 'Z')) {
						
						break;

					} else {
						System.out.println("The character you entered is not a letter, try again");

					}
					
				}
				
			

			} catch (Exception e) {

				if (integer) {
				
					System.out.println("Please enter a number and not anything else");

				} else {

					System.out.println("Please enter a character and not anything else");

				}
				object1.next();
			}

		}

		return input;

	}
	// method to catch input errors for string
	public static String correct_word() throws IOException, InterruptedException, InputMismatchException {


		String word = " ";
		boolean correct = true;
		int counter = 0;
		while (true) {
			counter++;
			try {

				if (counter == 1) {
					word = object1.nextLine();
				}
				word = object1.nextLine();
				// checks if the input is made of only letters of the alphabet
				for (int i = 0; i < word.length(); i++) {
					if ((word.charAt(i) > 'Z' || word.charAt(i) < 'A') && (word.charAt(i) > 'z' || word.charAt(i) < 'a') && (word.charAt(i) != ' ')) {
						correct = false;

					} 
				

				}
				if (correct) {

					break;

				} else {
					System.out.println("Please enter a word with all letters");
				}

			} catch (Exception e) {

				System.out.println("Please enter words");

			}





		}

		return word;





	}

	// method that runs menu
	public static void menu() throws IOException, InterruptedException, InputMismatchException {


		System.out.println("WELCOME TO THE PROFESSIONAL HANGMAN GAME");
		System.out.println("YOU CAN CHOOSE FROM THE THREE CATEGORIES");
		System.out.println("Enter 1 for sports");
		System.out.println("Enter 2 for animals");
		System.out.println("Enter 3 for food");
		System.out.println("Enter 4 for instructions");
		System.out.println("Enter 5 to exit");
		System.out.println("You have " + wins + " wins");
		System.out.println("You have " + losses + " losses");
		System.out.println("Win Streak: " + win_streak);
		int num1 = correct_input(5, true);		
		// after receiving input, the method runs methods later on in the code
		if (num1 == 5) {
			exit();
		} else if (num1 == 4) {
			instructions();

		} else {
			
			int levelnum = difficulty_level();

			if (num1 == 1) {
				games("Sports", levelnum);
			} else if (num1 == 2) {
				games("Animals", levelnum);
			} else if (num1 == 3) {
				games("Food", levelnum);
			}
			exit();
		}
		

	}


	// method that displays instructions
	public static void instructions() throws IOException, InterruptedException, InputMismatchException {

		System.out.println("The game is simple");
		System.out.println("You will have three categories to choose from: Sports, animals, and food");
		System.out.println("You will also have to choose a difficulty level from either easy, medium, or hard");
		System.out.println("You will have to guess letters or take an attempt at the word every time until you have found the word or your turns have run out");
		System.out.println("You will have a maximum of 10 tries to guess an incorrect letter or word before the game ends");
		System.out.println("Enter 1 to go back or 2 to exit");

		int num1 = correct_input(2, true);
		// after receiving correct input, the method accesses other methods to run for each specific input
		if (num1 == 1) {
			menu();

		} else if (num1 == 2) {
			exit();

		} else {

			instructions();
		}


	}
	// method that asks for difficulty level 
	public static int difficulty_level() throws IOException, InterruptedException, InputMismatchException {

		System.out.println("Enter your difficulty level(1 for easy, 2 for medium, 3 for hard)");
	
		int levelnum1 = correct_input(3, true);
		// returns either 1, 2, or 3 indicating easy, medium, or hard
		return levelnum1;


	}
	// method that displays exit message
	public static void exit() throws IOException, InterruptedException, InputMismatchException {

		System.out.println("Thank you for playing the PROFESSIONAL HANGMAN GAME");
		System.out.println("Enter 1 to return to the menu or 2 to confirm exit");
		int num1 = correct_input(2, true);
		if (num1 == 1) {
			menu();

		}


	}

	
	// method that runs the hangman game
	public static void games(String txt, int level) throws IOException, InterruptedException, InputMismatchException {

		// generates a random number and goes through the specific file and dificulty rane of words to pick the secret word
		int random = (int)((Math.random() * 8) + ((level - 1) * 8 + 1));

		String keyword = "";
		
		Scanner Scfile = new Scanner(new File(txt + ".txt"));

		for (int i = 0; i < random; i++) {

			keyword = Scfile.nextLine();


		}

		// asks user if they want to see the keyword and if so, displays the word to the TEACHER ONLY
		System.out.println("Enter 1 if you want to see the secret word or 2 if you don't");
		int num1 = correct_input(2, true);

		if (num1 == 1) {

			System.out.println(keyword);

		}




		
		
		int max_tries = 10;
		boolean win = false;
		boolean check;
		boolean check2 = false;
		String char1 = "_ ";
		String char2 = "_";
		String space = "  ";
		StringBuffer word_display = new StringBuffer("");
		String wrong_letters = "";
		String wrong_words = "";
		// Based on the keyword, program creates a word_display for the user with spaces and _ signs
		for (int i = 0; i < keyword.length(); i++) {

			if ((keyword.charAt(i) >= 'a' && keyword.charAt(i) <= 'z') || (keyword.charAt(i) >= 'A' && keyword.charAt(i) <= 'Z')) {
				word_display.append(char1);

			} 
			else {
				word_display.append(space);

			}


		}
	
		
		Scfile.close();

		// runs the game within 10 tries 
		while (max_tries != 0) {

			System.out.println(word_display + "\n");
			// asks user to if they wish to guess a character or a word
			System.out.println("Enter 1 to guess a letter or 2 to guess the word");




			check = false;
			boolean repeat = true;
			char guess = ' '; 
			String guess1 = " "; 
			String lower_guess = " ";
			String upper_guess = " ";
			boolean check3 = false;
			int num2 = correct_input(2, true);
			// displays the hint for the user if they need it
			System.out.println("Enter 1 to see the hint or 2 to pass");
			int hint = correct_input(2, true);

			// runs through the text file full of hints for each level and displays it if the user wants it
			if (hint == 1) {

				String hint2 = "";
				Scanner Scfile2 = new Scanner(new File(txt + "_Hints.txt"));
				for (int i = 0; i < level; i++) {

					hint2 = Scfile2.nextLine();
					

				}
				System.out.println("Hint: " + hint2);
				System.out.println();


			}
			// this block of code runs if the user wishes to input a string
			if (num2 == 2) {
				System.out.println("You have already guessed the following incorrect words");
				System.out.println(wrong_words + " \n");
				System.out.println("Guess a word");
				System.out.println(word_display + "\n");
				String word_guess = "";
				word_guess = correct_word();
				// takes the input and checks if the word is the keyword disregarding capital and lowercase letters
				if (word_guess.equals(keyword) || (word_guess.toUpperCase()).equals(keyword.toUpperCase())) {
					win = true;
					check2 = true;
					System.out.println(keyword);
					break;

				// Adds the incorrect word on the list of incorrect words and displays it for the user to see
				} else {
					System.out.println("Wrong guess");
					max_tries--;
					System.out.println("You have " + max_tries + " tries remaining");
					check3 = true;
					wrong_words = wrong_words + word_guess;
					wrong_words = wrong_words + space;
				}

		
			// this block of code runs if the user wishes to input a character
			} else if (num2 == 1) {
			System.out.println("You have already guessed the following incorrect characters");
			System.out.println(wrong_letters + "\n");
			System.out.println("Guess a character");
			System.out.println(word_display + "\n");

			int result = correct_input(0, false);
			guess = (char)(result);
			guess1 = Character.toString(guess);
			lower_guess = guess1.toLowerCase();
			upper_guess = guess1.toUpperCase();

			// checks if the the user has entered the input before and if so, outputs a message explaining this to the user
			if (word_display.indexOf(lower_guess) >= 0 || word_display.indexOf(upper_guess) >= 0) {

				System.out.println("You have already guessed this character, try again");
				repeat = false;

			}

			// checks if the character is within the keyword and if so, inserts it into the word display
			for (int k = 0; k < keyword.length(); k++) {

				String character = Character.toString(keyword.charAt(k));

				if (keyword.charAt(k) == guess || character.equals(upper_guess) || character.equals(lower_guess)) {
					check = true;
	
						if (character.equals(upper_guess)) {

							word_display.insert(k * 2, guess1.toUpperCase());

						} else {


							word_display.insert(k * 2, guess1.toLowerCase());
				
						}
						word_display.delete(k * 2 + 1, k * 2 + 2);
					
				}

				if (word_display.indexOf(char2) < 0) {
					win = true;
					check2 = true;
					System.out.println(word_display);
					System.out.println(keyword);
					break;

				}
				}
 


			}
			
			// breaks from the loop
			if (check2) {

				break;
			}
			// checks if the incorrect was entered before or not and if not, enters the word in the incorrect words list
			if (check == false && check3 == false) {
					
					if (wrong_letters.contains(guess1.toLowerCase()) || wrong_letters.contains(guess1.toUpperCase())) {

						System.out.println("you have already guessed that, try again");

					} else {

						max_tries--;
						System.out.println("wrong guess");
						System.out.println("You have " + max_tries + " tries remaining\n");
						wrong_letters = wrong_letters + guess1.toLowerCase();
						wrong_letters = wrong_letters + space;
					}

			// prints corect message if the character is correct and has not been entered before
			} else if (check && repeat) {

				System.out.println("correct");
			} 

			Thread.sleep(2000);			


			



	        }
		// increases the number of wins user has in the game and prints victory message
		if (win) {
			wins++;
			win_streak++;
			System.out.println();
			System.out.println("     _                    .  __");
			System.out.println("|_| | | | |   \\   /\\   /  | |  |");
			System.out.println(" |  |_| |_|    \\_/  \\_/   | |  |\n");
			System.out.println("Congratulations, you have added a win to your streak");
		// increaes the number of losses user has in the game and prints game over message
		} else {
			losses++;
			win_streak = 0;
			System.out.println();
			System.out.println("YOU HAVE RUN OUT OF TRIES AND YOUR WIN STREAK IS BACK TO 0");
			System.out.println("The correct word was " + keyword + "\n");
		}



	}

}
