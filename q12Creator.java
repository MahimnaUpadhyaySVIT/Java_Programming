import java.util.*;

class q12Creator{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter student id: ");
		int sid = scn.nextInt();

		System.out.print("Enter student name: ");
		String sname = scn.next();

		System.out.print("Enter student gender: ");
		String sgender = scn.next();

		System.out.print("Enter student total marks: ");
		int totalMarks = scn.nextInt();

		q12 student_obj = new q12(sid, sname, sgender, totalMarks);
		student_obj.display();
	}
}
