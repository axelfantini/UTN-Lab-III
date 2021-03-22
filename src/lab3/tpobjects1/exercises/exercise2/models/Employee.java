package lab3.tpobjects1.exercises.exercise2.models;

public class Employee {
    private String Dni;
    private String Name;
    private String LastName;
    private double Salary;

    public Employee(String dni, String name, String lastName, double salary) {
        Dni = dni;
        Name = name;
        LastName = lastName;
        Salary = salary;
    }

    public String GetDni() {
        return Dni;
    }

    public void SetDni(String dni) {
        Dni = dni;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String name) {
        Name = name;
    }

    public String GetLastName() {
        return LastName;
    }

    public void SetLastName(String lastName) {
        LastName = lastName;
    }

    public double GetSalary() {
        return Salary;
    }

    public void SetSalary(double salary) {
        Salary = salary;
    }

    public double GetAnnualSalary()
    {
        return Salary * 12;
    }

    public void IncreaseSalary(double percentage)
    {
        Salary *= (1 + percentage/100);
    }
    public void PrintEmployee()
    {
        System.out.println("Employee[Dni= " + this.Dni + ", Name= " + this.Name + ", LastName= " + this.LastName + ", Salary= " + this.Salary + "]");
    }
}
