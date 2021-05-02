package lab3.objectspractice.models;

public class Product {
    private Integer stock;
    private String name;
    private Double price;

    public Product(Integer stock, String name, Double price) {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public void decreaseStock()
    {
        stock--;
    }
}
