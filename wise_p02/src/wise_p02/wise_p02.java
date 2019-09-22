/**
 * Mitchell Wise
 * 09/21/2019
 * COP3330
 * Dr. Christopher D. Hollander
 * BMI (Body Mass index) calculator: Programming Assignment 2, problem 2.
 * This program scnans in a users height and weight, then outputs their BMI (Body Mass Index).
 */

package wise_p02;

import java.util.Scanner;

public class wise_p02 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int choice;
		float weight;
		float height;
	    float bodyMassIndex;
		
		System.out.println("***** Welcome to the BMI (Body Mass Index) Calculator! *****\n");
		System.out.println("1: BMI = (703 * weightInPounds) / (heightInInches)^2");
		System.out.println("2: BMI = (weightInKilograms) / (heightInMeters)^2\n");
		System.out.print("Which Forumala would you like to use: ");

		choice = scnr.nextInt();
		
		switch(choice)
		{
			case 1: System.out.print("\nEnter your weight (Pounds): ");
					weight = scnr.nextFloat();
					
					System.out.print("\nEnter your height (Inches): ");
					height = scnr.nextFloat();
					
					bodyMassIndex = (703 * weight) / (height * height);
					
					System.out.println("\n**********************************");
					System.out.println("\nBMI Categories:");
					System.out.println("Underweight = <18.5");
					System.out.println("Normal weight = 18.5–24.9");
					System.out.println("Overweight = 25–29.9");
					System.out.println("Obesity = BMI of 30 or greater");
					
					System.out.printf("\nYour BMI (Body Mass Index) is %.2f", bodyMassIndex);
					
					break;
					 
			case 2: System.out.print("\nEnter your weight (Kilograms): ");
					weight = scnr.nextFloat();
			
					System.out.print("\nEnter your height (Meters): ");
					height = scnr.nextFloat();
					
					bodyMassIndex = (weight) / (height * height);
					
					System.out.println("\n**********************************");
					System.out.println("\nBMI Categories:");
					System.out.println("Underweight = <18.5");
					System.out.println("Normal weight = 18.5–24.9");
					System.out.println("Overweight = 25–29.9");
					System.out.println("Obesity = BMI of 30 or greater");

					
					System.out.printf("\nYour BMI (Body Mass Index) is %.2f", bodyMassIndex);
			
					break;
			
			default: System.out.println("Sorry, invalid choice.");
		}
						
	}
			
}


