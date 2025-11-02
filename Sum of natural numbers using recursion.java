package addnumbers;

public class AddNumbers
{
    public static void main(String[] args)
    {
        int n = 10;
        int sum = AddNumbers(n);
        System.out.println(" Sum = " + sum);
    }
    public static int AddNumbers(int n)
    {
        if (n != 0)
            return n  + AddNumbers(n-1);
        else  
            return n;
    }
    
}
