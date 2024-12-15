/*
	Q32. Write a program in Java to demonstrate throw, throws, finally, multiple try block and multiple
		 catch exception.
 */
import java.util.Scanner;

public class q32  {

    static void riskyOperation(int num) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if (num == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else if (num > 10) {
            throw new ArrayIndexOutOfBoundsException("Index exceeds the limit.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            try {
                riskyOperation(num);
                System.out.println("The number is valid.");
            } catch (ArithmeticException e) {
                System.out.println("Caught an ArithmeticException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
            }

            try {
                System.out.println("Performing division operation...");
                int result = 100 / num;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException inside second try block: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        } finally {
            System.out.println("Execution completed. Resources cleaned up.");
        }

        scanner.close();
    }
}

