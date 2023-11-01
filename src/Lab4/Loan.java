package Lab4;
public class Loan {
    private Bank bank;

    public Loan(Bank bank) {
        this.bank = bank;
    }

    public void applyForLoan(int accountNumber, double loanAmount) {
        double accountBalance = bank.getAccountBalance(accountNumber);
        double loanLimit = accountBalance * 2;

        if (loanAmount <= loanLimit) {
            System.out.println("Loan application successful.");
        } else {
            System.out.println("Loan amount exceeds the limit.");
        }
    }

    public void approveLoan(int accountNumber, double loanAmount) {
        double accountBalance = bank.getAccountBalance(accountNumber);
        double loanLimit = accountBalance * 2;
        if (loanAmount <= loanLimit) {
            double newBalance = accountBalance + loanAmount;
            bank.deposit(accountNumber, loanAmount);
            System.out.println("Loan approved. New account balance: " + newBalance);
        } else {
            System.out.println("Loan amount exceeds the limit.");
        }
    }
}




