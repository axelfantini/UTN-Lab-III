package lab3.tpobjects4;

import lab3.tpobjects4.enums.AudienceEnum;
import lab3.tpobjects4.enums.GenreEnum;
import lab3.tpobjects4.models.Customer;
import lab3.tpobjects4.models.Film;
import lab3.tpobjects4.models.VideoStore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Film> filmList = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            filmList.add(new Film("Harry Potter and the Chamber of Secrets",
                    LocalDate.of(2002, 11, 15),
                    240,
                    AudienceEnum.UNRATED,
                    "United Kingdom",
                    "The plot follows Harry's second year at Hogwarts School of Witchcraft and Wizardry, during which a series of messages on the walls of the school's corridors warn that the \"Chamber of Secrets\" has been opened and that the \"heir of Slytherin\" would kill all pupils who do not come from all-magical families.",
                    false,
                    GenreEnum.ADVENTURE,
                    0));
        for(int i = 0; i < 10; i++)
            filmList.add(new Film("Back to the Future",
                    LocalDate.of(1985, 7, 3),
                    117,
                    AudienceEnum.UNRATED,
                    "USA",
                    "Set in 1985, the story follows Marty McFly (Fox), a teenager accidentally sent back to 1955 in a time-traveling DeLorean automobile built by his eccentric scientist friend Doctor Emmett \"Doc\" Brown (Lloyd).",
                    false,
                    GenreEnum.ADVENTURE,
                    0));
        for(int i = 0; i < 7; i++)
            filmList.add(new Film("Superman: The Movie",
                    LocalDate.of(1978, 12, 10),
                    143,
                    AudienceEnum.UNRATED,
                    "USA",
                    "It depicts the origin of Superman (Reeve), including his infancy as Kal-El of Krypton, son of Jor-El (Brando) and his youthful years in the rural town of Smallville.",
                    false,
                    GenreEnum.ACTION,
                    0));
        VideoStore videoStore = new VideoStore(filmList);
        videoStore.addCustomer(new Customer("Ricardo Gutierrez", "441-5500", "Av Jara 2513"));
        videoStore.addRent("superman", "ricardo gutierrez", LocalDate.of(2021, 04, 25));
        videoStore.addRent("harry potter", "ricardo gutierrez", LocalDate.of(2021, 04, 25));
        System.out.println("Show ricardo gutierrez rents:");
        videoStore.show10LastRents("ricardo gutierrez");
        videoStore.addCustomer(new Customer("Ana Gomez", "454-2200", "Av Pedro Luro 5401"));
        videoStore.addRent("superman", "ana gomez", LocalDate.of(2021, 04, 18));
        System.out.println("\nShow all active rents:");
        videoStore.showAllRents();
        System.out.println("\nShow return today rents:");
        videoStore.showReturnTodayRents();
        System.out.println("\nShow most rented films:");
        videoStore.showMostRentedFilms();
        System.out.println("\nShow most popular films by genre:");
        videoStore.showMostPopularFilmsByGenre(GenreEnum.ADVENTURE);
        System.out.println("\nShow film info (Harry Potter)");
        videoStore.showFilmInfo("harry potter");
    }
}
