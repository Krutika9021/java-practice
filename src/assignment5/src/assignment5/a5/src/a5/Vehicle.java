package a5;

import java.util.Scanner; 
interface Vehicle 
{
    void gearChange(int a);
    void speedUp();
    void applyBrakes();
    void display();
}

class Bicycle implements Vehicle
{
    int gear, speed;

    Bicycle()
    {
        System.out.println("\tBicycle started successfully\n");
        gear = 1;
        speed = 10;
    }

    public void gearChange(int x) 
    {
        if (x > 0 && x < 7) 
        {
            gear = x;
            System.out.println("\tGear changed Successfully\n\t Current Gear Is " + gear);
        }
        else
            System.out.println("Gear is Out Of Range \n");
    }

    public void speedUp() 
    {
        if ((speed + 5) < 50) 
        {
            speed += 5;
            System.out.println("\n\tBicycle's speed increased\n\t current speed is " + speed);
        }
        else
            System.out.println("Speed Cannot Be Increased Above 50 Km/hr\n");
    }

    public void applyBrakes() 
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("1. DECREASE SPEED\n2. STOP BICYCLE\n");

        x = sc.nextInt();

        if (x == 1)
            if ((speed - 5) > 0)
            {
                speed -= 5;
                System.out.println("Speed Reduced Successfully\n\tCurrent speed is " + speed + " Km/hr \n");
            } 
            else 
            {
                speed = 0;
                gear = 0;
                System.out.println("Bicycle stopped Successfully\n ");
            }

        if (x == 2) 
        {
            speed = 0;
            gear = 0;
            System.out.println("Bicycle stopped Successfully\n");
        }
    }

    public void display() 
    {
        System.out.println("YOUR BICYCLE'S SPEED IS " + speed + " Km/hr AND GEAR IS " + gear);
    }
}

class Car implements Vehicle
{
    int gear, speed;

    Car() 
    {
        System.out.println("\tCar started successfully\n ");
        gear = 1;
        speed = 10;
    }

    public void gearChange(int x) 
    {
        if (x > 0 && x < 7) {
            this.gear = x;
            System.out.println("\tGear changed Successfully\n\t Current Gear is " + gear);
        } else
            System.out.print(" Gear Out Of Range \n");
    }

    public void speedUp() 
    {
        if ((speed + 20) < 150)
        {
            speed += 20;
            System.out.println("Car's speed increased \n\tCurrent speed is " + speed + " Km/hr\n");
        } else
            System.out.println("Speed Cannot Be Increased Above 150 Km/hr\n");
    }

    public void applyBrakes() 
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("1. TO DECREASE SPEED\n2. TO STOP CAR\n");

        x = sc.nextInt();
        if (x == 1)
            if ((speed - 20) > 0)
            {
                speed -= 20;
                System.out.println("Speed Reduced Successfully \n\tCurrent Speed Is " + speed + " km/hr\n");
            } else {
                speed = 0;
                gear = 0;
                System.out.println("Car stopped Successfully\n ");
            }

        if (x == 2)
        {
            speed = 0;
            gear = 0;
            System.out.println("Car stopped Successfully \n");
        }
    }

    public void display()
    {
        System.out.println("YOUR CAR'S SPEED IS " + speed + " Km/hr AND GEAR IS " + gear + "\n");
    }
}

class Bike implements Vehicle
{
    int gear, speed;

    Bike()
    {
        System.out.println("\tBike started successfully \n");

        gear = 1;
        speed = 10;
    }

    public void gearChange(int x)
    {
        if (x > 0 && x < 6)
        {
            gear = x;
            System.out.println("\tGear changed Successfully\n\t Current Gear IS " + gear);
        } else
            System.out.println("Gear out of range \n");
    }

    public void speedUp()
    {
        if ((speed + 20) < 100) {
            speed += 20;
            System.out.println("Bike's speed increased \n\tCurrent speed is " + speed + " Km/hr.\n");
        } else
            System.out.println("Speed Cannot Be Increased Above 100 Km/hr \n");
    }

    public void applyBrakes() {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("1. TO DECREASE SPEED\n2. TO STOP BIKE\n");

        x = sc.nextInt();
        if (x == 1)
            if ((speed - 20) > 0)
            {
                speed -= 20;
                System.out.println("Speed Reduced Successfully\n\tCurrent speed is " + speed + " km/hr\n");
            } 
            else
            {
                speed = 0;
                gear = 0;

                System.out.println("Bike stopped Successfully\n ");
            }

        if (x == 2)
        {
            speed = 0;
            gear = 0;
            System.out.println("Bike stopped Successfully \n");
        }
    }

    public void display() 
    {
        System.out.println("YOUR BIKE'S SPEED IS " + speed + " Km/hr AND GEAR IS " + gear + "\n");
    }
}

class VehicleExample {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        Vehicle v = null;

        System.out.println("=============================================");
        int y;
        bb:
        do {
            System.out.print(
                    " SELECT VEHICLE \n\t1.BICYCLE\n\t2.CAR \n\t3.BIKE \n\t4.Exit \nChoice::");
            y = sc.nextInt();

            System.out.println("=============================================");

            if (y == 1)
                v = new Bicycle();
            else if (y == 2)
                v = new Car();
            else if (y == 3)
                v = new Bike();
            else if (y == 4)
                break bb;
            else
                System.out.println("INVALID INPUT");

            System.out.println("=============================================");

            if (y > 0 && y < 4) {
                aa:
                do {
                    System.out.print(" \tPress 1. Speed Up\n\tPress 2. Change gear \n\tPress 3. Apply Brakes "
                            + "\n\tPress 4. Display Vehicle Status \n\tPress 5. Change Vehicle /Exit \nChoice::");
                    int z = sc.nextInt();

                    System.out.println("=============================================");

                    switch (z) {
                        case 1:
                            v.speedUp();
                            System.out.println("=============================================");
                            break;
                        case 2:
                            System.out.print("which gear you want?");
                            int a = sc.nextInt();
                            v.gearChange(a);
                            System.out.println("=============================================");
                            break;
                        case 3:
                            v.applyBrakes();
                            System.out.println("=============================================");
                            break;
                        case 4:
                            v.display();
                            System.out.println("=============================================");
                            break;
                        case 5:
                            break aa;
                        default:
                            System.out.println("Invalid Input");
                    }
                } while (true);
            }

        } while (y != 4);
    }
}
