package lab3.tpobjects3.exercises.exercise2;

import lab3.tpobjects3.exercises.exercise2.enums.CareerEnum;
import lab3.tpobjects3.exercises.exercise2.enums.ShiftEnum;
import lab3.tpobjects3.exercises.exercise2.models.Person;
import lab3.tpobjects3.exercises.exercise2.models.Staff;
import lab3.tpobjects3.exercises.exercise2.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args)
    {
        Student student1 = new Student("Pedro", "Gutierrez", "pedritogut@gmail.com", "44241002", "Av Pedro Luro 2546", 2015, 3000.0, CareerEnum.NATURAL);
        Student student2 = new Student("Juana", "Lopez", "juanalop@live.com", "45324114", "Av Constitucion 5154", 2016, 3100.0, CareerEnum.SOCIAL);
        Student student3 = new Student("Guillermo", "Gomez", "guille.gomez@outlook.com.com", "43917021", "French 6541", 2014, 3400.0, CareerEnum.TECHNICAL);
        Student student4 = new Student("Agustin", "Sanchez", "agus.sanchez77@hotmail.com", "46541276", "Dorrego 751", 2017, 3700.0, CareerEnum.NATURAL);
        Staff staff1 = new Staff("Pablo", "Iturrioz", "pablo.itu@secundaria51.com.ar", "21541232", "Guido 214", 40000.0, ShiftEnum.NIGHT);
        Staff staff2 = new Staff("Mirtha", "Sosa", "mirtha.sanchez@secundaria51.com.ar", "24546712", "Gorriti 675", 37000.0, ShiftEnum.DAY);
        Staff staff3 = new Staff("Susana", "Mendoza", "susy.mendoza@secundaria51.com.ar", "32541477", "Florisbelo Acosta 4200", 34000.0, ShiftEnum.NIGHT);
        Staff staff4 = new Staff("Veronica", "Gimenez", "veronicag@secundaria51.com.ar", "35414256", "Alberti 2754", 31000.0, ShiftEnum.DAY);
        List<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(student2);
        personList.add(student3);
        personList.add(student4);
        personList.add(staff1);
        personList.add(staff2);
        personList.add(staff3);
        personList.add(staff4);

        Integer staffCount = 0;
        Integer studentCount = 0;
        Double earnings = 0.0;
        for(Person person : personList)
        {
            if(person instanceof Staff)
                staffCount++;
            else if(person instanceof Student)
            {
                studentCount++;
                earnings += ((Student) person).getFeePrice();
            }
        }
        System.out.println("Staff Count: " + staffCount);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Earnings: " + earnings);
    }
}
