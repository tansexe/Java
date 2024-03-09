import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter RollNo: ");
        int RollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Username: ");
        String Username = scanner.nextLine();
        System.out.println("Username: " + Username);
        System.out.println("RollNo.: " + RollNo);

    }
}
