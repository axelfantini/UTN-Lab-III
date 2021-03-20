package lab3;

import lab3.tpintro.TpIntro;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        char cond;
        do {
            System.out.println("Hello World Lab 3");
            StartTP(Menu());
            System.out.println("Do you want to keep checking TPs?");
            cond = scanner.next().charAt(0);
        }
        while(cond == 'y' || cond == 'Y');
    }

    private static int Menu(){

        System.out.println("1_ TP Intro");
        System.out.println("Insert TP number: ");
        return scanner.nextInt();
    }
    private static void StartTP(int tpNumber)
    {
        switch (tpNumber)
        {
            case 1:
                new TpIntro().StartTP();
                break;
            default:
                System.out.println("That TP does not exist");
                break;
        }
    }
}

