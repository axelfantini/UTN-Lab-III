package lab3.tpobjects1.exercises.exercise3;

import lab3.tpobjects1.exercises.exercise3.models.SaleItem;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's create a Sale Item");
        System.out.println("Insert id:");
        int id = sc.nextInt();
        System.out.println("Insert count:");
        int count = sc.nextInt();
        System.out.println("Insert unitary price:");
        double unitaryPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Insert description:");
        String description = sc.nextLine();
        SaleItem saleItem = new SaleItem(id, description, count, unitaryPrice);
        saleItem.PrintSaleItem();
    }
}
