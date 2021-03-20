package lab3.tpintro.exercises.exercise5;
public class Exercise5 {
    public void StartExercise() {
        int B = 5;
        System.out.println("B = " + B);
        String response = IsEven(B) ? "even" : "odd";
        System.out.println(B + " is an " + response + " number");
    }

    private boolean IsEven(int number) {
        return number % 2 == 0;
    }

}
