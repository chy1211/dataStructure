package week5;

public class Circle {
    private Point center;
    private double radius;
    private String color;
    public Circle(){
        center = new Point();
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        center = new Point();
        this.radius = radius;
        color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public Circle(int xCenter, int yCenter, double radius){
        center = new Point(xCenter, yCenter);
        this.radius = radius;        
    }
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Point getCenter(){
        return center;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x, y);
    }
    public String toString(){
        return "Circle[center=" + center + ",radius=" + radius + "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double distance(Circle another){
        return center.distance(another.center);
    }
}
