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

public class practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int de;
        double summer,nonsummer;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("輸入所使用的度數");
        de = scanner.nextInt();
        scanner.close();
        if(de<=120){
            summer = de*2.1;
            nonsummer = de*2.1;
        }else if(de>=121 && de<=330){
            summer = de*3.02;
            nonsummer = de*2.68;
        }else if(de>=331 && de<=500){
            summer = de*4.39;
            nonsummer = de*3.61;
        }else if(de>=501 && de<=700){
            summer = de*4.97;
            nonsummer = de*4.01;
        }else{
            summer = de*5.63;
            nonsummer = de*4.5;
        }
        System.out.println("Summer month:"+summer);
        System.out.println("Non-Summer month:"+nonsummer);
    }
    
}
