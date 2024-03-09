import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int c;
        int firstNumber = myObj.nextInt();
        System.out.println("First Number:" + firstNumber);
        System.out.print("Enter the second number: ");
        int secondNumber = myObj.nextInt();
        System.out.println("Second Number:" + secondNumber);
        System.out.print("Enter the operator(+-*/): ");
        char operator = myObj.next().charAt(0);
        switch (operator) {
            case '+':
                c = firstNumber + secondNumber;
                System.out.println("Result is " + c);
                break;
            case '-':
                c = firstNumber - secondNumber;
                System.out.println("Result is " + c);
                break;
            case '*':
                c = firstNumber * secondNumber;
                System.out.println("Result is " + c);
                break;
            case '/':
                c = firstNumber / secondNumber;
                System.out.println("Result is " + c);
                break;
        }
    }
}