package lab3.tpintro.exercises.exercise18;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the hours:");
        int hours = sc.nextInt();
        System.out.println("Insert the minutes:");
        int minutes = sc.nextInt();
        System.out.println("Insert the seconds:");
        int seconds = sc.nextInt();
        String valid = IsValidTime(hours, minutes, seconds) ? "valid" : "invalid";
        System.out.println(hours + ":" + minutes + ":" + seconds + " is a " + valid + " hour");
    }
    private static boolean IsValidTime(int hours, int minutes, int seconds)
    {
        return (hours < 24 && hours >= 0) && (minutes < 60 && minutes >= 0) && (seconds < 60 && seconds >= 0);
    }
}
