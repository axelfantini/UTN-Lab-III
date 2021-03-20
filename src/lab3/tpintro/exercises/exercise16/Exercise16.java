package lab3.tpintro.exercises.exercise16;

import java.util.Scanner;

public class Exercise16 {
    public void StartExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a 3 digit whole number:");
        int num = sc.nextInt();
        int[] separated = SeparateDigits(num);
        for(int i = 0; i < separated.length; i++)
        {
            System.out.println((i+1) + " Digit: " + separated[i]);
        }

    }

    private int[] SeparateDigits(int number)
    {
        int[] response = new int[DigitCount(number)];
        response[response.length-1] = number % 10;
        for(int i = (response.length-2); i >= 0; i--)
        {
            number /= 10;
            response[i] = number % 10;
        }
        return response;
    }

    private int DigitCount(int number)
    {
        int i = 0;
        for(i = 0; number != 0; i++)
        {
            number /= 10;
        }
        return i;
    }
}
