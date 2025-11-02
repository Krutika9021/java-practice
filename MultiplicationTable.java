package multiplicationtable;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int i, n = 5;
        for(i=1; i<11; i++)
        {
            System.out.println("%d * " + n + "%d  : " + n*i);
        }
    }
    
}
