package lab3.tpintro.exercises.exercise17;

import java.util.Scanner;
import lab3.tpintro.TpIntro;
public class Exercise17 extends TpIntro {
    public static void main(String[] args) {
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
