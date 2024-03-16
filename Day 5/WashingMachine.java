interface Motor {
    int capacity = 1000; // Interface data member

    void run(); // Abstract method

    void consume(); // Abstract method
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }

    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        System.out.println("Capacity of the motor: " + Motor.capacity + " watts");
        washingMachine.run();
        washingMachine.consume();
    }
}