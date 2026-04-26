class A extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("A: " + i);
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i=100; i<=105; i++) {
            System.out.println("B: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t1.join(2000);   // wait 2 seconds only
        t2.start();
    }
}
