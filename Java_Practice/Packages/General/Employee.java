package Packages.General;

public class Employee {
    protected int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public double earnings(double basicSalary) {
        return basicSalary + (0.8 * basicSalary) + (0.15 * basicSalary);
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}
