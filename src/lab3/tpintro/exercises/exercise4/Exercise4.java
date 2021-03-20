package lab3.tpintro.exercises.exercise4;

public class Exercise4 {
    public void StartExercise()
    {
        int A = 2;
        int B = 4;
        int C = 1;
        int D = 9;
        int aux = B;
        System.out.println("A = " + A + " B = " + B + " C = " + C + " D = " + D);
        B = C;
        System.out.println("B = C = " + B);
        C = A;
        System.out.println("C = A = " + C);
        A = D;
        System.out.println("A = D = " + A);
        D = aux;
        System.out.println("D = B = " + D);
    }
}
