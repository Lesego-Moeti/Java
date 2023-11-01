package Lab4;

public class BankSimulation {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Loan loan = new Loan(bank);

        // Create bank accounts
        bank.createAccount("John", 1000.0);
        bank.createAccount("Jane", 2000.0);

        // Perform transactions
        bank.withdraw(1, 500.0);
        bank.deposit(2, 1000.0);
        loan.applyForLoan(1, 3000.0);
        loan.approveLoan(2, 1500.0);

        // Display results
        System.out.println("John's account balance: " + bank.getAccountBalance(1));
        System.out.println("Jane's account balance: " + bank.getAccountBalance(2));
    }
}







