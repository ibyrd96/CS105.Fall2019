/*
Program/Project: Lab9a - Starter Code
Your Name: 
Date: 
Instructor: 
Description: 
*/
package week9;

import java.util.*;

public class Lab9a {
	/**
	 * main() method displays a menu to the user and asks them to select a
	 * command. The method will continue to display the menu to the user until
	 * they wish to quit by selecting 'Exit' from the menu. The method also
	 * creates a new, empty shoppingList of type ArrayList<String> Based on the
	 * user input, the appropriate method will be called to perform actions on
	 * the shoppingList. Calls: getChoice(), addItems(), deleteItems(),
	 * showItems(), sortItems().
	 */
	public static void main(String[] args) {
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		String[] validMenuChoices = {"1", "2", "3", "4", "5"}; // Array for
																// valid menu
																// choices
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList
																	// for
																	// shoppingList
		String choice; // Holds user input of type String
		boolean done = false; // Keeps program running until user wants to quit

		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Exit");
			choice = getChoice(sIn, "Please enter a command: ",
					"Invalid response.  Please enter a choice from the menu (1-5).",
					validMenuChoices);

			// Call the appropriate method for the choice selected.
			switch (choice) {
				case "1" : // Add items to the Shopping List
					System.out.println(addItems(sIn, shoppingList)
							+ " items have been added to your Shopping List.");
					break;
				case "2" : // Delete items from the Shopping List
					System.out.println(deleteItems(sIn, shoppingList)
							+ " items have been deleted from your Shopping List.");
					break;
				case "3" : // Show the items in the Shopping List
					showItems(shoppingList);
					break;
				case "4" : // Sort the items in the Shopping List
					sortItems(shoppingList);
					break;
				case "5" : // Exit the program
					done = true;
					break;
			} // End of switch (choice)
		} while (!done); // Keep running the program until the user quits
	}// end of main()

	//////////////////////////////////////////////
	// STUDENTS, FILL IN THE METHOD STUBS BELOW://
	// addItems() //
	// deleteItems() //
	// showItems() //
	// sortItems() //
	//////////////////////////////////////////////

	/**
	 * addItems() method asks the user to enter an item to be stored in the
	 * shoppingList and then adds the item to the shoppingList ArrayList. The
	 * user may enter as many items as they want, hitting ENTER to stop entering
	 * items and return to main(). Each time the user enters an item into the
	 * list, a message will be displayed showing the item entered. Returns the
	 * number of items added to the shoppingList
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		int itemsAdded=0;
		while (true) {// get numbers from user or enter key
			System.out.println(
					"Add an item to the list (or just hit 'ENTER' when done): ");
			String answer = sIn.nextLine();
			if (answer.isEmpty())
				break;
			shoppingList.add(answer);
			System.out.println(
					"'" + answer + "' has been added to the shopping list.");
			itemsAdded++;
		}
		return itemsAdded;
	}// end of method addItems(ArrayList<String>)

	/**
	 * deleteItems() method asks the user to enter an item to be deleted from
	 * the shoppingList and then deletes the item from the shoppingList
	 * ArrayList. The user may delete as many items as they want, hitting ENTER
	 * to stop deleting items and return to main(). Each time the user deletes
	 * an item from the list, a message will be displayed showing the item
	 * deleted. If the user tries to delete an item not in the list, a message
	 * will be displayed indicating the error and showItems() will be called.
	 * Returns the number of items deleted from the shoppingList
	 */
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		int deletedItems=0;
		while (true) {// get numbers from user or enter key
			System.out.println(
					"Delete an item to the list (or just hit 'ENTER' when done): ");
			String removeItem = sIn.nextLine();
			
			if (removeItem.isEmpty())
				break;
			
			if (shoppingList.indexOf(removeItem)>0) {
				shoppingList.remove(removeItem);
				System.out.println(
						"'" + removeItem + "' has been removed from the shopping list.");
				deletedItems++;
			} else {
				System.out.println("Invalid response! "+removeItem+" is NOT an item in the list.");	
				showItems(shoppingList);
			}
		}
		return deletedItems;
	}// end of method deleteItems(ArrayList<String>)

	/**
	 * showItems() method simply displays the contents of the shoppingList
	 * ArrayList in it's simplest form: [item-1, item-2, item-n]
	 */
	public static void showItems(ArrayList<String> shoppingList) {
		System.out.println("The Shopping List contains the following items:\n"+shoppingList);
	}// end of method showItems(ArrayList<String>)

	/**
	 * sortItems() method sorts the items in the shoppingList ArrayList, then
	 * calls showItems() to display the sorted list.
	 */
	public static void sortItems(ArrayList<String> shoppingList) {
		Collections.sort(shoppingList);
		System.out.println("The Shopping list has been sorted.");
		showItems(shoppingList);
	}// end of method sortItems(ArrayList<String>)

	// DO NOT CHANGE CODE BELOW THIS COMMENT
	/**
	 * getChoice() method is an input validation routine that asks the user a
	 * question and only accepts a valid choice. If the user enters an invalid
	 * choice, the warning message will be displayed and the user will be asked
	 * to try again. Returns the validated choice.
	 */
	public static String getChoice(Scanner sIn, String question, String warning,
			String[] validMenuChoices) {
		// Initialize local variables
		String choice;
		boolean valid = false;

		// Keep asking the user for a choice until they give a valid answer (one
		// from the validMenuChoices list passed in)
		do {
			System.out.print(question);
			choice = sIn.nextLine();
			for (String s : validMenuChoices) {
				if (s.equals(choice)) {
					return choice;
				} // end of if(s.equals(choice))
			} // end of for(String s : validMenuChoices)
			System.out.println(warning);
		} while (!valid); // End of do-while (!valid)
		return "";
	}// end of method getChoice(String, String, String[])

}// end of class Lab9aStartCode
