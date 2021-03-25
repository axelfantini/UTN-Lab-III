package lab3.tpobjects2.exercises.exercise1.models;

import java.util.ArrayList;
import java.util.List;

public class BookWithMultipleAuthors {
    private String title;
    private double price;
    private int stock;
    private List<Author> authors=new ArrayList<Author>();

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
