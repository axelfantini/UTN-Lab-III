package lab3.tpobjects2.exercises.exercise2;

import lab3.tpobjects2.exercises.exercise2.models.Bill;
import lab3.tpobjects2.exercises.exercise2.models.BillWithSaleItems;
import lab3.tpobjects2.exercises.exercise2.models.Customer;
import lab3.tpobjects2.exercises.exercise2.models.SaleItem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args)
    {
        Customer customer = new Customer("Robert Lee", "robertlee@mail.com", 25);
        customer.printCustomer();
        Bill bill = new Bill(4500, customer);
        System.out.println("Bill total amount: " + bill.getTotalAmount());
        System.out.println("Bill final amount: " + bill.getFinalAmount());
        bill.printBill();

        List<SaleItem> items = new ArrayList<SaleItem>();
        items.add(new SaleItem("Table", "red table", 25));
        items.add(new SaleItem("Chair", "green chair", 10));
        items.add(new SaleItem("Chair", "green chair", 10));
        items.add(new SaleItem("Chair", "green chair", 10));
        items.add(new SaleItem("Chair", "green chair", 10));
        items.add(new SaleItem("TV", "TV 32'", 100));
        BillWithSaleItems billPro = new BillWithSaleItems(items, customer);
        billPro.printBill();
    }
}
