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
public class practice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N=1,Temp=1,M;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("輸入階乘值M:");
        M = scanner.nextInt();
        while (true){
            N+=1;
            Temp=Temp*N;
            if(Temp<M){
                System.out.println(N);
            }else{
                break;
            }
        }
        System.out.println("超過M為"+M+"的最小階層N值為:"+N);
    }
    
}
