package lab3.objectspractice;

import lab3.objectspractice.models.Business;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Business business = new Business();
        String control = "y";
        System.out.println("Create customers:");
        do {
            System.out.println("Insert customer name:");
            String name = sc.nextLine();
            System.out.println("Insert customer phone:");
            String phone = sc.nextLine();
            System.out.println("Insert customer address:");
            String address = sc.nextLine();
            System.out.println("This Customer is a business? y/n");
            Boolean isBusiness = sc.nextLine().toUpperCase() == "Y" ? true : false;
            business.addCustomer(name, address, phone, isBusiness);
            System.out.println("Add another customer? y/n");
            control = sc.nextLine();
        }while(control.equalsIgnoreCase("Y"));
        System.out.println("\nCreate products:");
        do {
            System.out.println("Insert product name:");
            String name = sc.nextLine();
            System.out.println("Insert product price:");
            Double price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Insert product stock:");
            Integer stock = sc.nextInt();
            sc.nextLine();
            business.addProduct(stock, name, price);
            System.out.println("Add another product? y/n");
            control = sc.nextLine();
        }while(control.equalsIgnoreCase("Y"));

        System.out.println("\nSale:");
        System.out.println("Insert customer name:");
        String customerName = sc.nextLine();
        System.out.println("Insert product name:");
        String productName = sc.nextLine();
        System.out.println("Insert sale distance(kms):");
        Double saleDistance = sc.nextDouble();
        sc.nextLine();
        business.addSale(customerName, productName, saleDistance);

        business.addCustomer("Pedro", "Luro 2421", "472-2541", false);
        business.addCustomer("Carrefour", "Constitucion 4571", "471-2254", true);
        business.addCustomer("Carlos", "French 6541", "477-2255", false);
        business.addProduct(20, "Pen", 25.0);
        business.addProduct(15, "Pencil", 15.0);
        business.addSale("Pedro", "Pen", 15.0);
        business.addSale("Pedro", "Pencil", 15.0);
        business.addSale("Carrefour", "Pen", 20.0);
        business.addSale("Carrefour", "Pencil", 20.0);
        business.addSale("Carlos", "Pencil", 32.0);
        business.showSaleAverage();
        business.showBestBuyer();

    }
}
