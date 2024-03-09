import java.util.Scanner;

// Base class
class Account {
    protected int accNo;
    protected double balance;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accNo = scanner.nextInt();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

// Derived class
class Person extends Account {
    private String name;
    private long aadharNo;

    void input() {
        Scanner scanner = new Scanner(System.in);
        super.input(); // Call the base class input() method
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadharNo = scanner.nextLong();
    }

    void disp() {
        super.disp(); // Call the base class disp() method
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadharNo);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDetails of the persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].disp();
        }
    }
}