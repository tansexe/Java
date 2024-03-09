// Calculator.java
class Calculator {
    // Overloaded subtract methods
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling subtract method with two integers
        int result1 = calculator.subtract(10, 5);
        System.out.println("Result 1: " + result1); // Output: 5

        // Calling subtract method with two doubles
        double result2 = calculator.subtract(7.8, 3.2);
        System.out.println("Result 2: " + result2); // Output: 4.6

        // Calling subtract method with three integers
        int result3 = calculator.subtract(20, 8, 3);
        System.out.println("Result 3: " + result3); // Output: 9
    }
}
