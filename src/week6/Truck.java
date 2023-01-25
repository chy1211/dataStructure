package week6;

public class Truck extends Vehicle{
    @Override
    void start() {
        System.out.println("Truck's start");
        super.start();
    }
    @Override
    void run() {
        System.out.println("Truck's run");
        super.run();
    }
    @Override
    void stop() {
        System.out.println("Truck's stop");
        super.stop();
    }
}
