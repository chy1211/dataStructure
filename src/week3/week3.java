/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author henry
 */
public class week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] midterm = new int[5][];
        int k = 5;
        for (int i = 0; i < midterm.length; i++) {
            midterm[i] = new int[k];
            k--;
        }
        // print out the array
        char c = 'Z';
        for (int i = 0; i < midterm.length; i++) {
            for (int j = 0; j < midterm[i].length; j++) {
                System.out.print(i + " " + j + " ");
                System.out.println(c);
                midterm[i][j] = c;
                c--;
            }
        }
    }
}
