package midTerm;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henry
 */
public class practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,dis;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入X軸座標");
        x = scanner.nextInt();
        System.out.println("請輸入Y軸座標");
        y = scanner.nextInt();
        dis = x*x + y*y;
        
        if (x>0 && y>0){
            System.out.println("座標("+x+","+y+")位於第一象限，離原點距離為根號"+dis);
        }else if(x<0 && y>0){
            System.out.println("座標("+x+","+y+")位於第二象限，離原點距離為根號"+dis);
        }else if(x<0 && y<0){
            System.out.println("座標("+x+","+y+")位於第三象限，離原點距離為根號"+dis);
        }else if(x==0 && y==0){
            System.out.println("座標("+x+","+y+")位於原點");
        }else if(x>0 && y==0){
            System.out.println("座標("+x+","+y+")位於右半平面X軸上，離原點距離為根號"+dis);
        }else if(y>0 && x==0){
            System.out.println("座標("+x+","+y+")位於上半平面X軸上，離原點距離為根號"+dis);
        }else if(x<0 && y==0){
            System.out.println("座標("+x+","+y+")位於左半平面X軸上，離原點距離為根號"+dis);
        }else if(y<0 && x==0){
            System.out.println("座標("+x+","+y+")位於下半平面X軸上，離原點距離為根號"+dis);
        }else{
            System.out.println("座標("+x+","+y+")位於第四象限，離原點距離為根號"+dis);
        }
        
    }
    
}
