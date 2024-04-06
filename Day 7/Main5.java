class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Main5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            } else {
                int sumOfSquares = 0;
                for (String arg : args) {
                    int num = Integer.parseInt(arg);
                    sumOfSquares += num * num;
                }
                System.out.println("Output: " + sumOfSquares);
            }
        } catch (CheckArgument e) {
            System.out.println("Output: " + e.getMessage());
        }
    }
}