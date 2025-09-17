/*Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder. */
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + getBalance());
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount("101", "Pabitra", 50000);
        b.setBalance(55000);
        System.out.println("Updated Balance: " + b.getBalance());
        System.out.println();
        SavingsAccount s=new SavingsAccount("202", "Ram", 60000);
        s.display();
    }
}
