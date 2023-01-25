package week5;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius);
        this.height = height;
        super.setColor(color);
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String toString(){
        return "Cylinder[radius=" + super.getRadius() + ",color=" + super.getColor() + "]";
    }
    public double getVolume(){
        return super.getArea() * height;
    }
}
