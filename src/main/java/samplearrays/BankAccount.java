package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    private int curr=0;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    private double [] transactions = new double[1000];

    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if (amount<0){
            System.out.println("Invalid amount to deposit");
            return;
        }
        currentBalance+=amount;
        transactions[curr]=amount;
        System.out.println(this.name + " Has deposited : " + amount +" The new balance is :"+this.currentBalance);
        curr++;
    }

    public void withdraw(double amount){
        if (amount<0){
            System.out.println("Invalid amount to withdraw");
            return;
        }
        if (amount>this.currentBalance){
            System.out.println("Insufficient balance");
            return;
        }
        this.currentBalance-=amount;
        transactions[curr]=(-1*amount);
        curr++;

    }

    public void displayTransactions(){
        System.out.println("Transaction     Amount");
        for(int i=0;i<transactions.length;i++){
            System.out.println(i +"     "+transactions[i]);
        }
    }

    public void displayBalance(){
        System.out.println("Current Balance : "+this.currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
