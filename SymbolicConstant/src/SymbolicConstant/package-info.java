package SymbolicConstant;
import java.util.*;

class Example
{
	public static final int MAX=10;
	public static void main(String args[])
	{
		int arr[] = new int[MAX];
		for(int i = 0; i<MAX; i++)
		{
			arr[i] = i*2;
		}
		System.out.println("Array : ");
		for(int i=0; i<MAX; i++)
		{
			System.out.println(arr[i]+ "   ");
			
		}
		System.out.println();
	}
}