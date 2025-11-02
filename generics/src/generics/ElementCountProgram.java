package generics;
import java.util.*;
import java.util.Scanner;

public class ElementCountProgram 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the size of the collection
        System.out.print("Enter the number of elements in the collection: ");
        int size = scanner.nextInt();

        // Create an ArrayList to store the elements
        ArrayList<Integer> elements = new ArrayList<>();

        // Get user input for the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) 
        {
            elements.add(scanner.nextInt());
        }

        // Count the number of elements with specific properties
        System.out.println("Count of even numbers: " + countElements(elements, "even"));
        System.out.println("Count of odd numbers: " + countElements(elements, "odd"));
        System.out.println("Count of prime numbers: " + countElements(elements, "prime"));
        System.out.println("Count of palindromes: " + countElements(elements, "palindrome"));

        scanner.close();
    }

    // Count the number of elements with specific properties
    private static int countElements(ArrayList<Integer> elements, String property)
    {
        int count = 0;

        switch (property.toLowerCase()) 
        {
            case "even":
                for (int element : elements) 
                {
                    if (element % 2 == 0) 
                    {
                        count++;
                    }
                }
                break;
            case "odd":
                for (int element : elements) 
                {
                    if (element % 2 != 0) 
                    {
                        count++;
                    }
                }
                break;
            case "prime":
                for (int element : elements)
                {
                    if (isPrime(element))
                    {
                        count++;
                    }
                }
                break;
            case "palindrome":
                for (int element : elements) 
                {
                    if (isPalindrome(element))
                    {
                        count++;
                    }
                }
                break;
            default:
                System.out.println("Invalid property.");
        }

        return count;
    }

    // Check if a number is prime
    private static boolean isPrime(int num)
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    // Check if a number is palindrome
    private static boolean isPalindrome(int num)
    {
        int original = num;
        int reversed = 0;

        while (num > 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}
