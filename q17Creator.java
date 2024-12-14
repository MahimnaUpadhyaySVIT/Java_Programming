import java.util.*;

class q17Creator{
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter radius of a circle: ");
		double radius = scn.nextDouble();

		q17 obj_one = new q17();
		q17 obj_two = new q17();

		obj_one.setValue(radius);
	}
}
