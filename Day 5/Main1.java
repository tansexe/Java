import java.util.Scanner;

// Abstract class
abstract class Student {
    protected int rollNo;
    protected long regNo;

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Registration No: ");
        regNo = scanner.nextLong();
    }

    abstract void course(); // Abstract method
}

// Concrete subclass
class Kiitian extends Student {
    void course() {
        System.out.println("Course: B.Tech. (Computer Science & Engg)");
    }
}

// Driver class
public class Main1 {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();
        kiitian.getInput();
        System.out.println("Roll No: " + kiitian.rollNo);
        System.out.println("Registration No: " + kiitian.regNo);
        kiitian.course();
    }
}