import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = in.nextInt();
        int ActualNumber = n;
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        int ReversedNumber = temp;
        if (ActualNumber == ReversedNumber) {
            System.out.println("It is a Palindrome Number.");
        } else {
            System.out.println("It is not a Palindrome Number.");
        }
    }
}
