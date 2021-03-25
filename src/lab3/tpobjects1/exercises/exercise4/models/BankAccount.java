package lab3.tpobjects1.exercises.exercise4.models;

public class BankAccount {
    private int Id;
    private String Name;
    private double Balance;

    public BankAccount(int id, String name, double balance)
    {
        this.Id = id;
        this.Name = name;
        this.Balance = balance;
    }

    public int GetId() {
        return Id;
    }

    public void SetId(int id) {
        Id = id;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String name) {
        Name = name;
    }

    public double GetBalance() {
        return Balance;
    }

    public void SetBalance(double balance) {
        Balance = balance;
    }

    public double Deposit(double cash)
    {
        this.Balance += cash;
        return this.Balance;
    }

    public double Withdraw(double cash)
    {
        if(cash > 0)
        {
            if(this.Balance >= cash)
                this.Balance -= cash;
            else
                System.out.println("There is not enough money in the account");
        }
        else
        {
            System.out.println("Invalid amount");
        }
        return this.Balance;
    }

    public void PrintBankAccount()
    {
        System.out.println("BankAccount[Id= " + this.Id + ", Name= " + this.Name + ", Balance = " + this.Balance + "]");
    }
}
