/* 
	Q16. Write programs in Java to use Wrapper class of each primitive data types. 
*/

import java.util.*;

class q16{
	public static void main(String[] args){
	
		Scanner scn = new Scanner(System.in);

		System.out.println("AUTOBOXING WRAPPING: ");
		
		System.out.println("Enter a number: ");
		int number = scn.nextInt();

		System.out.println("Enter a decimal number: ");
		double decimal_number = scn.nextDouble();

		System.out.println("Enter a character: ");
		char character = scn.next().charAt(0);

		System.out.println("True of False?: ");
		boolean true_false = scn.nextBoolean();

		
		Integer num = number;
		Double decimal_num = decimal_number;
		Character letter = character;
		Boolean TrueFalse = true_false;

		System.out.println(num + " " + decimal_num + " " + letter + " " + TrueFalse);

		System.out.println("UNBOXING WRAPPING: ");

		number = num;
		decimal_number = decimal_num;
		character = letter;
		true_false = TrueFalse;

		System.out.println(number + " " + decimal_number + " " + character + " " + true_false);
	}
}
