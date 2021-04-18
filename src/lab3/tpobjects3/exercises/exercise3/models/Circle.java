package lab3.tpobjects3.exercises.exercise3.models;

public class Circle extends Figure{
    private Double radius = 1.0;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    @Override
    public Double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    private Double getDiameter()
    {
        return radius * 2;
    }

    @Override
    public Double getPerimeter() {
        return this.getDiameter() * Math.PI;
    }

    @Override
    public String toString()
    {
        return "Circle[Radius= " + this.radius + (this.color != "" ? ", Color= " + this.color : "") + "]";
    }
}
