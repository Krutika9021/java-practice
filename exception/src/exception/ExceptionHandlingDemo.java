package exception;
import java.util.*;

public class ExceptionHandlingDemo 
{
	public static void main(String args[])
	{
		int numerator, denominator,result;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter numerator : ");
			numerator = sc.nextInt();
			
			System.out.println("Enter denomenator");
			denominator = sc.nextInt();
			
			result = numerator/denominator;
			System.out.println("Result of division : " + result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error: Division by zero is not allowed.");
		}
		
		
		
		try
		{
			System.out.println("Enter the size of the array : ");
			int size = sc.nextInt();
			
			int arr[] = new int[size];
			
			
			System.out.println("Enter elements of the array : ");
			for(int i=0; i<size; i++)
			{
				System.out.println("Enter the element at index " + i);
				arr[i] = sc.nextInt();
				
			}
			System.out.println("Enter the index to retrieve form array : ");
			int index = sc.nextInt();
			
			int value = arr[index];
			System.out.println("Value at index :  " + index + ":" + value);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("Error: Index out of bounds. Please enter a valid index.");
		}
		sc.close();
	}
}