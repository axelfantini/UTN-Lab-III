package lab3.tpintro.exercises.exercise7;
import lab3.tpintro.TpIntro;
public class Exercise7 extends TpIntro {
    public static void main(String[] args) {
        int C = 57;
        String positive = C == 0 ? "neutral" : (IsPositive(C) ? "positive" : "negative");
        System.out.println(C + " is a " + positive + " number");
        String even = IsEven(C) ? "even" : "odd";
        System.out.println(C + " is an " + even + " number");
        String multipleOf5 = IsMultiple(C, 5) ? "a multiple" : "not a multiple";
        System.out.println(C + " is " + multipleOf5 + " of " + 5);
        String multipleOf10 = IsMultiple(C, 10) ? "a multiple" : "not a multiple";
        System.out.println(C + " is " + multipleOf10 + " of " + 10);
        String greater = C > 100 ? "greater" : "less";
        System.out.println(C + " is " + greater + " than " + 100);
    }

    public static boolean IsMultiple(int number, int multiple) { return number % multiple == 0; }
}
