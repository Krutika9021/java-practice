package complex;
import java.util.*;
class Complex
{
	float real, img;
	
	public Complex()    // default constructor
	{
		real = 0;
		img = 0;
	}
	
	public Complex(float a, float b)
	{
		real = a;
		img = b;
	}
	
	public void display(Complex x, Complex y)
	{
		System.out.println("First Complex numbers : " + x.real + " + " + x.img);
		System.out.println("Second Complex numbers : " + y.real + " + " + y.img);
	}
	
	public void add(Complex x, Complex y)
	{
		float real,img;
		real = (x.real + y.real);
		img = (x.img + y.img);
		System.out.println("Addition of two complex numbers are: " + real + "+" + img +"i");
		
	}
	
	public void subtract(Complex x, Complex y)
	{
		float real,img;
		real = (x.real - y.real);
		img = (x.img - y.img);
		System.out.println("Subtraction of two complex numbers are: " + real + "+" + img +"i");
		
	}
	
	public void Multiply(Complex x, Complex y)
	{
		float real,img;
		real = (x.real * y.real - x.img * y.img);
		img = (x.real * y.real + x.img * y.img);
		System.out.println("Multiplication of two complex numbers are: " + real + "+" + img +"i");
		
	}
	
	
	public void divide(Complex x, Complex y)
	{
		float real,img;
		real = (x.real*y.real + x.img*y.img)/ (y.real* y.real + y.img* y.img) ;
		img = (x.real*y.real - x.img*y.img)/ (y.real* y.real + y.img*y.img);
		System.out.println("Division of two complex numbers are: " + real + "+" + img +"i");
	}
}

public class Main
{
	public static void main(String args[])
	{
		float num1, num2;
		Complex cal = new Complex();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the real part of first number : a : ");
		num1 = sc.nextFloat();
		System.out.println("Enter the img part of first number : b : ");
		num2 = sc.nextFloat();
		
		Complex c1 = new Complex(num1, num2);
		
		System.out.println("Enter the real part of second number : a : ");
		num1 = sc.nextFloat();
		System.out.println("Enter the img part of second number : b : ");
		num2 = sc.nextFloat();
		
		Complex c2 = new Complex(num1, num2);
		
		System.out.println("\n");
		
		cal.display(c1, c2);
		
		System.out.println("\n");
	
		
		int choice;
        do {
            System.out.println("\nChoose operation  ");
            System.out.println("1. Addition : ");
            System.out.println("2. Subtraction : ");
            System.out.println("3. Multiplication : ");
            System.out.println("4. Division : ");
            System.out.println("5. Exit : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cal.add(c1, c2);
                    break;
                case 2:
                    cal.subtract(c1, c2);
                    break;
                case 3:
                    cal.Multiply(c1, c2);
                    break;
                case 4:
                    cal.divide(c1, c2);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice !!");
            }
        } while (choice != 5);
    }
}