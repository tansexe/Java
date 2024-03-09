import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers in ascending order:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
