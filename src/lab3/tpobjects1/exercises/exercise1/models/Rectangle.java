package lab3.tpobjects1.exercises.exercise1.models;

public class Rectangle {
    private double Height = 1.0;
    private double Width = 1.0;

    public Rectangle()
    {
    }

    public Rectangle(double height, double width)
    {
        this.Height = height;
        this.Width = width;
    }

    public double GetHeight() {
        return Height;
    }
    public void SetHeight(double height) {
        this.Height = height;
    }
    public double GetWidth() {
        return Width;
    }
    public void SetWidth(double width) {
        this.Width = width;
    }

    public double GetPerimeter()
    {
        return 2 *(this.Height + this.Width);
    }

    public double GetArea()
    {
        return this.Height * this.Width;
    }

}
