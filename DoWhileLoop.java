package dowhileloop;
import java.util.Scanner;

    public class DoWhileLoop
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int sum = 0;
            char op;
            
            do
            {
                System.out.println("Enter two numbers ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                sum = sum + n1 + n2;
                System.out.println("Do you wish to perform another operation, Y/N");
                op = in.next().charAt(0);
            }
            while(op == 'Y' || op == 'y');
            System.out.println("Sum : " + sum);
        }
    }
    
