public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    private final double interestRate = 0.0375;

    // Correct constructor
    public BankAccount(int accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.00;
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Deposit amount must be greater than $0.");
        } else {
            this.balance += amount;
            System.out.println("Successfully Deposited $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully Withdrawn: $" + amount);
        }
    }

    public double calculateInterest(){
        return balance * interestRate;
    }

    public double getBalance(){
        return balance;
    }
}
