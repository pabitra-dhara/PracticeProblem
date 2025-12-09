/*Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank. */

import java.util.*;

class Account {
    int accNo;
    double balance;
    Bank bank;
    Account(int accNo, Bank bank) {
        this.accNo = accNo;
        this.bank = bank;
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account a : accounts) {
            System.out.println("Acc No: " + a.accNo + ", Bank: " + a.bank.name + ", Bal: " + a.balance);
        }
        System.out.println();
    }
}

class Bank {
    String name;
    int accCounter = 1000;
    Bank(String name) {
        this.name = name;
    }
    Account openAccount(Customer c) {
        accCounter++;
        Account a = new Account(accCounter, this);
        c.accounts.add(a);
        return a;
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {

        Bank b1 = new Bank("SBI");
        Customer c1 = new Customer("Pabitra");

        Account a1 = b1.openAccount(c1);
        a1.balance = 5000;

        c1.viewBalance();
    }
}
