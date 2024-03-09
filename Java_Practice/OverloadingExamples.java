class Adder {
    static int add(int a) {
        return a;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExamples {
    public static void main(String[] args) {
        Adder S1 = new Adder();
        Adder S2 = new Adder();
        Adder S3 = new Adder();

        System.out.println(S1.add(1));
        System.out.println(S2.add(2, 3));
        System.out.println(S3.add(4, 5, 6));
    }
}
