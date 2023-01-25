package midTerm;

import java.util.Scanner;

public class practice48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "";
        a = scanner.nextLine();
        String[] b = a.split(" ");
        //reverse array b
        for(int i=0;i<b.length/2;i++){
            String temp = b[i];
            b[i] = b[b.length-1-i];
            b[b.length-1-i] = temp;
        }
        //print array b
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
