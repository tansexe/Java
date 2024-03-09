import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        int rightDiagonalSum = 0;
        for (int i = 0, j = 2; i < 3; i++, j--) {
            rightDiagonalSum += matrix[i][j];
        }

        System.out.println("Left Diagonal Sum = " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum = " + rightDiagonalSum);

        scanner.close();
    }
}
