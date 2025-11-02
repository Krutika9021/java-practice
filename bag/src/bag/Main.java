package bag;
import java.util.*;

class Bag
{
	private double weight;
	private String color;
	static int total_objects;
	static double total_weight;
	
	public Bag()
	{
		weight = 10;
		color = "red";
		total_objects++;
		total_weight +=weight;
	}
	
	public Bag(double weight, String color)
	{
		this.weight = weight;
		this.color = color;
		total_objects++;
		total_weight +=weight;
	}
	
	public Bag(double weight)
	{
		this.weight=weight;
		color = "red";
		total_objects++;
		total_weight +=weight;
	}
	
	public Bag(String color)
	{
		weight = 20;
		this.color = color;
		total_objects++;
		total_weight +=weight;
	}
	
	
	public void display()
	{
		System.out.println("color = " + color +" " + "weight="+weight);
	}
	
	public static void output()
	{
		System.out.println("Total objects are: " + total_objects);
		System.out.println("Total weight is : " + total_weight);
	}
	
	public void delete(int rec, Bag a[])
	{
		int i;
		for(i=rec; i<total_objects; i++)
		{
			a[i-1] = a[i];
		
		}
		total_objects--;
		total_weight = total_weight-a[rec-1].weight;
	}	
}

public class Main
{
	public static void main(String args[])
	{
		String c;
		double w;
		int choice = 0;
		int ch;
		int n=0;
		int rec = 0;
		
		Bag a[] = new Bag[10];
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Display total weights and objects");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("1. Default Constructor");
					System.out.println("2. Parameterised Constructor");
					System.out.println("3. Parameterised color");
					System.out.println("4. parameterised weight");
					System.out.println("5. Exit");
					
					System.out.println("Enter your choice : ");
					ch = sc.nextInt();
					switch(ch)
					{
					
					case 1: 
					
						n = Bag.total_objects;
						a[n] = new Bag();
						break;
						
					case 2: 
						
						n = Bag.total_objects;
						System.out.println("Enter color");
						c = sc.next();
						System.out.println("Enter weight");
						w = sc.nextInt();
						a[n] = new Bag(w, c);
						break;
					case 3:
						n = Bag.total_objects;
						System.out.println("Enter color: ");
						c = sc.next();
						a[n] = new Bag(c);
						break;
					
					case 4:
						n = Bag.total_objects;
						System.out.println("Enter weight : ");
						w = sc.nextDouble();
						a[n] = new Bag(w);
						break;
					
					case 5:
						break;
					}
					break;
					
				case 2:
					int i;
					for(i=0; i<Bag.total_objects; i++)
					a[i].display();
					break;
					
				case 3:
					System.out.println("Enter Record you want to delete:");
					rec = sc.nextInt();
					a[n].delete(rec, a);
					break;
				case 4:
					Bag.output();
					break;
			}
		}
		while(choice != 5);
	}
}