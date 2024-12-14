/*
	Q17. Write a class “circle” with radius as data member and count the number of instances
		 created using default constructor only. 
*/

class q17{

	double radius;
	static int count=0;

	// Default constructor
	q17(){
		radius = 0;
		System.out.println("Instance count = " + " " + count++);
	}

	void setValue(double x){
		radius = x;
	}
}
