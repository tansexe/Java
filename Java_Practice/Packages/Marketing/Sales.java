package Packages.Marketing;

import Packages.General.Employee;
import java.util.Scanner;

public class Sales extends Employee {
    public Sales(int empId, String empName) {
        super(empId, empName);
    }

    public double tAllowance(double totalEarnings) {
        return 0.05 * totalEarnings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee id and employee name: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        String empName = scanner.nextLine();
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();          

        Sales salesPerson = new Sales(empId, empName);
        double totalEarnings = salesPerson.earnings(basicSalary);
        double travelAllowance = salesPerson.tAllowance(totalEarnings);
        double totalCompensation = totalEarnings + travelAllowance;

        System.out.println("The emp id of the employee is " + salesPerson.getEmpId());
        System.out.println("The total earning is " + totalCompensation);
    }
}