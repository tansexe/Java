import java.util.Scanner;

interface EmployeeInterface {
    double earnings();

    double deductions();

    double bonus();
}

class Manager implements EmployeeInterface {
    protected double basicSalary;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        return basicSalary + (0.8 * basicSalary) + (0.15 * basicSalary);
    }

    public double deductions() {
        return 0.12 * basicSalary;
    }

    public double bonus() {
        return 0; // Not implemented in this class
    }
}

class Substaff extends Manager implements EmployeeInterface {
    public Substaff(double basicSalary) {
        super(basicSalary);
    }

    public double bonus() {
        return 0.5 * basicSalary;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff(basicSalary);

        double earnings = substaff.earnings();
        double deduction = substaff.deductions();
        double bonus = substaff.bonus();

        System.out.println("Earnings: " + earnings);
        System.out.println("Deduction: " + deduction);
        System.out.println("Bonus: " + bonus);
    }
}
