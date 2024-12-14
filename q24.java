/*
	Q24. Write a java program to implement an interface called Exam with a method Pass (int mark)
		 that returns a boolean. Write another interface called Classify with a method Division (int
		 average) which returns a String. Write a class called Result which implements both Exam and
		 Classify. The Pass method should return "true" if the mark is greater than or equal to 50 else
		 "false". The Division method must return “First” when the parameter average is 60 or more, “Second” 
		 when average is 50 or more but below 60, “No division” when average is less than 50.
*/

interface Exam{
	void Pass(int mark);
}

interface Classify{
	void Division(int average);
}

class Result implements Exam, Classify{
	int marks;
	
	Result(int x){
		marks = x;
	}
		
	public void Pass(int mark){
		marks = mark;

		if(marks>=50){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public void Division(int average){
		average = marks;

		if(average>= 60){
			System.out.println("First");
		} else if(average>=50 && average<=59){
			System.out.println("Second");
		} else{
			System.out.println("No division");
		}
	}
}
