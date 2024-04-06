class Apple {

    void show() {
        System.out.println("This is an apple.");
    }
}

class Banana extends Apple {

    @Override
    void show() {
        System.out.println("This is a banana.");
    }
}

class Cherry extends Apple {

    @Override
    void show() {
        System.out.println("This is a cherry.");
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {

        Apple fruit;

        fruit = new Banana();
        fruit.show();

        fruit = new Cherry();
        fruit.show();
    }
}