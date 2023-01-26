package midTerm;

import java.util.Scanner;

public class practice17 {
    public static void main(String[] args) {
        String[] a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入五張牌:");
        a = scanner.nextLine().split(" ");
        //convert string to int
        for(int i=0;i<a.length;i++){
            switch(a[i]){
                case "A":
                    a[i] = "1";
                    break;
                case "J":
                    a[i] = "11";
                    break;
                case "Q":
                    a[i] = "12";
                    break;
                case "K":
                    a[i] = "13";
                    break;
            }
        }
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            total+=Integer.parseInt(a[i]);
        }
        System.out.println("總點數為:"+total);
        scanner.close();
    }
}
