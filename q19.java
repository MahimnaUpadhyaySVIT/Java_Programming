/*
	Q19. Create a class “Account” containing accountNo, and balance as an instance variable. Derive
		 the Account class into two classes named “Savings” and “Current”. The “Savings” class
	 	 should contain instance variable named interestRate, and the “Current”class should contain
		 instance variable called overdraftLimit. Define appropriatemethods for all the classes to
		 enable functionalities to check balance, deposit, and withdraw amount in Savings and
		 Current account. [Ensure that the Account class cannot be instantiated.] 

	Q20. Write a program in Java in which a subclass constructor invokes the constructor of the
		 super class and instantiate the values. [ refer class Account and sub classes
		 savingAccount andCurrentAccount in Q 19 for this task]
*/

abstract class Account { 
    int accountNo, balance;

    Account() {
		checkBalance();
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

class AccountInfo extends Account{
	AccountInfo(int x, int y){
		super();
		accountNo = x;
		balance = y;
	}
}
