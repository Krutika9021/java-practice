package fibonacci_numbers;

public class Fibonacci_numbers
{
    static void Fibonacci_numbers(int n)
    {
        int f1 = 0, f2 = 1, i;
        if (n < 1)
            return;
        System.out.format(f1+" ");
        for(i=1; i<n; i++)
        {
            System.out.format(f2+" ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
    public static void main(String[] args)
    {
        Fibonacci_numbers(10);
    }  
}
