package lab3.objectspractice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Business {
    private List<Customer> customers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private final Double SHIPPING_PRICE_PER_KM = 10.00;

    public void addCustomer(String name, String address, String phone, Boolean isBusiness)
    {
        customers.add(new Customer(name, address, phone, isBusiness));
    }

    public void addProduct(Integer stock, String name, Double price)
    {
        products.add(new Product(stock, name, price));
    }

    public void addSale(String customerName, String productName, Double distance)
    {
        Customer customer = customers.stream().filter(c -> c.getName().toUpperCase().contains(customerName.toUpperCase()))
                .findFirst().orElse(null);
        Product product = products.stream().filter(c -> c.getName().toUpperCase().contains(productName.toUpperCase()))
                .findFirst().orElse(null);
        if(customer != null && product != null)
        {
            Double shippingPrice = calculateShippingPrice(customer.isBusiness(), distance);
            Sale sale = new Sale(customer, product, product.getPrice(), shippingPrice);
            if(product.getStock() > 0)
            {
                System.out.println("Total price: " + sale.getTotalPrice() + " Stock: " + product.getStock());
                Scanner sc = new Scanner(System.in);
                System.out.println("Confirm sale? y/n");
                Boolean confirm = sc.nextLine().equalsIgnoreCase("Y");
                System.out.println(confirm);
                if(confirm)
                {
                    customer.addSale(sale);
                    product.decreaseStock();
                }

            }
            else
            {
                System.out.println("Not enough stock");
            }

        }
    }

    private Double calculateShippingPrice(Boolean isBusiness, Double distance)
    {
        return isBusiness ? (distance * SHIPPING_PRICE_PER_KM) * 0.85 : distance * SHIPPING_PRICE_PER_KM;
    }

    public void showSaleAverage()
    {
        Double average = 0.0;
        Integer count = 0;
        for (Customer c : customers) {
            average += c.getSaleAverage();
            count++;
        }
        average /= count;
        System.out.println("Total sales average: " + average);
    }

    public void showBestBuyer()
    {
        customers.sort((r1, r2) -> r2.getSalesCount().compareTo(r1.getSalesCount()));
        Customer customer = customers.get(0);
        System.out.println("Best buyer is " + customer.getName() + " with " + customer.getSalesCount() + " purchases");
        System.out.println(customer.toString());
    }
}
