import java.util.Scanner;

public class ATMfunctions {

    static final int max_transaction = 100;
    static final int max_withdrawal = 20_000;
    static final int withdrawal_charges = 100;

    public static void main(String args[]) {

        int transactionCount = 0;

        Scanner input = new Scanner(System.in);
        String[] transactions = new String[max_transaction];

        System.out.println("enter your first deposit");
        int balance = input.nextInt();

        int choice;

        do {

            System.out.println("""
                    1. Withdraw
                    2. Daily Transactions
                    3. Exit
                    Enter your choice:
                    """);

            choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("kindly enter amount to withdraw: ");
                    int amount = input.nextInt();

                    if (amount < 0) {
                        System.out.println("Amount is invalid");
                    } else if (amount % 500 != 0) {
                        System.out.println("Amount can only be in 500 multiples");
                    } else if (amount > balance * 0.9) {
                        System.out.println("sorry, you can only withdraw less than 90% of your total balance");
                    } else if (balance - amount - withdrawal_charges < 100) {
                        System.out.println("sorry, your total balance can't be less than 100 dollars");
                    } else {
                        balance -= (amount + withdrawal_charges);
                        System.out.println("you have withdrawn successfully");
                        System.out.println("Withdrawal amount: " + amount + " dollars");
                        System.out.println("Withdrawal charges: " + withdrawal_charges + " dollars");

                        if (transactionCount < max_transaction) {
                            transactions[transactionCount] = "Withdrawn: " + amount +
                                    ", Fee: " + withdrawal_charges +
                                    ", Balance: " + balance;
                            transactionCount++;
                        }

                    }
		    case 2:
                    System.out.println("Transactions:");
                    if (transactionCount == 0) {
                        System.out.println("No transaction has been initialized");
                    } else {
                        for (int count = 0; count < transactionCount; count++) {
                            System.out.println((count + 1) + ". " + transactions[count]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Bye, Thank you for withdrawing");
                    break;

                default:
                    System.out.println("not available");
                    break;
            }

        } while (choice != 3);
    }
}




















	