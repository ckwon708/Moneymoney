import java.util.Scanner;
public class Moneymoney {
	public static void main(String[] args) {
		System.out.println("Welcome to Moneymoney!");
		String name;
		String presName;
		

		Scanner reader= new Scanner (System.in);
		System.out.println ("Please enter denomination as 1, or last name as 2");
		int response = reader.nextInt();

		if (response == 1) {
			System.out.println ("Please enter 1, 10, 100");
			int dollar = reader.nextInt();
			
			if (dollar == 1) {
				System.out.println ("Which president appears on the $1 bill?");
				presName = reader.next();
				if (presName.equals("Washington")) {
					System.out.println("Correct!");
				}
				else {
				System.out.println ("Incorrect.");
					
				}
			}
			
			else if (dollar == 10) {
				System.out.println ("Which president appears on the $10 bill?");
				presName = reader.next();
				if (presName.contentEquals("Hamilton")) {
					System.out.println ("Correct!");
				}
			
				else {
				System.out.println ("Incorrect.");
				
				}
		}
		
			else if (dollar == 100) {
				System.out.println ("Which president appears on the $100 bill?");
				presName = reader.next();
				if (presName.contentEquals("Franklin")) {
					System.out.println ("Correct!");
				}
			
					else {
					System.out.println ("Incorrect.");
				}	
			}
		
		
		else {
			System.out.println ("Please enter last name: ex. Washington, Hamilton, or Franklin.");
			name = reader.next();
			
			if (name.equals("Washington")) {
				System.out.println ("Which denomination does Washington appear on?");
				int responseNew = reader.nextInt();
				if (responseNew == 1) {
					System.out.println ("Correct!");
				}
				else {
				System.out.println ("Incorrect.");
					
				}
			}
		
			else if (name.equals("Hamilton")) {
				System.out.println ("Which denomination does Hamilton appear on?");
				int responseNew = reader.nextInt();
				if (responseNew == 10) {
					System.out.println ("Correct!");
				}
				else {
				System.out.println ("Incorrect.");
			}
			}
			
			else if (name.equals("Franklin")) {
				System.out.println ("Which denomiation does Franklin appear on?");
				int responseNew = reader.nextInt();
				if (responseNew == 100) {
					System.out.println ("Correct!");
				}
				else {
				System.out.println ("Incorrect.");
			}
			}
		}
	}
}
}
	/*
	 * Create a program that asks a user to match the presidents last name to the bill denomination 
	 * or the bill denomination to the presidents last name.
	 * 
	 * The input should prompt the user: "Type 1 to enter a denomination, type 2 
	 * to enter a last name: "
	 * 
	 * if the user enters a 1 prompt the user: "Choose a denomination: " (they can only enter an integer value of 1, 10, or 100)
	 * then prompt the user: "Which person appears on the 'denomination the user chose' dollar bill?"
	 * if the user is correct print out Correct!, if not then print Incorrect!
	 * 
	 * if the user enters a 2 prompt the user: "Choose a last name:" (they can only enter a String value of Washington, Hamilton, and Franklin)
	 * then prompt the user: "Which denomination does 'the last name the user entered' appear on?"
	 * if the user is correct print out Correct!, if not then print Incorrect!
	 * 
	 * Example: 
	 * 	Type 1 to enter a denomination, type 2 to enter a last name: 1
	 * 	Choose a name: Washington
	 * 	Which denomination does Washington appear on? 1
	 * Correct!
	 * 
	 * @param args
	 */




