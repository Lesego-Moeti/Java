package Lab4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    private Map<Integer, BankAccount> accounts;
    private int nextAccountNumber;

    public Bank() {
        accounts = new HashMap<>();
        nextAccountNumber = 1;
    }

    public void createAccount(String name, double initialBalance) {
        BankAccount account = new BankAccount(name, initialBalance);
        accounts.put(nextAccountNumber, account);
        nextAccountNumber++;
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    public void deposit(int accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public double getAccountBalance(int accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found.");
            return 0.0;
        }
    }

    private class BankAccount {
        private String name;
        private double balance;

        public BankAccount(String name, double initialBalance) {
            this.name = name;
            this.balance = initialBalance;
        }
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Current balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        }
        public double getBalance() {
            return balance;
        }
    }
}


