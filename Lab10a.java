/*
Program/Project: Lab10a
Your Name: 
Date:
Instructor: 
Description: 
*/
package week10;
import java.util.*;
import java.io.*;

public class Lab10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("Student Assignment Scores.csv");
		
		try {
			Scanner reader = new Scanner(myObj);
			while (reader.hasNextLine()) {
				String info = reader.nextLine();
				System.out.println(info);
			} reader.close();
		} catch (Exception e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
	}

}
