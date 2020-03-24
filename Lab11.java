/*
Program/Project: Lab11
Your Name: 
Date:
Instructor: 
Description: 
*/
package week11;
import java.util.*;

public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String number = "Hello";
		while (!number.equals("")) {
			System.out.println(
					"This program will show the name of an apostle based on the order they were called with President Nelson as #1\n");
			System.out.println("Enter a number between 1 and 15 to display the corresponding Apostle or press 'Enter' to quit.");
			number = input.nextLine();
			switch (number) {
			case "1":
				System.out.println("Number " + number + " is: Russell M Nelson");
				break;
			case "2":
				System.out.println("Number " + number + " is: Dallin H. Oaks");
				break;
			case "3":
				System.out.println("Number " + number + " is: M Russell Ballard");
				break;
			case "4":
				System.out.println("Number " + number + " is: Jeffry Ligh...er...Jeffrey R. Holland");
				break;
			case "5":
				System.out.println("Number " + number + " is: Henry B. Eyring");
				break;
			case "6":
				System.out.println("Number " + number + " is: Dieter F. Uchtdorf");
				break;
			case "7":
				System.out.println("Number " + number + " is: David A. Bednar");
				break;
			case "8":
				System.out.println("Number " + number + " is: Quentin L. Cook");
				break;
			case "9":
				System.out.println("Number " + number + " is: D. Todd Chritofferson");
				break;
			case "10":
				System.out.println("Number " + number + " is: Neil L. Anderson");
				break;
			case "11":
				System.out.println("Number " + number + " is: Ronald A. Rasband");
				break;
			case "12":
				System.out.println("Number " + number + " is: Gary E. Stevenson");
				break;
			case "13":
				System.out.println("Number " + number + " is: Dale G. Renlund");
				break;
			case "14":
				System.out.println("Number " + number + " is: Gerrit W. Gong");
				break;
			case "15":
				System.out.println("Number " + number + " is: Ulisses Soares");
				break;
			case "":
				break;
			default:
				System.out.println("That's not a valid choice. Try again.");
				break;
			} 
		}
	}

}
