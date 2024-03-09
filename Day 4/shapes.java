import java.util.Scanner;

abstract class Shape {
    abstract double calculateCost();
}

class Sheet extends Shape {
    double length;
    double width;
    static final double COST_PER_SQ_FT = 40.0;

    Sheet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateCost() {
        return length * width * COST_PER_SQ_FT;
    }
}

class Box extends Sheet {
    double height;
    static final double COST_PER_CUBIC_FT = 60.0;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    double calculateCost() {
        return length * width * height * COST_PER_CUBIC_FT;
    }
}

public class shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length and width of the sheet:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Sheet sheet = new Sheet(length, width);
        System.out.println("The cost of the sheet is: " + sheet.calculateCost());

        System.out.println("Enter the length, width and height of the box:");
        length = scanner.nextDouble();
        width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("The cost of the box is: " + box.calculateCost());
    }
}