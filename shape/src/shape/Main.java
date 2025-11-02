package shape;
import java.util.Scanner;

abstract class Shape
{
    double dimension;

    abstract void computeArea();

    void inputDimensions() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension: ");
        dimension = scanner.nextDouble();
    }
}

class Triangle extends Shape 
{
    @Override
    void computeArea() 
    {
        double area = (Math.sqrt(3) / 4) * Math.pow(dimension, 2);
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape
{
    @Override
    void computeArea() 
    {
        double area = Math.pow(dimension, 2);
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape 
{
    @Override
    void computeArea() 
    {
        double area = Math.PI * Math.pow(dimension, 2);
        System.out.println("Area of Circle: " + area);
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int choice;
        Shape shape = null;

        do 
        {
            System.out.println("\nOptions:");
            System.out.println("1. Calculate Area of Triangle");
            System.out.println("2. Calculate Area of Rectangle");
            System.out.println("3. Calculate Area of Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    shape = new Triangle();
                    break;
                case 2:
                    shape = new Rectangle();
                    break;
                case 3:
                    shape = new Circle();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }

            if (choice != 4 && shape != null) 
            {
                shape.inputDimensions();
                shape.computeArea();
            }

        } 
        while (choice != 4);

        scanner.close();
    }
}
