import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The largest number is " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The largest number is " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The largest number is " + thirdNumber);
        } else {
            ;
        }

    }
}