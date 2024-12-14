/*
 	Q18. Create a class “Vehicle” with instance variable vehicle_type. Inherit the class in a class called
		 “Car” with instance model_type, company name etc. display the information of the vehicle
		 by defining the display() in both super and sub class [Method Overriding]
*/

class q18{

	String vehicle_type;

	q18(){
		vehicle_type = "";
	}

	void display(){
		System.out.println("Vehicle Type: "+vehicle_type);
	}
}

class Car extends q18{
	
	String model_type, company_name;

	// Default constructor
	Car(){
		model_type = "";
		company_name = "";
	}

	// Method to set values
	void setValues(String mType, String cName, String vType){
		vehicle_type = vType;
		model_type = mType;
		company_name = cName;
	}

	void display(){
		System.out.println("Vehicle Type: " + vehicle_type + " Model Type: " + model_type + " Company name: " + company_name);
	}

}
