package lab3.tpobjects3.exercises.exercise3.models;

public class Rectangle extends Figure{

    protected Double height = 1.0;
    protected Double width = 1.0;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Double height, Double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Rectangle() {
    }

    @Override
    public Double getArea() {
        return width * height;
    }

    @Override
    public Double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString()
    {
        return "Rectangle[Height= " + this.height + ", Width= " + this.width + (this.color != "" ? ", Color= " + this.color : "") + "]";
    }
}
