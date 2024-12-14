import java.util.*;

class q18Creator{
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Vehicle Type: ");
		String vehicle_type = scn.next();

		System.out.println("Enter Vehicle Model Type: ");
		String model_type = scn.next();

		System.out.println("Enter Company Name: ");
		String company_name = scn.next();
	
		Car obj = new Car();
		
		obj.setValues(model_type, company_name, vehicle_type);
		obj.display();
		obj.display();
	}
}
