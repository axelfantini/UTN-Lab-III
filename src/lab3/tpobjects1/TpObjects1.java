package lab3.tpobjects1;

import lab3.tpobjects1.exercises.exercise1.Exercise1;
import lab3.tpobjects1.exercises.exercise2.Exercise2;
import lab3.tpobjects1.exercises.exercise3.Exercise3;
import lab3.tpobjects1.exercises.exercise4.Exercise4;
import lab3.tpobjects1.exercises.exercise5.Exercise5;

import java.util.Scanner;

public class TpObjects1 {
    private Scanner scanner = new Scanner(System.in);
    public void StartTP() {

        char cond;
        do {
            System.out.println("Hello World TP Objects I");
            StartExercise(Menu());
            System.out.println("Do you want to see another exercise?");
            cond = scanner.next().charAt(0);
        }
        while(cond == 'y' || cond == 'Y');
    }

    private int Menu(){

        System.out.println("Exercise 1 - 5");
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
            default:
                System.out.println("That exercise does not exist");
                break;
        }
    }
}
