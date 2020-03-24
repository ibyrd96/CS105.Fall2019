/*
Program/Project: Lab10c
Your Name: 
Date: 
Instructor: 
Description: 
*/
package week10;
import java.util.*;
import java.io.*;

public class Lab10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("Student Assignment Scores.csv");
		
		try {
			Scanner reader = new Scanner(myObj);
			String[] title = reader.nextLine().split(",");
			System.out.printf("%-15s\t%s", title[0], "Assignment with 0");
			System.out.println("\n-----------------------------------------");
			while (reader.hasNextLine()) {
				String[] info = reader.nextLine().split(",");
				for (int i = 1; i < info.length; i++)
					if (info[i].equals("0")) {
						System.out.printf("%-20s\t", info[0]);
						System.out.printf("%s\t\n", i);
					}
			} reader.close();
		} catch (Exception e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
	}
}