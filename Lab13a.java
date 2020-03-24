/*
Program/Project: Lab13a
Your Name: 
Date: 
Instructor: 
Description: 
*/
package week13;

import java.io.*;
import java.util.*;

public class Lab13a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("Student Assignment Scores1.csv"), simpleLetter = new File ("Warning Letter to Student - .txt");
		PrintWriter fileSaver = null;
		Scanner reader = null;
		String letterBody = null;
		System.out.println("Creating letters for: ");
		
		try {
			Scanner read = new Scanner(simpleLetter);
			read.useDelimiter("\\Z"); 
			letterBody = read.next(); 
			reader = new Scanner(myObj);
		} catch (Exception e) {
			e.printStackTrace();
		} while (reader.hasNextLine()) {
				String[] students = reader.nextLine().split(",");
				for (int i = 1; i < students.length; i++) {
					if (students[i].equals("0")) {
						System.out.println(students[0]);
						try {
							String fileName = "Warning Letter to Student - " + students[0] + ".txt"; 
							fileSaver = new PrintWriter(fileName);
							fileSaver.println("Dear " + students[0] + ", \n" + letterBody + "\n");
							for (int j = 1; j<students.length; j++) {
								if(students[j].equals("0"))
									fileSaver.println("Assignment " + j);
							}fileSaver.close();
						} catch (Exception e){
							e.printStackTrace();
					} break;
				}
			}
		} 
	}
}
			
