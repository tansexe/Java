import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate the area
    double calculateArea() {
        return length * breadth;
    }
}

public class MainR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object with default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of rectangle with default values: " + rectangle1.calculateArea());

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Creating an object with parameterized constructor
        Rectangle rectangle2 = new Rectangle(length, breadth);
        System.out.println("Area of rectangle with user-provided values: " + rectangle2.calculateArea());

        scanner.close();
    }
}