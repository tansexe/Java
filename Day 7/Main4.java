public class TimeException extends Exception {
    public TimeException(String message) {
        super(message);
    }
}

class HrsException extends TimeException {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends TimeException {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends TimeException {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void getTime() {
        try {
            System.out.print("Enter hours: ");
            hours = Integer.parseInt(System.console().readLine());
            if (hours < 0 || hours > 23) {
                throw new HrsException("hour is not greater than 24");
            }

            System.out.print("Enter minutes: ");
            minutes = Integer.parseInt(System.console().readLine());
            if (minutes < 0 || minutes > 59) {
                throw new MinException("minute is not greater than 60");
            }

            System.out.print("Enter seconds: ");
            seconds = Integer.parseInt(System.console().readLine());
            if (seconds < 0 || seconds > 59) {
                throw new SecException("second is not greater than 60");
            }

            System.out.printf("Correct Time-> %d:%02d:%02d%n", hours, minutes, seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers.");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Time t = new Time();
        t.getTime();
    }
}