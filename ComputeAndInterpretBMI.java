// Group 21
// Cevon, Rafi, Muhammed, Issac
// Intro to Programming

import java.util.Scanner;  //import the scanner utility

public class ComputeAndInterpretBMI {
	static double pounds;  //declare pounds is a double value
	static double inches;  //declare inches is a double value
	static double BMI;     //declare BMI is a double value
	
	static Scanner scan = new Scanner(System.in);  //create a scanner object

	public static void main(String[] args) {  //main method
		
		System.out.println("Enter weigth in pounds:");
	    double pounds = scan.nextDouble();  //read user input
	    
		System.out.println("Enter height in inches:");
		double inches = scan.nextDouble();  //read user input
		
		double BMI = pounds * 0.45359237 / (inches * 0.0254 * inches * 0.0254);  //BMI formula
		System.out.println("Body Mass Index is " + BMI);
		
		if(BMI<18.5) { //if statement 
			System.out.println("Underweight");
		}
		else  
			if(BMI< 25.0) {  //nested if statement
			System.out.println("Normal");
		}
		else 
			if(BMI<30.0) {  //nested if statement
			System.out.println("Overweight");
		}
		else System.out.println("Obese");  //else statement
	}

}
