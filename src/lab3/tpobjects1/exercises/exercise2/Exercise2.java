package lab3.tpobjects1.exercises.exercise2;

import lab3.tpobjects1.exercises.exercise2.models.Employee;

public class Exercise2 {
    public void StartExercise() {
        Employee carlos = new Employee("23456345", "Carlos", "Gutierrez", 25000);
        Employee ana = new Employee("34234123", "Ana", "Sanchez", 27500);
        carlos.PrintEmployee();
        ana.PrintEmployee();
        System.out.println("Carlos salary +15%");
        carlos.IncreaseSalary(15);
        System.out.println("Carlos new annual salary = " + carlos.GetAnnualSalary());
    }
}
