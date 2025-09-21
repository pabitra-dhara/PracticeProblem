import java.util.*;
public class BankAccount {
    static String bankName="State Bank of India";
    static int totalAccounts=0;
    final int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        totalAccounts++;
    }
    static void getTotalAccounts(){
        System.out.println("Total Accounts:"+totalAccounts);
    }
    void display(){
        if(this instanceof BankAccount){
            System.out.println(bankName+" "+accountNumber+" "+accountHolderName+" "+balance);
        }
    }
}
class bankAccountDetails {
    public static void main(String[] args){
        BankAccount obj1=new BankAccount(1,"Pabitra Dhara",5000);
        obj1.display();
        BankAccount.getTotalAccounts();
    }
    
}
