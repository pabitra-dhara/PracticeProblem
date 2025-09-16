/*2.Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state. */
import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.println(amount+" deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if(amount>0) {
            if(amount<=balance){
                balance-=amount;
                System.out.println(amount+" withdrawn successfully.");
            }else{
                System.out.println("Insufficient balance.");
            }
        }else{
            System.out.println("Invalid withdrawal amount.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " +accountHolder);
        System.out.println("Account Number: " +accountNumber);
        System.out.println("Current Balance: " +balance);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String holder=sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNum=sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal=sc.nextDouble();
        BankAccount account=new BankAccount(holder, accNum, bal);

        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep=sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit=sc.nextDouble();
                    account.withdraw(wit);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice!=4);
    }
}
