import java.lang.ArithmeticException;
import java.util.*;

public class arithExcp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        // System.out.print("Enter a: ");
        // a = scanner.nextInt();
        // System.out.print("Enter b: ");
        // b = scanner.nextInt();
        try {
            // double c = divide(a, b);
            // System.out.println(c);
            String name = "Taniya";
            if (name.equals("Taniya")) {
                throw new MyException("Name is Taniya");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Throw just an exception");
        } finally {
            System.out.println("This will be finally executed.");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}