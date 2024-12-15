/*
 	Q30. Write a program in Java to develop user defined exception for 'Divide by Zero' error
 */

import java.util.*;

class q30{
	public static void main(String arg[]){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a number you want to divide: ");
		int number = scn.nextInt();

		int denominator = 0;

		try{
			int sum = number / denominator;

			System.out.println("The result is " + sum);
		} catch(ArithmeticException exception){
			System.out.println("error: " + exception.getMessage());
			System.out.println("Cannot divide a value by a Zero");
		}
	}
}
