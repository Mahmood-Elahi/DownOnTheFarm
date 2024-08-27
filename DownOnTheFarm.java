package downonthefarmassignment;

import java.util.Scanner;

public class DownOnTheFarmAssignment {
	static Scanner keyb = new Scanner(System.in); //Opens scanner to receive input from user

	public static void main(String[] args) {

		String user = "";
		do { //Repeats this loop and keeps printing out questions and animal method until user inputs q into console
			System.out.println("Do you want to hear a (d)og, (c)ow or do you want to (q)uit?"); 
			user = keyb.nextLine(); //Collects user input to use to determine what will be returned from animal method and if loop can continue
			if (user.equals("d") || user.equals("c")) { //if user inputs d or c then loop will continue onto the second question
				System.out.println("How many times do you want to hear the animal?");
				int userTimes = keyb.nextInt(); //Records how many times user wants animal noise to be printed
				keyb.nextLine();
				System.out.println(animal(user, userTimes)); //Prints out animal method using user and userTimes as inputs
			} else if (user.equals("q")) {
				System.out.println(nothing(user));//If user inputs q then nothing method will be printed
			}
		} while (!user.equals("q"));//If user inputs q at beginning of loop then loop will end instead of going through everything
	}

	public static String animal(String user, int userTimes) {
		String noise = "";//Allows multiple of the same animal sounds to be added together and printed out together
		for (int i = 0; i < userTimes; i++) { //Determines how many times user's selection will be printed
			if (user.equals("d")) {
				noise += " Bark";
			} else if (user.equals("c")) {
				noise += " Moo";
			}

		}
		return noise;//Adds default return for computer to fall back on if none of the conditions in the loops above are met
	}

	public static String nothing(String user) {
		String noise = "";
		if (user.equals("q")) {
			noise += " "; //Prints out a blank space if user inputs q
		}
		return noise;
	}
}
