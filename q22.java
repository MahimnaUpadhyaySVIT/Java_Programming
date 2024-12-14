/*
	Q22. Write a program in Java in which a subclass constructor invokes the constructor of the
 		 super class and instantiate the values. [ refer class Account and sub classes
		 savingAccount andCurrentAccount in Q 19 for this task]
*/

class A{
	static int x = 5;
}

class B{
	int x = 10;
	
	void display(){
		System.out.println("Static variable of Parent Class: " + A.x);
		System.out.println("Normal Instance variable of Child Class: " + x); 
	}
}
