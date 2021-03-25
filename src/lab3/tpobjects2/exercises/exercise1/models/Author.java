package lab3.tpobjects2.exercises.exercise1.models;

public class Author {
    private String name;
    private String lastName;
    private String email;
    private Character sex;

    public Author() {

    }
    public Author(String name, String lastName, String email, Character sex) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void printAuthor()
    {
        System.out.println(this.toString());
    }

    public String toString()
    {
        return "Author:[Name: " + this.name + ", LastName: " + this.lastName + ", Email: " + this.email + ", Sex: " + this.sex + "]";
    }
}
