package lab3.tpintro.exercises.exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a temperature in degrees Fahrenheit:");
        double num = sc.nextDouble();
        System.out.println(num + " ºF = " + FahrenheitToCelsius(num) + " ºC");
    }

    private static double FahrenheitToCelsius(double degrees)
    {
        return (degrees - 32) / (1.8);
    }
}
