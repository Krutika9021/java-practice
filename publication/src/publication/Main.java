package publication;
import java.util.*;
class Publication
{
	private String title;
	private int copies;
	private int price;;
	private int total;
	
	Scanner sc = new Scanner(System.in);
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setCopies(int copies)
	{
		this.copies = copies;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getCopies()
	{
		return copies;
	}
	
	public int getPrice()
	{
		return price;
	}
	public int getTotal()
	{
		return total;
	}
	
	public void readPub()
	{
		System.out.println("Enter title");
		title = sc.next();
		System.out.println("Enter price");
		price = sc.nextInt();
		System.out.println("Enter copies");
		copies = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println(title + "\t" + price + "\t" + copies);
	}
	
	void saleCopy(int num)
	{
		if (num <= copies) 
		{
	        copies -= num;
	        total += price * num;
	        System.out.println("You purchased " + num + " copies");
	        System.out.println("You have to pay: $" + (price * num));
	       
		}
		else
		{
			System.out.println("Insufficient Stock!!!!!!");
		}
	}
}
class Book extends Publication
{
	private String author;
	
	void orderCopies(int num)
	{
		int x = getCopies()+num;
		setCopies(getCopies()+num);
		
		System.out.println("\n\tOrder Successful");
		System.out.println("\n\tCopies Available");
	}
	
	void readBook()
	{
		readPub();
		System.out.println("Enter Author of book : ");
		author = sc.next();
	}
	void displaybook()
	{
		System.out.println("title \t price \t copy \t author");
		display();
		System.out.println("\t" + author);
	}
}

class Magazine extends Publication
{
	private int order_qty;
	private String issue_date;
	
	void recieveIssue(String new_issue_date)
	{
		System.out.println("Enter new copies order: ");
		order_qty = sc.nextInt();
		setCopies(order_qty);
		
		issue_date = new_issue_date;
		
		System.out.println("\nThe magazine " + getTitle()+ "\n\t with issue date" + issue_date );
	}
	
	void readMag()
	{
		readPub();
		System.out.println("The current issue date [dd/mm/yyyy]");
		issue_date = sc.next();
	}
	
	void displayMag()
	{
		System.out.println("title \t price \t copy \t author \t issue_date");
		display();
		System.out.println("\t" + issue_date);
	}
}
public class Main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		Magazine m = new Magazine();
		
		int outer = 0;
		do
		{
			System.out.println("Choose the following option............\n\n 1.Book \n 2.Magazine \n 3.Total sale amount \n4.Revenue of publiction\n\n");
			System.out.println("Choice :: ");

			int k = sc.nextInt();
			int a;
			aa:
				if(k==1)
				{
					do
					{
						int c;
						System.out.println("Menu For The BOOK : \n");
						System.out.println("\t 1.Read books \n\t2.display \n\t3.Sale Copies \n\t4.Order Copies");
						
						System.out.println("Choice :: ");
						c = sc.nextInt();
						
						switch(c)
						{
							case 1:
								System.out.println("======================================================================\n");
								b.readBook();
								System.out.println("======================================================================\n");
								break;
							case 2:
								System.out.println("======================================================================\n");
								b.display();
								System.out.println("======================================================================\n");
								break;
							case 3:
								System.out.println("======================================================================\n");
								System.out.println("How many copies do you(for customer) want ? ");
								int n1;
								n1 = sc.nextInt();
								b.saleCopy(n1);
								break;
							case 4:
								System.out.println("======================================================================\n");
								System.out.println("Enter the number of copies want to order (for shop)\n");
								int n2;
								n2 = sc.nextInt();
								b.orderCopies(n2);
								System.out.println("======================================================================\n");
								break;
								
							default:
								System.out.println("INVALID..");
							
						}
						System.out.println("Do You want to continue with the book section?[1/0] ");
						System.out.println("Choice:: ");
						a = sc.nextInt();
						
						if(a == 0)
							break aa;
					}
					while(a==1);
				}
				else if(k==2)
				{
					mm:
						do
						{
							int d;
							System.out.println("Menu For The Magazine : \n");
							System.out.println("\t 1.Read \n\t2.Display \n\t3.Sale Copies \n\t4.Recieve new issue\n");
							
							System.out.println("Choice :: ");
							d = sc.nextInt();
							
							switch(d)
							{
								case 1:
									System.out.println("======================================================================\n");
									m.readMag();
									System.out.println("======================================================================\n");
									break;
								case 2:
									System.out.println("======================================================================\n");
									m.display();
									System.out.println("======================================================================\n");
									break;
								case 3:
									System.out.println("======================================================================\n");
									System.out.println("How many copies do you(for customer) want ? ");
									int n3;
									n3 = sc.nextInt();
									m.saleCopy(n3);
									break;
								case 4:
									System.out.println("======================================================================\n");
									System.out.println("Enter the new issue date [dd/mm/yyyy] : )\n");
									String date = sc.next();
									m.recieveIssue(date);
									System.out.println("======================================================================\n");
									break;
									
								default:
									System.out.println("INVALID..");
									break;
							}
							System.out.println("Do You want to continue with the book section?[1/0] ");
							System.out.println("Choice:: ");
							a = sc.nextInt();
							
							if(a == 0)
								break mm;
						}
						while(a==1);
				}
				else if(k==3)
				{
					System.out.println("/nTotal sale amount is paid by customer = " + (b.getTotal()+m.getTotal()) + "");
				}
				else if (k==4)
				{
					System.out.println("\nTotal revenue of publication is : " + b.getCopies()*b.getPrice() + m.getCopies()*m.getPrice());
				}
				else
				{
					System.out.println("INVALID KEY......");
					
				}
		}
		while(outer!=0);
		sc.close();
	}
}
