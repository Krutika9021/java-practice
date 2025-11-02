package abstractMethod;

abstract class Shape 
{
    abstract void computeArea(); // Abstract method to compute the area

}

class Circle extends Shape 
{
    private double radius;

    // Constructor for Circle
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    void computeArea() 
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape 
{
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    void computeArea() 
    {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeDemo 
{
    public static void main(String[] args) 
    {
        // Using dynamic binding to create objects of different shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Calling computeArea using dynamic binding
        circle.computeArea();
        rectangle.computeArea();
    }
}
