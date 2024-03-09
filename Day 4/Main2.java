import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate dimensions:");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
    }
}

// Derived class from Plate
class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width); // Call the base class constructor
        this.height = height;
        System.out.println("\nBox dimensions:");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }
}

// Derived class from Box
class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height); // Call the base class constructor
        this.thickness = thickness;
        System.out.println("\nWood Box dimensions:");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Thickness: " + this.thickness);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the thickness: ");
        double thickness = scanner.nextDouble();

        WoodBox woodBox = new WoodBox(length, width, height, thickness);

        scanner.close();
    }
}