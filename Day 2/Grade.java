import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your percentage:");
        int Percent = in.nextInt();
        if (Percent >= 91 && Percent <= 100) {
            System.out.println("Grade O");
        } else if (Percent >= 81 && Percent <= 90) {
            System.out.println("Grade E");
        } else if (Percent >= 71 && Percent <= 80) {
            System.out.println("Grade A");
        } else if (Percent >= 61 && Percent <= 70) {
            System.out.println("Grade B");
        } else if (Percent >= 51 && Percent <= 60) {
            System.out.println("Grade C");
        } else if (Percent >= 41 && Percent <= 50) {
            System.out.println("Grade D");
        } else if (Percent >= 0 && Percent <= 40) {
            System.out.println("Grade F");
        } else {
            System.out.println("Input a Valid Percentage from 0 to 100.");
        }
    }
}