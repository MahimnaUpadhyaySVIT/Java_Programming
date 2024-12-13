import java.util.*;

class studentCreator{
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

		student student_obj = new student(sid, sname, sgender, totalMarks);
		student_obj.display();
	}
}
