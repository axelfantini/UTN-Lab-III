package lab3.tpintro.exercises.exercise6;

public class Exercise6 {
    public void StartExercise() {
        int B = 4;
        System.out.println("B = " + B);
        String response = B == 0 ? "neutral" : (IsPositive(B) ? "positive" : "negative");
        System.out.println(B + " is a " + response + " number");
    }

    private boolean IsPositive(int number)
    {
        return number > 0;
    }
}
