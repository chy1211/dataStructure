package midTerm;

import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        String S1 = "";
        String S2 = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入s1");
        S1 = scanner.nextLine();
        System.out.println("請輸入s2");
        S2 = scanner.nextLine();
        boolean containStr = S2.contains(S1);
        if(containStr){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
