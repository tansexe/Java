import java.util.*;

public class Day {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the Day No.: ");
        int Day = in.nextInt();

        if (Day <= 31 && Day >= 1) {
            int Number = Day % 7;
            switch (Number) {
                case 0:
                    System.out.println("Day is Sunday");
                    break;
                case 1:
                    System.out.println("Day is Monday");
                    break;
                case 2:
                    System.out.println("Day is Tuesday");
                    break;
                case 3:
                    System.out.println("Day is Wednesday");
                    break;
                case 4:
                    System.out.println("Day is Thursday");
                    break;
                case 5:
                    System.out.println("Day is Friday");
                    break;
                case 6:
                    System.out.println("Day is Saturday");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Input a Valid Number between 1 to 31");
        }

    }
}
