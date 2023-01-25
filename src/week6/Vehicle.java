package week6;

public class Vehicle {
    boolean status;
    void start() {
        status = true;
    }
    void run() {
        System.out.println("Vehicle's run");
    }
    void stop() {
        status = false;
    }
}
