
package powernum;

public class PowerNum 
{
    static int power(int n, int p)
    {
        if (p == 0)
            return 1;
        else
            return n*power(n,p-1);
    }
    public static void main(String[] args)
    {
        int n = 5;
        int p = 3;
        
        System.out.println(power(n,p));
    }
}
