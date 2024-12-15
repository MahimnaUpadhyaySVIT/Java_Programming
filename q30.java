/*
	Q30. Write a program in Java to demonstrate use of final class, final variable and final method 
*/

import java.util.*;

final class test{
	final String name;

	test(String n){
		name = n;
	}

	final void display(){
		System.out.println("Your good name is: " + name);
	}
}

class q30{
	public static void main(String arg[]){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter your good name: ");
		String name = scn.next();

		test obj = new test(name);
		obj.display();
	}
}

