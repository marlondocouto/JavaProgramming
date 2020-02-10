package assigment;

import java.util.*;

public class GPACalculator {
//*******************************************************************

//GPACalculator
//
//It takes student name and scores and calculates the average GPA
//By: Marlon Do Couto
//Feb 10,2020
//*******************************************************************


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGPA();
	}
	public static void printGPA() {
		//scanner:
	    Scanner console = new Scanner(System.in);
	    System.out.print("Enter a student record: ");
	    //takes student name
	    String student = console.next();
	    //takes number of scores to be entered
	    int count_scores = console.nextInt();
	    double sum = 0.0;
	    
	    //loop to add each score to the sum:
	    for (int i = 0; i < count_scores; i++) {
	        int score = console.nextInt();
	        sum += score;
	    }
	    //calculates the average by dividing sum by number of scores:
	    double average = sum / count_scores;
	    System.out.println(student + "'s grade is " + average);
	}

}
