/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author henry
 */
public class Point {
    private int x;
    private int y;
    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public int[] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    public double distance(Point another){
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
