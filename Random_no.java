package random_no;
import java.util.Random;
import java.util.Scanner;

public class Random_no
{
    public static void main(String[] args) 
    {
        int ans, guess;
        final int MAX=100;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean correct = false;
        ans = random.nextInt(MAX) +1;
        while (!correct)
        {
            System.out.println("Guess the number between 1 to 100");
            guess = in.nextInt();
            if(guess > ans)
            {
                System.out.println("Too high, try again");
            }
            else if (guess < ans)
            {
                System.out.println("Too low, try again");
            }
            else
            {
                System.out.println("Yes, you guessed the number.");
                correct = true;
            }
        }
        System.exit(0);
    }
    
}
