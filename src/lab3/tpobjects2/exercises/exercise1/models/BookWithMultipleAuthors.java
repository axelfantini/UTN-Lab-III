package lab3.tpobjects2.exercises.exercise1.models;

import java.util.ArrayList;
import java.util.List;

public class BookWithMultipleAuthors {
    private String title;
    private double price;
    private int stock;
    private List<Author> authors;

    public BookWithMultipleAuthors() {

    }

    public BookWithMultipleAuthors(String title, double price, int stock, List<Author> authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void printBookInfo()
    {
        String print = "The book, "+ this.title +" by ";
        int authorsSize = this.authors.size();
        for(int i = 0; i < authorsSize; i++)
        {
            Author author = this.authors.get(i);
            print += i != 0 && i != authorsSize - 1 ? ", " : "";
            print += author.getName() + " " + author.getLastName();
            print += i == authorsSize - 2 ? " and " : "";

        }
        print += " sells for " + this.price + " dollars";
        System.out.println(print);
    }

    public String toString()
    {
        String response = "Book:[Title: " + this.title + ", Price: " + this.price + ", Stock: " + this.stock + ", Authors: ";
        for(Author author: this.authors)
        {
            response += author.toString() + ", ";
        }
        response += "]";
        return response;
    }
}
