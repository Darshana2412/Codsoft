package Darsh;
import java.util.*;
public class Grade_Calculator {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
	    int mark[] = new int[5];
	    float total = 0;
	    for (int i = 0; i < 5; i++) {
	    	System.out.println("Enter mark for subject " + (i + 1) + ":");
	        mark[i] = scanner.nextInt();
	        total = total + mark[i];
	    }
	    char grade;
	    float avg = total / 5;
	    if (avg >= 90) {
	        grade = 'A';
	    }
	    else if (avg >= 70) {
	        grade = 'B';
	    } 
	    else if (avg >= 60) {
	        grade = 'C';
	    } 
	    else if (avg >= 50) {
	        grade = 'D';
	    } 
	    else {
	        grade = 'E';
	    }
	    System.out.println("TOTAL : " + total);
	    System.out.println("AVERAGE : " + avg);
	    System.out.println("GRADE : " + grade);
	}
}
