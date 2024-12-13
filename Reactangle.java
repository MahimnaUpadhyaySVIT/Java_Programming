/* 	Q14 Create a class “Rectangle” that would contain length and width as an instance variable and
	count as a static variable.
	Define constructors [constructor overloading (default, parameterized and copy)] to
	initialize variables of objects. Define methods to find area and to display variables’value of
	objects which are created.
	[Note: define initializer block, static initializer block and the static variable and method. Also
	demonstrate the sequence of execution of initializer block and static initialize block]
*/

class Reactangle{
	
	static{
		System.out.println("Static block inside Reactangle class");
	}

	int length, width, sum;
	static int count;

	// Basic Constructor
	Reactangle(){
		length = 0;
		width = 0;
		count = 0;
		System.out.println("Basic Countructor called, count = " + count++);
	}

	// Parameterized Constructor
	Reactangle(int x, int y){
		this.length = x;
		this.width = y;
		System.out.println("Parameterized Constructor called, count = " + count++);
		area(length, width);
	}

	void area(int react_length, int react_width){
		this.length = react_length;
		this.width = react_width;
		this.sum = react_length * react_width;
		System.out.println("count = " + count++);
	}

	void display(){
		System.out.println("The area of reactangle whose length is" + " " + this.length + " " + "and width is" + " " + this.width + " " + "is" + " " +  this.sum);
		System.out.println("count = " + count++);
	}
}
