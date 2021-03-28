package lab3.tpobjects2.exercises.exercise2.models;

import java.util.UUID;

public class SaleItem {
    private UUID id;
    private String name;
    private String description;
    private double unitaryPrice;

    public SaleItem(String name, String description, double unitaryPrice) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.unitaryPrice = unitaryPrice;
    }

    public SaleItem()
    {
        this.id = UUID.randomUUID();
        this.name = "";
        this.description = "";
        this.unitaryPrice = 0;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public String toString()
    {
        return "SaleItem[Id=" + this.id + ", Name=" + this.name + ", Description=" + this.description + ", Price=" + this.unitaryPrice + "]";
    }
}
