package lab3.tpobjects2.exercises.exercise1;

import lab3.tpobjects2.exercises.exercise1.models.Author;
import lab3.tpobjects2.exercises.exercise1.models.Book;
import lab3.tpobjects2.exercises.exercise1.models.BookWithMultipleAuthors;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args)
    {
        Author authorJoshua = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        authorJoshua.printAuthor();
        Book effectiveJava = new Book("Effective Java", 450, 150, authorJoshua);
        effectiveJava.printBook();
        System.out.println("Modifying Book price to 500 & stock to 50");
        effectiveJava.setPrice(500);
        effectiveJava.setStock(50);
        effectiveJava.getAuthor().printAuthor();
        effectiveJava.printBookInfo();
        Author authorPedro = new Author("Pedro", "Gutierrez", "pedro@email.com", 'M');
        List<Author> authors = new ArrayList<Author>();
        authors.add(authorJoshua);
        authors.add(authorPedro);
        BookWithMultipleAuthors effectiveJavaPro = new BookWithMultipleAuthors("Effective Java", 450, 150, authors);
        effectiveJavaPro.printBookInfo();
    }
}
