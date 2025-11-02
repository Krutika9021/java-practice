package assignment9;

import java.sql.SQLOutput;
import java.util.*;

public class Bag 
{
	private String color;
	private double weight;
	
	private static double total_weight;
	private static double total_objects;
	
	Scanner sc = new Scanner(System.in);
	
	public Bag()
	{
		color= "green";
		weight = 12.7;
		total_objects++;
		total_weight = total_weight+weight;
	}
	
	public Bag(String Col, double Wtg)
	{
		color= Col;
		weight = Wtg;
		total_objects++;
		total_weight = total_weight+weight;
	}
	
	public Bag(String Col)
	{
		color= Col;
		weight = 12.7;
		total_objects++;
		total_weight = total_weight+weight;
	}
	public Bag(double Wtg)
	{
		color= "green";
		weight = Wtg;
		total_objects++;
		total_weight = total_weight+weight;
	}
	public void display(Bag bags[])
	{
		System.out.println("DISPLAY");
		
		for(int i = 0; i<total_objects; i++)
		{
			System.out.println((i+1)+"."+"Color: "+ bags[i].color + " and " + "weight is "+bags[i].weight + "kg.");
			
		}
		System.out.println("total weight = "+total_weight);
		System.out.println("total number of objects = "+total_objects);
	}
	public static double getTotalObjects()
	{
		return total_objects;
	}
	public void delete()
	{
		total_weight = total_weight - this.weight;
		total_objects--;
	}
}

