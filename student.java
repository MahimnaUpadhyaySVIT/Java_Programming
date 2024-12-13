import java.util.*;

class student{
	
	int enrollment_no;
	int marks;
	String name, gender;
	static int count=0;

	Scanner scn = new Scanner(System.in);

	student(int s_id, String s_name, String s_gender, int s_marks){
		enrollment_no = s_id;
		name = s_name;
		gender = s_gender;
		marks = s_marks;
		System.out.println("The count: "+" "+count++);
	}

	void display(){
		System.out.println("The student information is:");
		System.out.print(enrollment_no + " " + name + " " + gender + " "+ marks + " " + "The count: " + " " + count++);
	}
}
