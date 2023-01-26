package midTerm;

import java.util.Scanner;

public class practice44 {
    public static void main(String[] args) {
        //declare four-dimensional array store student's number, name, and Department
        Scanner scanner = new Scanner(System.in);
        String M = "",D = "";
        System.out.println("月份=?");
        M = scanner.nextLine();
        System.out.println("日期=?");
        D = scanner.nextLine();
        int S = (Integer.parseInt(M)*2+Integer.parseInt(D))%3;
        if(S==0){
            System.out.println("普通");
        }else if(S==1){
            System.out.println("吉");
        }else if(S==2){
            System.out.println("大吉");
        }
        scanner.close();
    }
}
