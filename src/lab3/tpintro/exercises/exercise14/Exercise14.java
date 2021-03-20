package lab3.tpintro.exercises.exercise14;

import java.util.Scanner;

public class Exercise14 {
    public void StartExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert sphere radius:");
        double num = sc.nextDouble();
        System.out.println("Sphere volume: " + VolumeOfSphere(num));
    }
    private double VolumeOfSphere(double radius)
    {
        return (4 * Math.PI * Math.pow(radius, 3))/3;
    }
}
