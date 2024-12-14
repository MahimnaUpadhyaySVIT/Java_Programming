import java.util.Scanner;

class q19Creator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Savings savingsObj = new Savings();
        Current currentObj = new Current();

        System.out.println("Enter your bank account no: ");
        int accountNo = scn.nextInt();

        System.out.println("Enter your balance: ");
        int balanceAmount = scn.nextInt();

        System.out.println("Enter your account type: [1] Savings \n[2] Current");
        int accountType = scn.nextInt();

        switch (accountType) {
            case 1:
                System.out.println("What was the Rate of Interest?");
                double rateOfInterest = scn.nextDouble();

                savingsObj.setValues(accountNo, rateOfInterest, balanceAmount);

                System.out.println("Want to deposit money? [1] Yes \n[2] No");
                int yesOrNo = scn.nextInt();

                if (yesOrNo == 1) {
                    System.out.println("Enter amount you want to deposit: ");
                    int amount = scn.nextInt();

                    savingsObj.deposit(amount);
                } else {
                    System.out.println("Okay, Have a nice day.");
                }

                break;

            case 2:
                System.out.println("What was the overdraft limit?");
                int amountLimit = scn.nextInt();

                currentObj.setValues(accountNo, amountLimit, balanceAmount);

                System.out.println("Want to withdraw money? [1] Yes \n[2] No");
                int trueOrFalse = scn.nextInt();

                if (trueOrFalse == 1) {
                    System.out.println("Enter withdraw amount: ");
                    int withdrawAmt = scn.nextInt();
                    currentObj.withdraw(withdrawAmt);
                } else {
                    System.out.println("Okay, Have a nice day.");
                }

                break;

            default:
                System.out.println("Enter a valid option");
        }
    }
}
