package vehicle;

import java.util.*;

interface vehicle
{
	void gearChange(int a);
	void speedUp();
	void applyBreaks();
	void display();
	
	
}

class Bicycle implements vehicle
{

	int gear, speed;
	Scanner sc = new Scanner(System.in);
	
	Bicycle()
	{
		System.out.println("\tBicycle has started successfully\n");
		gear= 1;
		speed = 10;
	}
	@Override
	public void gearChange(int x) 
	{
		
		if(x>0 && x<7)
		{
			gear = x;
			System.out.println("\tGear changed successfully\n\t Current gear is "+ gear);
		}
		else
		{
			System.out.println("Gear is out of range\n");
		}
	}

	@Override
	public void speedUp() 
	{
		if((speed + 5) < 50)
		{
			speed += 5;
			System.out.println("\n\tBicyle's speed increased\n\t current speed is "+speed);
		}
		else
		{
			System.out.println("Speed cannot be increased above 50 km/hr \n");
		}
	}

	@Override
	public void applyBreaks() 
	{
		
		int x;
		
		System.out.println("1.Decrease speed \n2.Stop bicycle\n");
		x = sc.nextInt();
		
		if(x == 1)
		{
			if ((speed - 5) > 0)
			{
				speed -= 5;
				System.out.println("Speed Reduced Successfully\n\tCurrent speed is " + speed + " Km/hr \n"); 
			}
			else
			{
				speed = 0;
				gear = 0;
				System.out.println("Bicycle stopped successfully\n"); 
			}
		}
		
		if (x == 2)
		{
			speed = 0;
			gear = 0;
			System.out.println("Bicycle stopped successfully\n"); 
		}
	}

	@Override
	public void display() 
	{
		
		System.out.println("Your bicycle speed is " + speed + "km/hr And gear is "+ gear);
	}
	
}

class Car implements vehicle
{

	int gear,speed;
	Scanner sc = new Scanner(System.in);
	
	Car()
	{
		gear = 1;
		speed = 10;
		
		System.out.println("Car has started successfully\n");
	}
	
	@Override
	public void gearChange(int x) 
	{
		
		if(x > 0 && x < 7)
		{
			this.gear = x;
			System.out.println("Gear changed successfully\n\t Current gear is "+gear);
		}
		else
		{
			System.out.println("Gear is out of range\n");
		}
		
	}

	@Override
	public void speedUp() 
	{
		if((speed + 20) < 150 )
		{
			speed += 20;
			System.out.println("Speed Reduced Successfully\n\tCurrent speed is " + speed + " Km/hr \n");
		}
		else
		{
			System.out.println("Speed cannot be increased above 150 km/hr \n");
		}	
	}

	@Override
	public void applyBreaks() 
	{
		int x;
		
		System.out.println("\n1.Decrease speed \n2.Stop car\n");
		x = sc.nextInt();
		
		if(x == 1)
		{
			if((speed - 20) > 0)
			{
				speed -= 20;
				System.out.println("Speed reduced successfully \n\t Current speed is "+ speed + "km/hr \n");
			}
			else
			{
				speed = 0;
				gear = 0;
				System.out.println("Car stopped successfully \n");
			}
		}
		
		if (x == 2)
		{
			speed = 0;
			gear = 0;
			System.out.println("Car stopped successfully \n");
		}
		
	}

	@Override
	public void display() 
	{
		System.out.println("Your Car speed is " + speed + "km/hr And gear is "+ gear);
		
	}
	
}

class Bike implements vehicle
{
	int gear, speed;
	Scanner sc = new Scanner(System.in);
	
	Bike()
	{
		gear = 1;
		speed = 10;
		System.out.println("Bike started successfully !!");
		
	}

	@Override
	public void gearChange(int x) 
	{
		if(x > 0 && x < 6)
		{
			System.out.println("Gear is changed successfully !!");
		}
		else
		{
			System.out.println("Gear is out of range !!");
		}
		
	}

	@Override
	public void speedUp() 
	{
		if ((speed + 20) < 100)
		{
			speed += 20;
			System.out.println("Speed increased successfully \n\t Current speed is " + speed);
		}
		else
		{
			System.out.println("Speed Cannot Be Increased Above 100 Km/hr \n"); 
		}	
	}

	@Override
	public void applyBreaks()
	{
		int x;
		System.out.println("\\n1.Decrease speed \\n2.Stop car\\n");
		x = sc.nextInt();
		
		if(x == 1)
		{
			if((speed - 20) > 0)
			{
				speed -= 20;
				System.out.println("Speed reduced successfully\n\t Current speed is" + speed + " Km/hr \n"); 
			}
			else
			{
				speed = 0;
				gear = 0;
				System.out.println("Bike stopped successfully\n"); 
			}
			
		}
		if(x == 2)
		{
			speed = 0;
			gear = 0;
			System.out.println("Bike stopped successfully\n"); 
		}
		
	}

	@Override
	public void display() 
	{
		System.out.println("Your Car speed is " + speed + "km/hr And gear is "+ gear);	
	}
	
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		vehicle v = null;
		
		System.out.println("======================================================");
		
		int ch;
		bb:
			do
			{
				System.out.println("SELECT VEHICLE");
				System.out.println("1. Bicycle ");
				System.out.println("2. Car ");
				System.out.println("3. Bike ");
				System.out.println("4. Exit");
				
				System.out.println("Enter Choice : ");
				
				ch = sc.nextInt();
				
				System.out.println("======================================================");
				
				if(ch == 1)
				{
					v = new Bicycle();
				}
				else if(ch == 2)
				{
					v = new Car();
				}
				else if(ch == 3)
				{
					v = new Bike();
				}
				else
				{
					System.out.println("---------END--------");
					
				}
				
				System.out.println("======================================================");
				
				if (ch > 0 && ch < 4)
				{
					aa:
						do
						{
							System.out.println("\t PRESS");
							System.out.println("1. Speed up");
							System.out.println("2. Change Gear");
							System.out.println("3. Apply brakes");
							System.out.println("4. Display vehicle status");
							System.out.println("5. Exit");
							
							System.out.println("Enter choice : ");
							int choice = sc.nextInt();
							
							switch(choice)
							{
							case 1:
								v.speedUp();
								break;
							case 2:
								System.out.println("Which gear you want ? ");
								int a = sc.nextInt();
								v.gearChange(a);
								break;
							case 3:
								v.applyBreaks();
								break;
							case 4:
								v.display();
								break;
							case 5:
								break aa;
								
							default:
								System.out.println("Invalid input!!!");
							}
						}
						while(true);
				}
			}
			while(ch != 4);
		
	}
}