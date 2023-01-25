package week6;

public class Tester {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        System.out.println(c.status);
        c.run();
        System.out.println(c.status);
        c.stop();
        System.out.println(c.status);
        System.out.println("------------");
        Truck t = new Truck();
        t.start();
        System.out.println(t.status);
        t.run();
        System.out.println(t.status);
        t.stop();
        System.out.println(t.status);
        System.out.println("------------");
    }
    void testVehicle(Vehicle v) {
        v.start();
        v.run();
        v.stop();
    }
}
