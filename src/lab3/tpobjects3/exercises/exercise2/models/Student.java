package lab3.tpobjects3.exercises.exercise2.models;

import lab3.tpobjects3.exercises.exercise2.enums.CareerEnum;

public class Student extends Person{
    private Integer startYear;
    private Double feePrice;
    private CareerEnum career;

    public Student() {
    }

    public Student(String name, String lastname, String email, String dni, String address, Integer startYear, Double feePrice, CareerEnum career) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.dni = dni;
        this.address = address;
        this.startYear = startYear;
        this.feePrice = feePrice;
        this.career = career;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Double getFeePrice() {
        return feePrice;
    }

    public void setFeePrice(Double feePrice) {
        this.feePrice = feePrice;
    }

    public CareerEnum getCareer() {
        return career;
    }

    public void setCareer(CareerEnum career) {
        this.career = career;
    }

    @Override
    public String toString()
    {
        return "Staff["+ super.toString() + ", Start Year= " + this.startYear + ", FeePrice " + this.feePrice + ", Career= " + this.career.toString() + " ]";
    }
}
