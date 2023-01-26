/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midTerm;

/**
 *
 * @author henry
 */
import java.util.Scanner;

public class practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] mlist = {
            "rat",
            "ox",
            "tiger",
            "rabbit",
            "dragon",
            "snake",
            "horse",
            "sheep",
            "monkey",
            "rooster",
            "dog",
            "pig"
        };
        int year;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入出生年");
        year = scanner.nextInt();
        scanner.close();
        System.out.println(mlist[year%12 - 4]);    
    }
    
}
