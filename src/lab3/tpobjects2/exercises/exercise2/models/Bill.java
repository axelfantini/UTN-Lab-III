package lab3.tpobjects2.exercises.exercise2.models;

import java.time.LocalDate;
import java.util.UUID;

public class Bill {
    private UUID id;
    private double totalAmount;
    private LocalDate createdDate;
    private Customer customer;

    public Bill(double totalAmount, Customer customer) {
        this.totalAmount = totalAmount;
        this.customer = customer;
        this.id = UUID.randomUUID();
        this.createdDate = LocalDate.now();
    }

    public Bill() {
        this.id = UUID.randomUUID();
        this.createdDate = LocalDate.now();
        this.totalAmount = 0;
        this.customer = new Customer();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public double getFinalAmount()
    {
        double discount = this.customer.getDiscountPercentage() / 100;
        return this.totalAmount * (1 - discount);
    }

    public void printBill()
    {
        System.out.println(this.toString());
    }

    public String toString()
    {
        return "Bill[Id=" + this.id + ", Date=" + this.createdDate + ", Total Amount=" + this.totalAmount + ", Final Amount=" + this.getFinalAmount() + ", " + this.customer.toString() + "]";
    }
}
