/*Program/Project: Lab8b
Name: Date: 
Instructor: 
Name: Description: 
		This program will ask the user to enter a series of numbers.
		The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.
		The program will then display the array of numbers and the sum total of those numbers.
*/
package week8;
import java.util.*;

public class Lab8b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "", ynCheck = "y",
				validQ = "Do you wish to play again(Y/N)?",
				errorMsg = "Invalid response. Please enter either a 'Y' or 'N'.\n";
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		do { // main program loop
			while (true) {// get numbers from user or enter key
				System.out.print(
						"Please enter a number (or just hit enter to finish):");
				answer = input.nextLine();

				if (answer.isEmpty())
					break;

				try {
					numbers.add(Integer.parseInt(answer));
				} catch (Exception e) {
					System.out.println(
							"Invalid response. Please enter a valid whole number.\n");
				}
			}
			// printing stuff to user
			System.out.println("Array Index\tItem");
			for (int i = 0; i < numbers.size(); i++) {
				System.out.println(i + "\t" + numbers.get(i));
			}
			// print number of elements and sum
			System.out.println(
					"There are " + numbers.size() + " items in the ArrayList.");
			System.out.println("The sum total of numbers in the ArrayList is "
					+ sumValues(numbers) + ".\n");
			if (!printRepeated(numbers).isEmpty()) {
				System.out.println(
						"The following numbers were duplicated in the ArrayList: "
								+ printRepeated(numbers));
			} else {
				System.out.println(
						"This ArrayList does not contain repeated elements.");
			}
			numbers.clear();
			ynCheck = week7.Lab7i.getValidYN(validQ, errorMsg);
		} while (ynCheck.equalsIgnoreCase("y"));

	}// end of main

	public static int sumValues(ArrayList<Integer> a) { // method to calculate
														// sum of ArrayList
														// elements
		int sum = 0;
		for (int d : a)
			sum += d;
		return sum;
	}// end of sumValues

	public static ArrayList<Integer> printRepeated(ArrayList<Integer> a) {
		ArrayList<Integer> rep = new ArrayList<Integer>();
		for (Integer i : a) {
			if ((a.indexOf(i) != a.lastIndexOf(i)) && (!rep.contains(i)))
				rep.add(i);
		}
		return rep;
	}
}
