package prime;

public class Prime 
{
    public static void main(String[] args)
    {
        int i;
        int n = 29;
        boolean status = false;
        for(i = 2; i <= n/2; i++)
        {
            if(n%i == 0)
            {
                status = true;
                break;
            } 
        }
         if (!status)
    System.out.println(n + " is prime number.");
    else
    System.out.println(n + " is not prime number.");
    }
}
