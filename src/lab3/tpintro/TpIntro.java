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
    private Scanner scanner = new Scanner(System.in);
    public void StartTP() {

        char cond;
        do {
            System.out.println("Hello World TP Intro");
            StartExercise(Menu());
            System.out.println("Do you want to see another exercise?");
            cond = scanner.next().charAt(0);
        }
        while(cond == 'y' || cond == 'Y');
    }

    private int Menu(){

        System.out.println("Exercise 1 - 18");
        System.out.println("Insert exercise number: ");
        return scanner.nextInt();
    }
    private void StartExercise(int tpNumber)
    {
        switch (tpNumber)
        {
            case 1:
                new Exercise1().StartExercise();
                break;
            case 2:
                new Exercise2().StartExercise();
                break;
            case 3:
                new Exercise3().StartExercise();
                break;
            case 4:
                new Exercise4().StartExercise();
                break;
            case 5:
                new Exercise5().StartExercise();
                break;
            case 6:
                new Exercise6().StartExercise();
                break;
            case 7:
                new Exercise7().StartExercise();
                break;
            case 8:
                new Exercise8().StartExercise();
                break;
            case 9:
                new Exercise9().StartExercise();
                break;
            case 10:
                new Exercise10().StartExercise();
                break;
            case 11:
                new Exercise11().StartExercise();
                break;
            case 12:
                new Exercise12().StartExercise();
                break;
            case 13:
                new Exercise13().StartExercise();
                break;
            case 14:
                new Exercise14().StartExercise();
                break;
            case 15:
                new Exercise15().StartExercise();
                break;
            case 16:
                new Exercise16().StartExercise();
                break;
            case 17:
                new Exercise17().StartExercise();
                break;
            case 18:
                new Exercise18().StartExercise();
                break;
            default:
                System.out.println("That TP does not exist");
                break;
        }
    }

    protected boolean IsPositive(int number)
    {
        return number > 0;
    }
    protected boolean IsEven(int number) {
        return number % 2 == 0;
    }
}
