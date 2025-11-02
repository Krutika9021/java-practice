package fileHandling;
import java.io.*;

class Student {
    String studentId;
    String name;
    int rollNo;
    String className;
    double marks;
    String address;

    public Student(String studentId, String name, int rollNo, String className, double marks, String address) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.marks = marks;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nName: " + name +
                "\nRoll No: " + rollNo +
                "\nClass: " + className +
                "\nMarks: " + marks +
                "\nAddress: " + address + "\n";
    }
}

public class StudentRecordsDatabase {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("student_records.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the number of students to add: ");
            int numStudents = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numStudents; i++) {
                System.out.println("\nEnter details for student " + (i + 1));
                System.out.print("Student ID: ");
                String studentId = reader.readLine();
                System.out.print("Name: ");
                String name = reader.readLine();
                System.out.print("Roll No: ");
                int rollNo = Integer.parseInt(reader.readLine());
                System.out.print("Class: ");
                String className = reader.readLine();
                System.out.print("Marks: ");
                double marks = Double.parseDouble(reader.readLine());
                System.out.print("Address: ");
                String address = reader.readLine();

                Student student = new Student(studentId, name, rollNo, className, marks, address);
                bufferedWriter.write(student.toString());
            }

            bufferedWriter.close();

            // Reading data from the file
            FileReader fileReader = new FileReader("student_records.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("\nStudent Records:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
