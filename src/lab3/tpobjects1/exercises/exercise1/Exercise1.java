package lab3.tpobjects1.exercises.exercise1;

import lab3.tpobjects1.exercises.exercise1.models.Rectangle;

import java.util.Scanner;

public class Exercise1 {
    public void StartExercise() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's create a rectangle");
        System.out.println("Insert height:");
        double height = sc.nextDouble();
        System.out.println("Insert width:");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Height: " + rectangle.GetHeight() + " Width: " + rectangle.GetWidth());
        System.out.println("Area: " + rectangle.GetArea() + " Perimeter: " + rectangle.GetPerimeter());

        System.out.println("Let's modify the rectangle");
        System.out.println("Insert height:");
        height = sc.nextDouble();
        rectangle.SetHeight(height);
        System.out.println("Insert width:");
        width = sc.nextDouble();
        rectangle.SetWidth(width);
        System.out.println("Area: " + rectangle.GetArea() + " Perimeter: " + rectangle.GetPerimeter());

        Rectangle rectangle2 = new Rectangle();
        System.out.println("New empty rectangle:");
        System.out.println("Height: " + rectangle2.GetHeight() + " Width: " + rectangle2.GetWidth());
        System.out.println("Area: " + rectangle2.GetArea() + " Perimeter: " + rectangle2.GetPerimeter());
    }
}
