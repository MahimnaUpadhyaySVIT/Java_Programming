/* 	Q13. Create a class “Rectangle” that would contain length and width as an instance variable and
		 count as a static variable.
		 Define constructors [constructor overloading (default, parameterized and copy)] to
		 initialize variables of objects. Define methods to find area and to display variables’value of
		 objects which are created.
		 [Note: define initializer block, static initializer block and the static variable and method. Also
		 demonstrate the sequence of execution of initializer block and static initialize block]

	Q15. Write a java program static block which will be executed before main ( ) method in a
		 Class.
*/

class q14{
	
	static{
		System.out.println("Static block inside Reactangle class");
	}

	int length, width, sum;
	static int count;

	// default Constructor
	q14(){
		length = 0;
		width = 0;
		count = 0;
		System.out.println("default Countructor called, count = " + count++);
		staticMethod();
	}

	// Parameterized Constructor
	q14(int x, int y){
		length = x;
		width = y;
		System.out.println("Parameterized Constructor called, count = " + count++);
		area(length, width);
	}

	void area(int react_length, int react_width){
		length = react_length;
		width = react_width;
		sum = react_length * react_width;
		System.out.println("count = " + count++);
	}

	void display(){
		System.out.println("The area of reactangle whose length is" + " " + length + " " + "and width is" + " " + width + " " + "is" + " " + sum);
		System.out.println("count = " + count++);
	}

	static void staticMethod(){
		System.out.println("This is a static method");
	}
	
}
