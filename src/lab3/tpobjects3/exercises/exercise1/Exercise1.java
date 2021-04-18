package lab3.tpobjects3.exercises.exercise1;

import lab3.tpobjects3.exercises.exercise1.models.Cylinder;
public class Exercise1 {
    public static void main(String[] args)
    {
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder base area: " + cylinder.getBaseArea());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println("Cylinder area: " + cylinder.getArea());
        System.out.println(cylinder.toString());

        Cylinder cylinder2 = new Cylinder("blue", 3.0, 4.0);
        System.out.println("Cylinder2 radius: " + cylinder2.getRadius());
        System.out.println("Cylinder2 height: " + cylinder2.getHeight());
        System.out.println("Cylinder2 base area: " + cylinder2.getBaseArea());
        System.out.println("Cylinder2 volume: " + cylinder2.getVolume());
        System.out.println("Cylinder2 area: " + cylinder2.getArea());
        System.out.println(cylinder2.toString());

    }
}
