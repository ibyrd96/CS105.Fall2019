/*
Program/Project: Lab10b
Your Name: 
Date: 
Instructor:
Description: 
*/
package week10;
import java.util.*;
import java.io.*;

public class Lab10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("Student Assignment Scores.csv");
		
		try {
			Scanner reader = new Scanner(myObj);
			String[] title = reader.nextLine().split(",");
			System.out.printf("%-20s\t", title[0]);
			for(int i = 1; i < title.length; i++)
				System.out.printf("%s%s\t","Asn ", i);
			System.out.println("\n-------------------------------------------------------------------------------------");
			while (reader.hasNextLine()) {
				String[] info = reader.nextLine().split(",");
				System.out.printf("%-20s\t", info[0]);
				for (int i = 1; i < info.length; i++)
					System.out.printf("%s\t", info[i]);
					System.out.println();
			} reader.close();
		} catch (Exception e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
	}
}