package week6;

public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car's start");
        super.start();
    }
    @Override
    void run() {
        System.out.println("Car's run");
        super.run();
    }
    @Override
    void stop() {
        System.out.println("Car's stop");
        super.stop();
    }
}
