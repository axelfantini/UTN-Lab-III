package lab3.tpintro.exercises.exercise9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a whole number:");
        int num = sc.nextInt();
        System.out.println("The double of " + num + " is " + DoubleAInt(num));
        System.out.println("The triple of " + num + " is " + TripleAInt(num));

    }

    private static int DoubleAInt(int num)
    {
        return num * 2;
    }
    private static int TripleAInt(int num)
    {
        return num * 3;
    }
}
