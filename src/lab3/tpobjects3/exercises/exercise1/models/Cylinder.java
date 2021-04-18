package lab3.tpobjects3.exercises.exercise1.models;

public class Cylinder extends Circle{
    private Double height = 1.0;

    public Cylinder(String color, Double radius, Double height) {
        this.color = color;
        this.radius = radius;
        this.height = height;
    }

    public Cylinder() {
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getVolume()
    {
        return height * super.getArea();
    }

    @Override
    public Double getArea()
    {
        return (Math.PI * 2) * this.radius * height + super.getArea() * 2;
    }

    public Double getBaseArea()
    {
        return super.getArea();
    }

    @Override
    public String toString()
    {
        return "Cylinder: subclass from " + super.toString() + " height= " + this.height;
    }
}
