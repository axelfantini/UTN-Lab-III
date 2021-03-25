package lab3.tpobjects1.exercises.exercise4;

import lab3.tpobjects1.exercises.exercise4.models.BankAccount;

public class Exercise4 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Roberto Perez", 15000);
        System.out.println("New Bank Account:");
        bankAccount.PrintBankAccount();
        System.out.println("Deposit $2500");
        bankAccount.Deposit(2500);
        System.out.println("Withdraw $1500");
        bankAccount.Withdraw(1500);
        System.out.println("Withdraw $30000");
        bankAccount.Withdraw(30000);
        System.out.println("Bank Account actual status:");
        bankAccount.PrintBankAccount();
    }
}
