import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the account number:");
        int accountNumber = input.nextInt();

        System.out.println("Enter the account name:");
        String accountName = input.next();

        BankAccount account = new BankAccount(accountNumber, accountName);

        int choice;

        do {
            System.out.println("\nBank Account Menu");
            System.out.println("-------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Interest");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount); // withdraw already prints success/failure
                    break;

                case 3: // Check Interest
                    System.out.println("Interest: $" + account.calculateInterest());
                    break;

                case 4: // Check Balance
                    System.out.println("Current balance: $" + account.getBalance());
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while(choice != 5);

        input.close();
    }
}
