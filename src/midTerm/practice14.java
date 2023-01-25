package midTerm;

import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個字串");
        s = sc.nextLine();
        int stringLength = s.length();
        System.out.println("There are " + stringLength + " characters in the string.");
    }
}
