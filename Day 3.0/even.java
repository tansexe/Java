import java.util.*;

public class even {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            if (in.hasNextInt()) {
                arr[i] = in.nextInt();
            }
        }
        int count = 0;
        for (int j = 0; j < 10; j++) {
            if (arr[j] % 2 == 0) {
                count++;
            } else {
                ;
            }
        }
        System.out.println("Even Numbers = " + count);
        int odd = 10 - count;
        System.out.println("Odd Numbers = " + odd);
        in.close();
    }
    
}
