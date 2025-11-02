package calculate_series;
import java.util.Scanner;

public class Calculate_series 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int num;
        double sum=0;
        System.out.println("Enter number of terms of series : ");
        num = console.nextInt();
        for(int i=1; i<=num; i++)
        {
            sum += 1.0/i;
        }
        System.out.println("sum : " + sum);
    }
    
}
