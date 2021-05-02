package lab3.objectspractice.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phone;
    private Boolean isBusiness;
    private List<Sale> sales = new ArrayList<>();

    public Customer(String name, String address, String phone, Boolean isBusiness) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.isBusiness = isBusiness;
    }

    public Boolean isBusiness()
    {
        return this.isBusiness;
    }

    public String getName() {
        return name;
    }

    public void addSale(Sale sale)
    {
        sales.add(sale);
    }

    public Double getSaleAverage()
    {
        Double average = 0.0;
        Integer count = 0;
        for (Sale s : sales) {
            average += s.getTotalPrice();
            count++;
        }
        average /= count;
        return average;
    }

    public Integer getSalesCount()
    {
        return sales.size();
    }

    @Override
    public String toString()
    {
        return "Customer[Name = " + this.name + "\n" +
                "Address = " + this.address + "\n"+
                "Phone = " + this.phone + "\n"+
                "Business = " + (this.isBusiness == true ? "yes" : "no") + "]";
    }
}
