class CounterThread extends Thread {
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print("\t" + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {
        String threadName = "First";
        int lowerRange = 10;
        int upperRange = 15;

        CounterThread counterThread = new CounterThread(threadName, lowerRange, upperRange);
        counterThread.start();
    }
}