package lab3.tpintro.exercises.exercise5;

import lab3.tpintro.TpIntro;

public class Exercise5 extends TpIntro {
    public static void main(String[] args)
    {
        int B = 5;
        System.out.println("B = " + B);
        String response = IsEven(B) ? "even" : "odd";
        System.out.println(B + " is an " + response + " number");
    }
}
