package lab3.tpobjects2.exercises.exercise3.models;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    private Character sex;

    public Customer(String name, Character sex) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.sex = sex;
    }

    public Customer() {
        this.id = UUID.randomUUID();
        this.name = "";
        this.sex = ' ';
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

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String toString()
    {
        return "Customer[Id=" + this.id + ", Name=" + this.name + ", Sex=" + this.sex + "]";
    }

    public void printCustomer()
    {
        System.out.println(this.toString());
    }
}
