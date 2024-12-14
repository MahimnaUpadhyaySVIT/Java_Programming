import java.util.*;

class q23Creator{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Triangle Length, Triangle Height and Triangle Base for a triangle: ");
		int TriangleLength = scn.nextInt();
		int TriangleBase = scn.nextInt();
		int TriangleHeight = scn.nextInt();

		System.out.println("Enter Reactangle Length and Reactangle Width for a reactangle: ");
		int ReactangleLength = scn.nextInt();
		int ReactangleWidth = scn.nextInt();

		System.out.println("Enter Circle Radius: ");
		double CircleRadius = scn.nextDouble();

		Triangle triangle_obj = new Triangle(TriangleLength, TriangleBase, TriangleHeight);
		Reactangle reactangle_obj = new Reactangle(ReactangleLength, ReactangleWidth);
		Circle circle_obj = new Circle(CircleRadius);

		triangle_obj.area();
		reactangle_obj.area();
		circle_obj.area();
	}
}
