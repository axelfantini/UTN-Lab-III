package lab3.tpintro;

import lab3.tpintro.exercises.exercise1.Exercise1;
import lab3.tpintro.exercises.exercise2.Exercise2;
import lab3.tpintro.exercises.exercise3.Exercise3;
import lab3.tpintro.exercises.exercise4.Exercise4;
import lab3.tpintro.exercises.exercise5.Exercise5;
import lab3.tpintro.exercises.exercise6.Exercise6;
import lab3.tpintro.exercises.exercise7.Exercise7;
import lab3.tpintro.exercises.exercise8.Exercise8;
import lab3.tpintro.exercises.exercise9.Exercise9;
import lab3.tpintro.exercises.exercise10.Exercise10;
import lab3.tpintro.exercises.exercise11.Exercise11;
import lab3.tpintro.exercises.exercise12.Exercise12;
import lab3.tpintro.exercises.exercise13.Exercise13;
import lab3.tpintro.exercises.exercise14.Exercise14;
import lab3.tpintro.exercises.exercise15.Exercise15;
import lab3.tpintro.exercises.exercise16.Exercise16;
import lab3.tpintro.exercises.exercise17.Exercise17;
import lab3.tpintro.exercises.exercise18.Exercise18;

import java.util.Scanner;

public class TpIntro {

    protected static boolean IsPositive(int number)
    {
        return number > 0;
    }
    protected static boolean IsEven(int number) {
        return number % 2 == 0;
    }
    protected static int[] SeparateDigits(int number)
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

    protected static int DigitCount(int number)
    {
        int i = 0;
        for(i = 0; number != 0; i++)
        {
            number /= 10;
        }
        return i;
    }
}
