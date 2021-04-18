package lab3.tpobjects3.exercises.exercise2.models;

import lab3.tpobjects3.exercises.exercise2.enums.ShiftEnum;

public class Staff extends Person {
    private Double salary = 0.0;
    private ShiftEnum shift = ShiftEnum.DAY;
    public Staff() {
    }

    public Staff(String name, String lastname, String email, String dni, String address, Double salary, ShiftEnum shift) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.dni = dni;
        this.address = address;
        this.salary = salary;
        this.shift = shift;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public ShiftEnum getShift() {
        return shift;
    }

    public void setShift(ShiftEnum shift) {
        this.shift = shift;
    }

    public Double getAnnualSalary()
    {
        return this.salary * 12;
    }

    @Override
    public String toString()
    {
        return "Staff["+ super.toString() + ", Salary= " + this.salary + ", Shift " + this.shift.toString() + " ]";
    }
}
