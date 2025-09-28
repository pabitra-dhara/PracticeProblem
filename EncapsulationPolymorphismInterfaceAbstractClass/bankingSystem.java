/*
 4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.

 */
interface Loanable {
    void applyForLoan(double amt);
    boolean loanEligible();
}

abstract class BankAccount {
    private String accNo, holder;
    protected double balance;

    BankAccount(String accNo, String holder, double bal) {
        this.accNo=accNo; this.holder=holder; this.balance=bal;
    }
    public String getAccNo(){
        return accNo;
    }
    public String getHolder(){
        return holder;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        balance+=amt;
    }
    public void withdraw(double amt){
        if(balance>=amt)balance-=amt;
    }

    abstract double calcInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(String a,String h,double b){super(a,h,b);}
    double calcInterest(){return balance*0.04;}
    public void applyForLoan(double amt){System.out.println("Savings loan:"+amt);}
    public boolean loanEligible(){return balance>5000;}
}

class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(String a,String h,double b){super(a,h,b);}
    double calcInterest(){return balance*0.02;}
    public void applyForLoan(double amt){System.out.println("Current loan:"+amt);}
    public boolean loanEligible(){return balance>10000;}
}

public class bankingSystem {
    public static void main(String[] args){
        BankAccount acc1 = new SavingsAccount("S1","Pabitra",6000);
        BankAccount acc2 = new CurrentAccount("C1","Ram",15000);
        processAccount(acc1);
        processAccount(acc2);
    }

    static void processAccount(BankAccount a){
        System.out.println(a.getHolder()+" "+a.getAccNo());
        a.deposit(1000); a.withdraw(500);
        System.out.println("Interest:"+a.calcInterest());
        Loanable l=(Loanable)a;
        l.applyForLoan(2000);
        System.out.println("Eligible:"+l.loanEligible());
    }
}
