package assignment9;
import java.util.*;

import assignment9.Bag;
public class Main 
{

	public static void delete(Bag bags[])
	{
		Scanner gg= new Scanner(System.in);

		int del;

		System.out.println("Enter the serial number to be deleted: ");

		del = gg.nextInt(); 

		for (int i=del -1; i < bags.length; i++)
		{ 
			if(i+1< bags.length) 
			{

				bags[i]=bags [i+1];
			}
		}
		bags[bags.length-1]=null;
	}
	public static void main(String arg[]) 
	{
		Bag obj[] = new Bag [10];
		Scanner gg = new Scanner(System.in);
		int input = -1;
		while (input != 4) 
		{
			System.out.println("MENU"); 
			System.out.println("1. Add"); 
			System.out.println("2. display"); 
			System.out.println("3. delete"); 
			System.out.println("4. Exit"); 
			System.out.println("Enter your choice: ");
			input = gg.nextInt();
			switch (input) 
			{
				case 0:
					break;
				case 1: 
					int input1;
					double wtg;
					String col;
					System.out.println("1. Use default values");
					System.out.println("2. Enter color with default weight"); 
					System.out.println("3. Enterweight with default color"); 
					System.out.println("4. Enter weight and color");

					input1 =gg.nextInt();
					switch(input1)
					{
						case 1:
							obj[Bag.get_total_objects()] = new Bag(); 
								break;
						case 2:
							col=gg.next();
							obj[Bag.get_total_objects()] = new Bag(col); 
							break;

						case 3:
							wtg gg.nextDouble();
							obj[Bag.
							get_total_objects()] = new Bag (wtg);
							break;

						case 4:
							wtg=gg.nextDouble();
							col=gg.next();
							obj[Bag.get_total_objects()] = new Bag(col, wtg);
							break;
							}
					break;
				
			case 2:
				if(Bag.get_total_objects()<1);
					System.out.println("NO records available");

				else
					obj[Bag.get_total_objects()-1].display(obj);

			}
		}
}
