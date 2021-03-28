package lab3.tpobjects2.exercises.exercise2.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BillWithSaleItems {
    private UUID id;
    private List<SaleItem> items;
    private double totalAmount;
    private LocalDate createdDate;
    private Customer customer;

    public BillWithSaleItems(List<SaleItem> items, Customer customer) {
        this.items = items;
        this.totalAmount = 0;
        for(SaleItem item : this.items)
            this.totalAmount += item.getUnitaryPrice();
        this.customer = customer;
        this.id = UUID.randomUUID();
        this.createdDate = LocalDate.now();
    }

    public BillWithSaleItems() {
        this.id = UUID.randomUUID();
        this.createdDate = LocalDate.now();
        this.totalAmount = 0;
        this.customer = new Customer();
        this.items = new ArrayList<SaleItem>();
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
        String response = "Bill[Id=" + this.id + ", Date=" + this.createdDate + ", Total Amount=" + this.totalAmount + ", Final Amount=" + this.getFinalAmount() + ", " + this.customer.toString();
        response += ",Items=\n" ;
        int i = 0;
        for(SaleItem item : this.items)
        {
            if(i == 0)
                response += item.toString();
            else
                response += ",\n" + item.toString();
            i++;
        }
        response += "]";
        return response;
    }
}
