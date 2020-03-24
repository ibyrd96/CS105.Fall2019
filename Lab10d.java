/*
Program/Project: Lab10d
Your Name: 
Date: 
Instructor: 
Description: 
*/
package week10;
import java.util.*;
import java.io.*;

public class Lab10d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("Student Test Grades.csv");
		ArrayList<String[]> list = new ArrayList<String[]>();
		try {
			Scanner reader = new Scanner(myObj);
			String[] title = reader.nextLine().split(",");
			System.out.printf("%-15s\t", title[0]);
			for(int i = 1; i < title.length; i++)
				System.out.printf("%s\t", title[i]);
			System.out.println("\n-----------------------------------------");
			while (reader.hasNextLine()) {
				String[] insideList =reader.nextLine().split(",");
				list.add(insideList);
			} reader.close();
		} catch (Exception e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
		for(int i = 0; i < list.size(); i++) {
			String[] student = list.get(i);
			System.out.printf("%-15s\t", student[0]);
			for (int j = 1;j<4;j++) {
				String result = "";
				if (Integer.parseInt(student[j])>94) result ="A";
				else if (Integer.parseInt(student[j])>90) result ="A-";
				else if (Integer.parseInt(student[j])>87) result ="B+";
				else if (Integer.parseInt(student[j])>84) result ="B";
				else if (Integer.parseInt(student[j])>80) result ="B-";
				else if (Integer.parseInt(student[j])>77) result ="C+";
				else if (Integer.parseInt(student[j])>74) result ="C";
				else if (Integer.parseInt(student[j])>70) result ="C-";
				else if (Integer.parseInt(student[j])>67) result ="D+";
				else if (Integer.parseInt(student[j])>64) result ="D";
				else if (Integer.parseInt(student[j])>60) result ="D-";
				else result ="E";
				System.out.printf("%s\t", result);
			}System.out.println();
		}
	}
}