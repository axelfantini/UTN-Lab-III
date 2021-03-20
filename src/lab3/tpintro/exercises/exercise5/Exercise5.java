package lab3.tpintro.exercises.exercise5;

import lab3.tpintro.TpIntro;

public class Exercise5 extends TpIntro {
    public void StartExercise() {
        int B = 5;
        System.out.println("B = " + B);
        String response = IsEven(B) ? "even" : "odd";
        System.out.println(B + " is an " + response + " number");
    }
}
