import java.util.*;

public class Display {
    public static void main(String[] args) {
        // Inputs
        Scanner myObj = new Scanner(System.in);
        // Name
        System.out.print("Name:");
        String displayName = myObj.nextLine();
        // Roll No
        System.out.print("RollNo:");
        int displayRoll = myObj.nextInt();
        myObj.nextLine();
        // Section
        System.out.print("Section:");
        String displaySection = myObj.nextLine();
        // Branch
        System.out.print("Branch:");
        String displayBranch = myObj.nextLine();

        // Outputs
        System.out.println("Display Name:" + displayName);
        System.out.print("Display RollNo:" + displayRoll);
        System.out.println("Display Section:" + displaySection);
        System.out.println("Display Branch:" + displayBranch);
    }
}
