package lab3.tpintro.exercises.exercise11;

import java.util.Scanner;

public class Exercise11 {
    public void StartExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a circumference:");
        double num = sc.nextDouble();
        System.out.println("Circumference Area = " + CircumferenceArea(num));
        System.out.println("Circumference Longitude = " + CircumferenceLongitude(num));
    }
    private double CircumferenceArea(double circumference)
    {
        return Math.pow(circumference, 2) / (Math.PI * 4);
    }
    private double CircumferenceLongitude(double circumference)
    {
        return 2 * Math.PI * circumference;
    }
}
