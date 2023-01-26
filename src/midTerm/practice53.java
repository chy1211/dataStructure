package midTerm;

import java.util.Scanner;

public class practice53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入路程公里數:");
        double km = Double.parseDouble(scanner.nextLine());
        int fee = 0;
        if(km<=1.5){
            fee = 75;
        }else{
            fee = 75 + (int)Math.ceil((km-1.5)/0.25)*5;
        }
        System.out.println("所需車資為:"+fee+"元");
        scanner.close();
    }
}
