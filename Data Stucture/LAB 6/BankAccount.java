// Create a class BankAccount with attributes like account number, balance, account holder and name. Create an array of BankAccount objects to store bank accounts. Implement methods to deposit money, withdraw money and check balance.

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        BankAccount1 [] B1;

        B1 = new BankAccount1[1];
        B1[0] = new BankAccount1("123456", 15000, "Neel");

        System.out.println("What you want for widraw enter 1 for deposit enter 2 and for display balance enter 3");
        int temp = sc.nextInt();

        switch (temp) {
            case 1:
                B1[0].withdrawMoney();
                break;
            case 2:
                B1[0].dipositMoney();
                break;
            case 3:
                B1[0].displayMoney();
                break;
        }
    }
}

class BankAccount1 {
    Scanner sc  = new Scanner(System.in);
    String Account_Number;
    int balance;
    String Name;

    BankAccount1(String Account_Number, int balance, String Name) {
        this.Account_Number = Account_Number;
        this.balance = balance;
        this.Name = Name;
    }
    public void displayMoney(){
        System.out.println("Amount in your account is "+balance);
    }
    public void withdrawMoney(){
        System.out.println("Enter money");
        int WM = sc.nextInt();
        balance = balance - WM;
        System.out.println("Now Available "+balance);
    }
    public void dipositMoney(){
        System.out.println("Enter money");
        int DM = sc.nextInt();
        balance = balance + DM;
        System.out.println("Now Available "+balance);
    }
}