package lab3.tpobjects4.models;

import lab3.tpobjects4.enums.GenreEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class VideoStore {
    private List<Film> filmList = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();
    private List<Rent> rentList = new ArrayList<>();



    public VideoStore(List<Film> filmList, List<Customer> customerList, List<Rent> rentList) {
        this.filmList = filmList;
        this.customerList = customerList;
        this.rentList = rentList;
    }

    public VideoStore(List<Film> filmList, List<Customer> customerList) {
        this.filmList = filmList;
        this.customerList = customerList;
    }

    public VideoStore(List<Film> filmList) {
        this.filmList = filmList;
    }

    public VideoStore() {
    }

    public void showAllRents() {
        rentList.forEach(r -> {
            if(r.getActive())
                System.out.println(r.toString());
        });
    }

    public void showReturnTodayRents() {
        rentList.forEach(r -> {
            if(r.getReturnDate().equals(LocalDate.now()) && r.getActive())
                System.out.println(r.toString());
        });
    }

    public void show10LastRents(String customerName)
    {
        rentList.sort((r1, r2) -> r1.getReturnDate().compareTo(r2.getReturnDate()));
        for(int i = 0; i < 10 && i < rentList.size(); i++)
        {
            Rent r = rentList.get(i);
            if(r.getCustomerName().toUpperCase().contains(customerName.toUpperCase()))
                System.out.println(r.toString());
        }
    }

    private List<Film> getUnitaryFilmList()
    {
        List<Film> unitaryList = new ArrayList<>();
        filmList.forEach(f -> {
            if(!unitaryList.stream().anyMatch(u -> u.getTitle() == f.getTitle()))
                unitaryList.add(f);
        });
        return unitaryList;
    }

    public void showMostRentedFilms()
    {
        filmList.sort((f1, f2) -> f2.getRentRecord().compareTo(f1.getRentRecord()));
        List<Film> unitaryList = this.getUnitaryFilmList();

        for(int i = 0; i < 5 && i < unitaryList.size(); i++)
        {
            System.out.println(unitaryList.get(i).getTitle());
        }
    }

    public void showMostPopularFilmsByGenre(GenreEnum genre)
    {
        filmList.sort((f1, f2) -> f1.getRentRecord().compareTo(f2.getRentRecord()));
        List<Film> unitaryList = this.getUnitaryFilmList();
        unitaryList.forEach((f) -> {
            if(f.getGenre() == genre)
                System.out.println(f.getTitle());
        });
    }

    public void showFilmInfo(String title)
    {
        Film film = filmList.stream().filter(f -> f.getTitle().toUpperCase().contains(title.toUpperCase()))
            .findFirst().orElse(null);
        if(film != null)
            System.out.println(film.toString());
    }

    public void addCustomer(Customer customer)
    {
        customerList.add(customer);
    }

    public void removeCustomer(String customerName)
    {
        Customer customer = customerList.stream().filter(c -> c.getFullName().toUpperCase().contains(customerName.toUpperCase()))
                .findFirst().orElse(null);
        if(customerList != null)
            customerList.remove(customer);
    }

    public void addFilm(Film film)
    {
        filmList.add(film);
    }

    public void removeFilm(String filmTitle)
    {
        Film film = filmList.stream().filter(f -> f.getTitle().toUpperCase().contains(filmTitle.toUpperCase()))
                .findFirst().orElse(null);
        if(film != null)
            filmList.remove(film);
    }

    public void addRent(String filmTitle, String customerName, LocalDate returnDate)
    {
        Film film = filmList.stream().filter(f -> f.getTitle().toUpperCase().contains(filmTitle.toUpperCase()) && !f.getRented())
                .findFirst().orElse(null);
        Customer customer = customerList.stream().filter(c -> c.getFullName().toUpperCase().contains(customerName.toUpperCase()))
                .findFirst().orElse(null);
        if(customer != null && film != null) {
            film.setRented(true);
            List<Film> films = filmList.stream().filter(f -> f.getTitle().toUpperCase().contains(filmTitle.toUpperCase())).collect(Collectors.toList());
            films.forEach(f -> f.addRentRecord());
            rentList.add(new Rent(customer, film, returnDate));
        }
    }

    public void endRent(String filmTitle, String customerName)
    {
        Rent rent = rentList.stream().filter(r -> r.getActive() && r.getCustomerName().toUpperCase().contains(customerName.toUpperCase())
                && r.getFilmTitle().toUpperCase().contains(filmTitle.toUpperCase()))
                .findFirst().orElse(null);
        if(rent != null)
        {
            rent.setActive(false);
            rent.getFilm().setRented(false);
        }


    }


}
