class ComputeTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int square = i * i;
            System.out.println("Compute: " + i + "^2 = " + square);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
class LogTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Log: Step " + i + " recorded");
            try {
                Thread.sleep(700);
            } catch (Exception e) {}
        }
    }
}
class DisplayTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Display: Showing frame " + i);
            try {
                Thread.sleep(600);
            } catch (Exception e) {}
        }
    }
}
public class act109 {
    public static void main(String[] args) {
        Thread compute = new Thread(new ComputeTask());
        Thread log = new Thread(new LogTask());
        Thread display = new Thread(new DisplayTask());
        compute.start();
        log.start();
        display.start();
    }
}
