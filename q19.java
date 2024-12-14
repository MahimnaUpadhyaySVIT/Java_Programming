/*
	Q19. Create a class “Account” containing accountNo, and balance as an instance variable. Derive
		 the Account class into two classes named “Savings” and “Current”. The “Savings” class
	 	 should contain instance variable named interestRate, and the “Current”class should contain
		 instance variable called overdraftLimit. Define appropriatemethods for all the classes to
		 enable functionalities to check balance, deposit, and withdraw amount in Savings and
		 Current account. [Ensure that the Account class cannot be instantiated.] 
*/

abstract class Account { 
    int accountNo;
    int balance;

    Account() {
        accountNo = 0;
        balance = 0;
    }

    void checkBalance() {
        System.out.println("Account No: " + accountNo + " | Balance: " + balance);
    }
}

class Savings extends Account {
    double interestRate;

    Savings() {
        interestRate = 0.0;
    }

    void setValues(int account, double interest, int amount) {
        accountNo = account;
        balance = amount;
        interestRate = interest;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }
}

class Current extends Account {
    int overdraftLimit;

    Current() {
        overdraftLimit = 0;
    }

    void setValues(int account, int limit, int amount) {
        accountNo = account;
        balance = amount;
        overdraftLimit = limit;
    }

    void withdraw(int amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal exceeds overdraft limit.");
        } else {
            balance -= amount;
            System.out.println("Current Balance: " + balance);
        }
    }
}

