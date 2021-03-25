package lab3.tpintro.exercises.exercise6;
import lab3.tpintro.TpIntro;
public class Exercise6 extends TpIntro {
    public static void main(String[] args) {
        int B = 4;
        System.out.println("B = " + B);
        String response = B == 0 ? "neutral" : (IsPositive(B) ? "positive" : "negative");
        System.out.println(B + " is a " + response + " number");
    }
}
