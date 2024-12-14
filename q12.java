/*
	Q12. Create a class “Student” that would contain enrollment No, name, and gender andmarks as
		 instance variables and count as static variable which stores the count of the objects;
		 constructors and display(). Implement constructors to initialize instance variables. Also
		 demonstrate constructor chaining. Create objects of class “Student” and displays all values of
		 objects.

	Q13. Write a program in Java to demonstrate use of this keyword. Check whether this can
		 access the Static variables of the class or not. [Refer class student in Q12 to perform the task]
*/ 

import java.util.*;

class q12{
	
	int enrollment_no;
	int marks;
	String name, gender;
	static int count=0;

	Scanner scn = new Scanner(System.in);

	q12(int s_id, String s_name, String s_gender, int s_marks){
		enrollment_no = s_id;
		name = s_name;
		gender = s_gender;
		marks = s_marks;
		System.out.println("Using 'this' keyword to access Static variable count: " + " " + this.count);
		System.out.println("The count: "+" " + count++);
	}

	void display(){
		System.out.println("The student information is:");
		System.out.print(enrollment_no + " " + name + " " + gender + " "+ marks + " " + "The count: " + " " + count++);
	}
}
