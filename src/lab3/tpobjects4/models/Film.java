package lab3.tpobjects4.models;

import lab3.tpobjects4.enums.AudienceEnum;
import lab3.tpobjects4.enums.GenreEnum;

import java.time.LocalDate;

public class Film {
    private String title;
    private LocalDate releaseDate;
    private Integer duration;
    private AudienceEnum audience;
    private String originCountry;
    private String description;
    private Boolean rented;
    private GenreEnum genre;
    private Integer rentRecord = 0;

    public Film(String title, LocalDate releaseDate, Integer duration, AudienceEnum audience, String originCountry, String description, Boolean rented, GenreEnum genre, Integer rentRecord) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.audience = audience;
        this.originCountry = originCountry;
        this.description = description;
        this.rented = rented;
        this.genre = genre;
        this.rentRecord = rentRecord;
    }

    public Film(String title, LocalDate releaseDate, Integer duration, AudienceEnum audience, String originCountry, String description, Boolean rented, GenreEnum genre) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.audience = audience;
        this.originCountry = originCountry;
        this.description = description;
        this.rented = rented;
        this.genre = genre;
    }


    public Film() {

    }

    public Integer getRentRecord() {
        return rentRecord;
    }

    public void setRentRecord(Integer rentRecord) {
        this.rentRecord = rentRecord;
    }

    public void addRentRecord()
    {
        this.rentRecord++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public AudienceEnum getAudience() {
        return audience;
    }

    public void setAudience(AudienceEnum audience) {
        this.audience = audience;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRented() {
        return rented;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return "Film[Title= " + this.title + ", \n" +
                ",\nRelease Date= " + this.releaseDate +
                ",\nDuration= " + this.duration +
                ",\nAudience= " + this.audience.toString() +
                ",\nOrigin Country= " + this.originCountry +
                ",\nDescription= " + this.description +
                ",\nGenre= " + this.genre.toString() +
                ",\nRent Record= " + this.rentRecord + "]";
    }
}
