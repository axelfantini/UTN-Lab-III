package lab3.tpobjects2.exercises.exercise3.models;

import java.util.UUID;

public class AccountWithDebt extends Account{

    public AccountWithDebt(double balance, Customer owner) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.owner = owner;
        this.log = new AccountLog();
    }

    public AccountWithDebt() {
        this.id = UUID.randomUUID();
        this.balance = 0;
        this.owner = new Customer();
        this.log = new AccountLog();
    }

    public void withdraw(double money)
    {
        if(money > 0)
            if((this.balance + 2000) >= money)
            {
                this.balance -= money;
                this.log.addLog(this.owner.getName() + " withdraw " + money);
            }
            else
                System.out.println("Not enough money");
        else
            System.out.println("Invalid amount");
    }
}
