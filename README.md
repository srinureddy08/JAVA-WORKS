class act101 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 100; i <= 105; i++) {
                System.out.println(i);
            }
        });

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
}
}
