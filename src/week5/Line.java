package week5;

public class Line {
    private Point begin;
    private Point end;
    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Point getBegin(){
        return begin;
    }
    public void setBegin(Point begin){
        this.begin = begin;
    }
    public Point getEnd(){
        return end;
    }
    public void setEnd(Point end){
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x, y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x, y);
    }
    public String toString(){
        return "Line[begin=" + begin + ",end=" + end + "]";
    }
    public double getLength(){
        return begin.distance(end);
    }
    public double getGradient(){
        return (end.getY() - begin.getY()) / (end.getX() - begin.getX());
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x - begin.getX(), 2) + Math.pow(y - begin.getY(), 2));
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow(point.getX() - begin.getX(), 2) + Math.pow(point.getY() - begin.getY(), 2));
    }
    public boolean intersects(Line line){
        return (line.getGradient() != getGradient());
    }
}
