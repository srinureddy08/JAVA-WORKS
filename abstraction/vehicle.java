abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.fuel();

        v2.start();
        v2.fuel();
    }
}
