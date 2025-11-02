package constructorOverloading;
import java.util.*;

public class Student 
{
    String name;
    int roll;
    int age;
    
    public Student(String name, int roll) 
    {
        this.name = name;
        this.roll = roll;
    }
    
    public Student(int age) 
    {
        this.age = age;
    }
}

class MainClass {
    public static void main(String args[]) 
    {
        Student s1 = new Student("krutika", 72);
        System.out.println("Name: " + s1.name + ", Roll: " + s1.roll);
        Student s2 = new Student(19);
        System.out.println("Age: " + s2.age);

    }
}

