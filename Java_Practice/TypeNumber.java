
class number {
    int x = 9;
    double y = x;
}

class shorten {
    double myDouble = 20.36;
    int myInt = (int) myDouble;
}

public class TypeNumber {
    public static void main(String[] args) {
        number MyNumber = new number();
        shorten MyShorten = new shorten();
        // MyNumber.x = 100;
        System.out.println("Integer: " + MyNumber.x);
        System.out.println("Double: " + MyNumber.y);
        System.out.println("Double: " + MyShorten.myDouble);
        System.out.println("Integer: " + MyShorten.myInt);
    }
}
