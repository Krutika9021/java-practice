package a6;
import java.util.*;

class ExceptionHandling
{
	void arithmeticEx()
	{
		int n1,n2;
		double c;
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		
		while(!valid)
		{
			try
			{
				System.out.println("Enter first number : ");
				n1 = sc.nextInt();
				System.out.println("Enter second number : ");
				n2 = sc.nextInt();
				c = n1/n2;
				System.out.println("Division is : "+c);
				valid = true;
			}
			catch(ArithmeticException e)
			{
				System.out.println("\t Cannot divide by zero...Enter again");
			}
		}
	}
	
	void arrayOutOfBoundEx(int arr[])
	{
		int index;
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		
		while(!valid)
		{
			try
			{
				System.out.println("Enter index number : ");
				index = sc.nextInt();
				System.out.println(arr[index] + " is present at given index");
				valid = true;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				 System.out.println("\t Invalid index....Please enter valid index");
			}
		}
	}
	
	void numberFormatEx()
	{
		String n1,n2;
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		
		while(!valid)
		{
			try
			{ 
				 System.out.println("Enter first number : ");
				 n1 = sc.next();
				 System.out.println("Enter second number : ");
				 n2 = sc.next();
				 
				 a = Integer.parseInt(n1);
				 b = Integer.parseInt(n2);
				 
				 System.out.println("Entered numbers are integers : "+a + " " + b);
				 valid = true;
			}
			catch(NumberFormatException e)
			{
				System.out.println("\t Entered values are not integers...Please enter integer");
			}
		}
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		ExceptionHandling e = new ExceptionHandling();
		int n;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter choice : "
					+ "\n\t 1.ArithmeticException"
					+ "\n\t 2.ArrayIndexOutOfBoundsException"
					+ "\n\t 3.NumberFormatException"
					+ "\n\t 4.Exit");
			n = sc.nextInt();
			
			switch(n)
			{
				case 1:
					e.arithmeticEx();
					System.out.println("====================================================================");
					break;
					
				case 2:
					int arr[] = {1,2,3,4,5};
					e.arrayOutOfBoundEx(arr);
					System.out.println("====================================================================");
					break;
				
				case 3:
					e.numberFormatEx();
					System.out.println("====================================================================");
					break;
				
				case 4:
					n=0;
					System.out.println("====================================================================");
					break;
					
				default:
					System.out.println("Invalid input");
			}
		}
		while(n != 0);
	}
}