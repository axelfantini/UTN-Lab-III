package lab3.tpobjects2.exercises.exercise3.models;

import java.util.UUID;

public class Account {
    protected UUID id;
    protected double balance;
    protected Customer owner;
    protected AccountLog log;

    public Account(double balance, Customer owner) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.owner = owner;
        this.log = new AccountLog();
    }

    public Account() {
        this.id = UUID.randomUUID();
        this.balance = 0;
        this.owner = new Customer();
        this.log = new AccountLog();
    }

    public UUID getId() {
        return id;
    }

    public AccountLog getLog() {
        return this.log;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public void deposit(double money)
    {
        if(money > 0)
        {
            this.balance += money;
            this.log.addLog(this.owner.getName() + " deposit " + money);
        }
        else
            System.out.println("Invalid amount");
    }
    public void withdraw(double money)
    {
        if(money > 0)
            if(this.balance >= money)
            {
                this.balance -= money;
                this.log.addLog(this.owner.getName() + " withdraw " + money);
            }
            else
                System.out.println("Not enough money");
        else
            System.out.println("Invalid amount");
    }

    public void printAccount()
    {
        System.out.println(this.toString());
    }

    public String toString()
    {
        return "Account[Id=" + this.id + ", Balance=" + this.balance + ", Owner=" + this.owner.toString() + "]";
    }
}
