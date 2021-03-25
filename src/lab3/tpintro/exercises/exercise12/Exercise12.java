package lab3.tpintro.exercises.exercise12;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert speed in kph:");
        double speed = sc.nextDouble();
        System.out.println("Speed in mph = " + KphToMph(speed));
    }

    private static double KphToMph(double kph)
    {
        return kph / 1.609344;
    }
}
