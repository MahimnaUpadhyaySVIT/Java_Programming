/*
	Q29. Write a java program to use important methods of String class. 
*/

import java.util.*;

class q29{
	public static void main(String arg[]){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter your good name: ");
		String name = scn.next();

		System.out.println("Enter your surname: ");
		String surname = scn.next();

		System.out.println(name.concat(surname));

		String regex = "Cat|Dog|Fish";

		System.out.println("cat".matches(regex));
		System.out.println("Cat".matches(regex));

		System.out.println(name.toUpperCase());
		System.out.println(surname.toLowerCase());
	}
}
