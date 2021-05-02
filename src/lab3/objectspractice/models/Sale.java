package lab3.objectspractice.models;

public class Sale {
    private Customer customer;
    private Product product;
    private Double price;
    private Double shippingPrice;

    public Sale(Customer customer, Product product, Double price, Double shippingPrice) {
        this.customer = customer;
        this.product = product;
        this.price = price;
        this.shippingPrice = shippingPrice;
    }

    public Double getTotalPrice()
    {
        return price + shippingPrice;
    }

}
