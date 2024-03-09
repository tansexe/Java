import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students.add(new Student(rollNo, name, cgpa));
        }

        System.out.println("\n\nStudent Details:");
        for (Student student : students) {
            System.out.println(student);
        }

        Student lowestCGPA = students.get(0);
        for (Student student : students) {
            if (student.getCgpa() < lowestCGPA.getCgpa()) {
                lowestCGPA = student;
            }
        }

        System.out.println("\nStudent with lowest CGPA:");
        System.out.println(lowestCGPA);
    }
}

class Student {
    private int rollNo;
    private String name;
    private double cgpa;

    public Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", CGPA: " + cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}
