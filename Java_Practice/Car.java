public class Car implements examplesBrake, examplesMotor {
    @Override
    public void Brake() {

        System.out.println("Car Brakes");
    };

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.Brake();
    }
}
