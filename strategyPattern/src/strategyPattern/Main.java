
// strategy design pattern for shopping cart where 3 payment strategies are used---creditCard, PayPal, BitCoin 
// create an interface for strategy pattern


package strategyPattern;
import java.util.*;

interface PaymentProcessor
{
	void pay(int amt);
}

class Creditcard implements PaymentProcessor
{
	Scanner sc = new Scanner(System.in);
	
	String name, Expdate;
	double cardNo;
	
	Creditcard()
	{
		super(); // calling parent class constructor
		System.out.println("==============================================");
		
		System.out.println("\nEnter card holder name: ");
		this.name = sc.next();
		
		System.out.println("\nEnter card number: ");
		this.cardNo = sc.nextDouble();
		
		System.out.println("\nEnter card Expire day: ");
		this.Expdate = sc.next();
		
		System.out.println("==============================================");
		
	}

	@Override
	public void pay(int amt) 
	{
		System.out.println("==============================================");
		
		System.out.println("Paying through Credit Card Payment : Charging $" + amt);
		
	}
	
}
class Paypal implements PaymentProcessor
{
	Paypal()
	{
		super();
		
		System.out.println("Checking Internet connection....");
	}
	@Override
	public void pay(int amt) 
	{
		System.out.println("==============================================");
		
		System.out.println("Paying through PayPal Payment : Charging $" + amt);
		System.out.println("==============================================");
		
	}
	

}

class Bitcoin implements PaymentProcessor
{
	Scanner sc = new Scanner(System.in);
	
	String add;
	
	Bitcoin()
	{
		super();
		System.out.println("Enter Transaction: 'Input Address' :: ");
		add = sc.next();
	}

	@Override
	public void pay(int amt) 
	{
		System.out.println("==============================================");
		
		System.out.println("Paying through Bitcoin Payment : Charging $" + amt);
		System.out.println("==============================================");
		
	}
	
}

class Order
{
	private final PaymentProcessor paymentP ;
	private final int amt;
	
	public Order(int amt, PaymentProcessor paymentP)
	{
		this.amt = amt;
		this.paymentP = paymentP;
	}
	
	public void process()
	{
		paymentP.pay(amt);
	}
}

public class Main
{
	public static void main(String args[])
	{
		int ch, amt=0;
		Order o;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println();
			
			System.out.println("\n*********SHOPPING CART***********");
			
			System.out.println("\n1.Credit Card");
			System.out.println("\n2.PayPal");
			System.out.println("\n3..BitCoin");
			System.out.println("\n4.Exit");
			
			System.out.println("\nEnter the Choice :: ");
			ch = sc.nextInt();
			
			System.out.println("==============================================");
			
			if(ch == 1 || ch == 2 || ch == 3)
			{
				System.out.println("\nEnter amount to be Transfer :: ");
				amt = sc.nextInt();
				
				System.out.println("==============================================");
			}
			
			switch(ch)
			{
				case 1:
					o = new Order(amt, new Creditcard());
					o.process();
					break;
					
				case 2:
					o = new Order(amt, new Paypal());
					o.process();
					break;
					
				case 3:
					o = new Order(amt, new Bitcoin());
					o.process();
					break;
				
				case 4:
					System.out.println("Thankyou For Shopping !!!!!!");
					System.out.println("==============================================");
					return;
					
				default:
					System.out.println("Invalid Payment mode !!!!");
					
					System.out.println("==============================================");
				
			}
			
		}
		
	}
}