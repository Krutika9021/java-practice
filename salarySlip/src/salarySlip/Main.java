package salarySlip;
import java.util.Scanner;

class Employee 
{
    String name;
    int id;
    String dob;
    String mailId;
    long mobileNo;

    public void getData() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("DOB: ");
        dob = scanner.nextLine();

        System.out.print("Mail ID: ");
        mailId = scanner.nextLine();

        System.out.print("Mobile Number: ");
        mobileNo = scanner.nextLong();
    }

    public void displayData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("DOB: " + dob);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

class Programmer extends Employee {
    double basicPay;

    public void calculateSalary() {
        basicPay = getBasicPay();
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double clubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - clubFund;

        System.out.println("\nPay Slip for Programmer:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + clubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    private double getBasicPay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Pay for Programmer: ");
        return scanner.nextDouble();
    }
}

class TeamLead extends Employee {
	double basicPay;

    public void calculateSalary() {
        basicPay = getBasicPay();
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double clubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - clubFund;

        System.out.println("\nPay Slip for Programmer:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + clubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    private double getBasicPay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Pay for TeamLead: ");
        return scanner.nextDouble();
    }
}

class AssistantProjectManager extends Employee {
	double basicPay;

    public void calculateSalary() {
        basicPay = getBasicPay();
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double clubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - clubFund;

        System.out.println("\nPay Slip for Assistant Project Manager:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + clubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    private double getBasicPay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Pay for Assistant Project Manager: ");
        return scanner.nextDouble();
    }
}

class ProjectManager extends Employee {
	double basicPay;

    public void calculateSalary() {
        basicPay = getBasicPay();
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double clubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - clubFund;

        System.out.println("\nPay Slip for Project Manager:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + clubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    private double getBasicPay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Pay for Project Manager: ");
        return scanner.nextDouble();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. Enter Programmer details");
            System.out.println("2. Enter Team Lead details");
            System.out.println("3. Enter Assistant Project Manager details");
            System.out.println("4. Enter Project Manager details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Programmer programmer = new Programmer();
                    programmer.getData();
                    programmer.calculateSalary();
                    break;
                case 2:
                    TeamLead teamLead = new TeamLead();
                    teamLead.getData();
                    // Call appropriate methods for TeamLead
                    break;
                case 3:
                    AssistantProjectManager assistantProjectManager = new AssistantProjectManager();
                    assistantProjectManager.getData();
                    // Call appropriate methods for AssistantProjectManager
                    break;
                case 4:
                    ProjectManager projectManager = new ProjectManager();
                    projectManager.getData();
                    // Call appropriate methods for ProjectManager
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }

            if (choice != 5) {
                System.out.print("Do you want to perform another operation? (1 for yes, 0 for no): ");
                choice = scanner.nextInt();
            }

        } while (choice == 1);

        scanner.close();
    }
}
