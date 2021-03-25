package lab3.tpintro.exercises.exercise13;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first leg:");
        double leg1 = sc.nextDouble();
        System.out.println("Insert second leg:");
        double leg2 = sc.nextDouble();
        System.out.println("Hypotenuse = " + HypotenuseRightTriangle(leg1, leg2));
    }

    private static double HypotenuseRightTriangle(double leg1, double leg2)
    {
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }
}
