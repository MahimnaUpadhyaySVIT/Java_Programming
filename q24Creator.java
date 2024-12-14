import java.util.*;

class q24Creator{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter students_marks: ");
		int marks = scn.nextInt();

		Exam examObj = new Result(marks);
		Classify classifyObj = new Result(marks);

		examObj.Pass(marks);
		classifyObj.Division(marks);
	}
}
