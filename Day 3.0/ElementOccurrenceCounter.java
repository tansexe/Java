import java.util.Scanner;

public class ElementOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the list of numbers: ");
        String input = scanner.nextLine();

        String[] numbersAsString = input.split(" ");

        int[] occurrences = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
            occurrences[i] = -1;
        }

        for (int i = 0; i < numbersAsString.length; i++) {
            int count = 1;

            for (int j = i + 1; j < numbersAsString.length; j++) {
                if (numbersAsString[i].equals(numbersAsString[j])) {
                    count++;
                    occurrences[j] = 0;
                }
            }

            if (occurrences[i] != 0) {
                occurrences[i] = count;
            }
        }

        for (int i = 0; i < numbersAsString.length; i++) {
            if (occurrences[i] != 0) {
                System.out.println("Occurrence of " + numbersAsString[i] + "=" + occurrences[i]);
            }
        }

        scanner.close();
    }
}
