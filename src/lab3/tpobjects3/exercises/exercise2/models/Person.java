package lab3.tpobjects3.exercises.exercise2.models;

public class Person {
    protected String name;
    protected String lastname;
    protected String email;
    protected String dni;
    protected String address;

    public Person() {
    }

    public Person(String name, String lastname, String email, String dni, String address) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.dni = dni;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Name= " + this.name + ", LastName= " + this.lastname + ", Email= " + this.email + ", DNI= " + this.dni + ", Address= " + this.address;
    }
}
