import java.util.*;

public class Rectangle {

    double length;
    double breadth;

    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }

    public void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.read();
        rectangle.calculate();
        rectangle.display();

    }

}
