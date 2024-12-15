/*
 	Q33. Write a small application in Java to develop Banking Application in which user deposits the
		 amount Rs 1000.00 and then start withdrawing of Rs 400.00, Rs 300.00 and it throws
		 exception "Not Sufficient Fund" when user withdraws Rs. 500 thereafter.
 */

import java.util.Scanner;

public class q33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;

        System.out.println("Initial Balance: Rs." + balance);

        System.out.println("Withdrawing Rs. 400.00");
        balance = withdraw(balance, 400.00);
        System.out.println("Current Balance: Rs." + balance);

        System.out.println("Withdrawing Rs. 300.00");
        balance = withdraw(balance, 300.00);
        System.out.println("Current Balance: Rs." + balance);

        System.out.println("Withdrawing Rs. 500.00");
        try {
            balance = withdraw(balance, 500.00);
            System.out.println("Current Balance: Rs." + balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static double withdraw(double balance, double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Not Sufficient Funds");
        }
        return balance - amount;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
