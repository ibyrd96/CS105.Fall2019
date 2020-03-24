/*
Program/Project: Lab12a
Your Name: 
Date: Instructor: 
Description: */
package week12;
import java.io.*;
import java.util.*;

public class Lab12a {

	public static void main(String[] args) {

		File myObj = new File("Pwd.txt");
		PrintWriter valid = null, invalid = null;

		try {
			valid = new PrintWriter("validpwd.txt");
			invalid = new PrintWriter("invalidpwd.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Scanner reader = new Scanner(myObj);

			while (reader.hasNextLine()) {
				String info = reader.nextLine();
				if (info.length() < 8) {
					invalid.println(info
							+ " Error! Password must contain at least eight characters.");
					
				} else if (!hasUpper(info)) {
					invalid.println(info
							+ " Error! Password must contain at least one upper case character.");
					
				} else if (!hasLower(info)) {
					invalid.println(info
							+ " Error! Password must contain at least one lower case character.");
				
				} else if (!hasNumber(info)) {
					invalid.println(info
							+ " Error! Password must contain at least one number character.");
				
				} else if (!hasSpecial(info)) {
					invalid.println(info
							+ " Error! Password must contain at least one of the following characters: @,#,%,^,&.");
				
				} else {
					valid.println(info);
				}
			}

			reader.close();
			valid.close();
			invalid.close();
		} catch (Exception e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
		System.out.println("Beginning password analysis...");
		System.out.println("Opening file 'pwd.txt'");
		System.out.println("Analysis complete. Closing files.");
		System.out.println(
				"Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the C:\\MyLDSBC\\CS105\\eclipse-workspace\\CD105\\ directory.");

	}

	public static boolean hasUpper(String test) {
		return !test.equals(test.toLowerCase());
	}

	public static boolean hasLower(String test) {
		return !test.equals(test.toUpperCase());
	}

	public static boolean hasNumber(String test) {
		return !test.matches("[A-Za-z ]*");
	}

	public static boolean hasSpecial(String test) {
		String testC = "@#%^&*";
		String[] ch = test.split("(?!^)");
		for (String i : ch) {
			if (testC.contains(i)) return true;
		}
		return false;
	}

}
