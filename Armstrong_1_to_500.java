package armstrong_1_to_500;

public class Armstrong_1_to_500 
{
    public static void main(String[] args)
    {
        int n, count = 0, a , b , c , sum = 0;
        System.out.print("Armstrong number from 1 to 500 : ");
        for(int i=1; i <= 500; i++)
        {
            n=i;
            while(n>0)
            {
                b = n%10;
                sum = sum + (b*b*b);
                n = n/10;
            }
            if(sum == i)
            {
                System.out.print(i + " ");
            }
            sum=0;
        }
    }
}