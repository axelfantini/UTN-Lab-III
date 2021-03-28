package lab3.tpobjects2.exercises.exercise2.models;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    private String email;
    private double discountPercentage;

    public Customer() {
        this.id = UUID.randomUUID();
        this.discountPercentage = 0;
        this.name = "";
        this.email = "";
    }

    public Customer(String name, String email, double discountPercentage) {
        this.name = name;
        this.email = email;
        this.discountPercentage = discountPercentage;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void printCustomer()
    {
        System.out.println(this.toString());
    }

    public String toString()
    {
        return "Customer[Id=" + this.id + ", Name=" + this.name + ", Email=" + this.email + ", Discount=" + this.discountPercentage + "]";
    }
}
