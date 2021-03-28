package lab3.tpobjects2.exercises.exercise3;

import lab3.tpobjects2.exercises.exercise3.models.Account;
import lab3.tpobjects2.exercises.exercise3.models.AccountWithDebt;
import lab3.tpobjects2.exercises.exercise3.models.Customer;

public class Exercise3 {
    public static void main(String[] args)
    {
        Customer customer = new Customer("Peter Parker", 'M');
        customer.printCustomer();
        Account account = new Account(10000, customer);
        account.printAccount();
        System.out.println("Deposit 5000");
        account.deposit(5000);
        account.printAccount();
        System.out.println("Deposit -2000");
        account.deposit(-2000);
        account.printAccount();
        System.out.println("Withdraw 5000");
        account.withdraw(5000);
        account.printAccount();
        System.out.println("Withdraw 20000");
        account.withdraw(20000);
        account.printAccount();
        System.out.println("Deposit -3000");
        account.withdraw(-3000);
        account.printAccount();
        System.out.println("Account logs:");
        account.getLog().printLogs();

        System.out.println("\nNew account with debt");
        AccountWithDebt accountPro = new AccountWithDebt(10000, customer);
        accountPro.printAccount();
        System.out.println("Withdraw 10000");
        accountPro.withdraw(10000);
        accountPro.printAccount();
        System.out.println("Withdraw 1000");
        accountPro.withdraw(1000);
        accountPro.printAccount();
        System.out.println("Withdraw 1200");
        accountPro.withdraw(1200);
        accountPro.printAccount();
        System.out.println("Withdraw 1000");
        accountPro.withdraw(1000);
        accountPro.printAccount();
        System.out.println("Account logs:");
        accountPro.getLog().printLogs();
    }
}
