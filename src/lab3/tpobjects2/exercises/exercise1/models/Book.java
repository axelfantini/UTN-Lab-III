package lab3.tpobjects2.exercises.exercise1.models;

public class Book {
    private String title;
    private double price;
    private int stock;
    private Author author;

    public Book() {

    }

    public Book(String title, double price, int stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
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

    public void printBook()
    {
        System.out.println(this.toString());
    }

    public void printBookInfo()
    {
        System.out.println("The book, "+ this.title +" by " + this.author.getName() + " " + this.author.getLastName() + " sells for " + this.price + " dollars");
    }

    public String toString()
    {
        return "Book:[Title: " + this.title + ", Price: " + this.price + ", Stock: " + this.stock + ", Author: " + this.author.toString() + "]";
    }
}
