package lab3.tpobjects3.exercises.exercise3;

import lab3.tpobjects3.exercises.exercise3.models.Circle;
import lab3.tpobjects3.exercises.exercise3.models.Rectangle;
import lab3.tpobjects3.exercises.exercise3.models.Square;

public class Exercise3 {
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(5.0, "red");
        Circle circle2 = new Circle(3.5);
        Rectangle rectangle1 = new Rectangle(4.0, 5.4);
        Rectangle rectangle2 = new Rectangle(3.1, 7.3, "blue");
        Square square1 = new Square(3.1, "green");
        Square square2 = new Square(7.5);
        System.out.println(circle1.toString());
        System.out.println("Circle1 Area: " + circle1.getArea());
        System.out.println("Circle1 Perimeter: " + circle1.getPerimeter());
        System.out.println(circle2.toString());
        System.out.println("Circle2 Area: " + circle2.getArea());
        System.out.println("Circle2 Perimeter: " + circle2.getPerimeter());
        System.out.println(rectangle1.toString());
        System.out.println("Rectangle1 Area: " + rectangle1.getArea());
        System.out.println("Rectangle1 Perimeter: " + rectangle1.getPerimeter());
        System.out.println(rectangle2.toString());
        System.out.println("Rectangle2 Area: " + rectangle2.getArea());
        System.out.println("Rectangle2 Perimeter: " + rectangle2.getPerimeter());
        System.out.println(square1.toString());
        System.out.println("Square1 Area: " + square1.getArea());
        System.out.println("Square1 Perimeter: " + square1.getPerimeter());
        System.out.println(square2.toString());
        System.out.println("Square2 Area: " + square2.getArea());
        System.out.println("Square2 Perimeter: " + square2.getPerimeter());
    }
}
