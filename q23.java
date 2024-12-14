/*
	Q23. Describe  class called Shape which has three subclasses say Triangle, Rectangle,
		 and Circle. Define one method area () in the  class and override this area () in these
		 three subclasses to calculate for specific object i.e. area () of Triangle subclass should
		 calculate area of triangle etc. Same for Rectangle and Circle 
*/

 abstract class shape{
	void area(){
		System.out.println("Area method inside Parent class");	
	}
}

 class Triangle extends shape{
	int length, base, height;

	Triangle(int x, int y, int z){
		length = x;
		base = y;
		height = z;
	}

	void area(){
		int area = length * base * height;

		System.out.println("Area of a triangle is: " + area);
	}
}

 class Reactangle extends shape{
	int length , width;

	Reactangle(int x, int y){
		length = x;
		width = y;
	}

	void area(){
		int area = length * width;

		System.out.println("Area of a reactangle is: " + area);
	}
}

class Circle extends shape{
	double radius;

	Circle(double x){
		radius = x;
	}

	void area(){
		double area = (3.14 * radius * radius);

		System.out.println("Area of a circle is: " + area); 
	}

}
