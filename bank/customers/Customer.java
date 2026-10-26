package bank.customers;

public class Customer {
    int customerId;
    String customerName, contactNumber;

    public Customer(int id, String name, String contact) {
        customerId = id;
        customerName = name;
        contactNumber = contact;
    }

    public void display() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Contact: " + contactNumber);
    }
}
package bank.loans;

public class Loan {
    String loanNumber, loanType;
    double loanAmount;

    public Loan(String no, String type, double amount) {
        loanNumber = no;
        loanType = type;
        loanAmount = amount;
    }

    public void display() {
        System.out.println("Loan Number: " + loanNumber);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: " + loanAmount);
    }
}
package bank.accounts;

public class Account {
    String accountNumber, accountType;
    double balance;

    public Account(String no, String type, double bal) {
        accountNumber = no;
        accountType = type;
        balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid withdrawal amount");
        else if (amount > balance)
            System.out.println("Insufficient Balance");
        else
            balance -= amount;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
import bank.customers.Customer;
import bank.loans.Loan;
import bank.accounts.Account;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(101, "Rahul", "9876543210");
        Loan l = new Loan("L201", "Home Loan", 500000);
        Account a = new Account("A301", "Savings", 20000);

        c.display();
        l.display();

        a.deposit(10000);
        a.withdraw(5000);
        a.displayBalance();
    }
}
