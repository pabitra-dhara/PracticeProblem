/*Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
 */
class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }

    public void displayAccountType() {
        displayDetails();
        System.out.println("Interest Rate: "+interestRate+"%");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    public CheckingAccount(int accountNumber,double balance,int withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    public void displayAccountType(){
        displayDetails();
        System.out.println("Withdrawal Limit: "+withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositPeriod;

    public FixedDepositAccount(int accountNumber, double balance, int depositPeriod) {
        super(accountNumber,balance);
        this.depositPeriod=depositPeriod;
    }

    public void displayAccountType(){
        displayDetails();
        System.out.println("Deposit Period: "+depositPeriod +" months");
    }
}
public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(1234, 5000.0, 4.5);
        CheckingAccount ca=new CheckingAccount(1235, 2000.0, 10000);
        FixedDepositAccount fda=new FixedDepositAccount(1236, 100000.0, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
