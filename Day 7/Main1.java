import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " numbers:");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

    }
}