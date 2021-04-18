package lab3.tpobjects4.models;

import java.time.LocalDate;

public class Rent {
    private Customer customer;
    private Film film;
    private LocalDate returnDate;
    private Boolean isActive = true;

    public Rent(Customer customer, Film film, LocalDate returnDate) {
        this.customer = customer;
        this.film = film;
        this.returnDate = returnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getCustomerName()
    {
        return this.customer.getFullName();
    }

    public String getFilmTitle()
    {
        return this.film.getTitle();
    }

    public Film getFilm() {
        return film;
    }

    public String toString()
    {
        return "Rent[Customer= " + this.customer.getFullName() + ", \nFilm= " + this.film.getTitle() + ", \nReturn Date= " + this.returnDate + ", \nActive = " + this.isActive + "]";
    }
}
