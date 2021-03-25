package lab3.tpobjects1.exercises.exercise5;

import lab3.tpobjects1.exercises.exercise5.models.Hour;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's create an hour");
        int hour;
        int minute;
        int second;
        do {
            System.out.println("Enter the hour:");
            hour = sc.nextInt();
            if(hour < 0 || hour >= 24)
                System.out.println("Invalid hour");
        }while(hour < 0 || hour >= 24);

        do {
            System.out.println("Enter the minutes:");
            minute = sc.nextInt();
            if(minute < 0 || minute >= 60)
                System.out.println("Invalid minutes");
        }while(minute < 0 || minute >= 60);

        do {
            System.out.println("Enter the seconds:");
            second = sc.nextInt();
            if(second < 0 || second >= 60)
                System.out.println("Invalid seconds");
        }while(second < 0 || second >= 60);

        Hour time = new Hour(hour, minute, second);
        System.out.println("Time:");
        time.PrintHour();
        System.out.println("Advance second:");
        time.advanceSecond().PrintHour();
        System.out.println("Back second:");
        time.backSecond().PrintHour();
    }
}
