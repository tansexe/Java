import java.util.Scanner;

class AreaCalculator {
    // Overloaded area methods
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    public double area(int side) {
        return side * side;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = areaCalculator.area(radius);
                System.out.println("Area of the circle: " + circleArea);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = areaCalculator.area(base, height);
                System.out.println("Area of the triangle: " + triangleArea);
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                double squareArea = areaCalculator.area(side);
                System.out.println("Area of the square: " + squareArea);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}