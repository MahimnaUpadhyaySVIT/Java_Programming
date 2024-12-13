import java.util.*;

class ReactangleCreator{

	static {
		System.out.println("This is a static block inside a MAIN class i.e. ReactangleCreator");
	}

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter length of a reactangle: ");
		int length = scn.nextInt();

		System.out.println("Enter width of a reactangle: ");
		int width = scn.nextInt();

		Reactangle reactangle_obj1 = new Reactangle();
		Reactangle reactangle_obj2 = new Reactangle(length, width);

		System.out.println("Reactangle_obj1 is called to for area method");
		reactangle_obj1.area(length, width);

		System.out.println("Reactangle_obj2 is called to display the values");
		reactangle_obj2.display();
	}
}
