import java.util.*;

class q14Creator{

	static {
		System.out.println("This is a static block inside a MAIN class i.e. ReactangleCreator");
	}

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter length of a reactangle: ");
		int length = scn.nextInt();

		System.out.println("Enter width of a reactangle: ");
		int width = scn.nextInt();

		q14 reactangle_obj1 = new q14();
		q14 reactangle_obj2 = new q14(length, width);

		System.out.println("Reactangle_obj1 is called for area method");
		reactangle_obj1.area(length, width);

		System.out.println("Reactangle_obj2 is called for display method");
		reactangle_obj2.display();
	}
}
