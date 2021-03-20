package lab3.tpintro.exercises.exercise15;

import java.util.Scanner;

public class Exercise15 {
    public void StartExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first side:");
        double side1 = sc.nextDouble();
        System.out.println("Insert second side:");
        double side2 = sc.nextDouble();
        System.out.println("Insert third side:");
        double side3 = sc.nextDouble();
        System.out.println("Triangle area: " + TriangleArea(side1, side2, side3));
    }

    private double TriangleArea(double side1, double side2, double side3)
    {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
