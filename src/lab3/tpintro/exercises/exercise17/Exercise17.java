package lab3.tpintro.exercises.exercise17;

import lab3.tpintro.TpIntro;

import java.util.Scanner;

public class Exercise17 extends TpIntro {
    public void StartExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a 5 digit whole number:");
        int num = sc.nextInt();
        int[] separated = SeparateDigits(num);
        for(int i = 0; i < separated.length; i++)
        {
            if(!IsEven(i+1))
                System.out.println((i+1) + " Digit: " + separated[i]);
        }

    }
}
