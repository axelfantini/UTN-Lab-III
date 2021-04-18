package lab3.tpobjects3.exercises.exercise1.models;

public class Circle {
    protected String color = "red";
    protected Double radius = 1.0;

    public Circle(String color, Double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Circle() {

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea()
    {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString()
    {
        return "Circle[Color= "+ this.color +", Radius= "+ this.radius +"]";
    }
}
