package lab3.tpobjects3.exercises.exercise3.models;

public class Square extends Rectangle{

    public Square(Double height, String color) {
        this.height = height;
        this.width = height;
        this.color = color;
    }

    public Square(Double height) {
        this.height = height;
        this.width = height;
    }

    public Square() {
    }

    @Override
    public String toString()
    {
        return "Square[Height= " + this.height + ", Width= " + this.width + (this.color != "" ? ", Color= " + this.color : "") + "]";
    }
}
