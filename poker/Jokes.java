import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Jokes {


	private static ArrayList<String> jokes = new ArrayList<String>();





	private static void loadJokes() { 
		Scanner Scifile = null;

		try {

			Scifile = new Scanner(new File("Jokes.txt"));



		} catch (FileNotFoundException ex) {

			System.out.print(ex.getMessage());


		}
		while (Scifile.hasNextLine()) {

			jokes.add(Scifile.nextLine());


		}

		
		Collections.shuffle(jokes);




	}

	public static String nextJoke() {

		if (jokes.isEmpty()) {

			loadJokes();					

		}

		int random = (int)(Math.random() * jokes.size());
		String keyjoke = jokes.get(random);

		jokes.remove(jokes.get(random));

		return keyjoke;


	} 

	


	




}



