import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee name: ");
        empName = scanner.nextLine();
    }

    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter department name: ");
        deptName = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayDetails();
    }
}