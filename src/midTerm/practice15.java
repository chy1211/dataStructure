package midTerm;

import java.util.Scanner;

public class practice15 {
    public static void main(String[] args) {
        String s = "";
        int temp = 0;
        int[] a = {0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一組四位數字");
        s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            a[i] = ((s.charAt(i) - '0')+7)%10;
        }
        temp = a[0];
        a[0] = a[2];
        a[2] = temp;
        temp = a[1];
        a[1] = a[3];
        a[3] = temp;
        System.out.println("加密後的數字為:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        sc.close();
    }
}
