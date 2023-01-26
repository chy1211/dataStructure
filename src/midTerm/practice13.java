package midTerm;

import java.util.Scanner;

public class practice13 {
    static boolean PalFunc(String s){
        int i = 0, j = s.length()-1;

        while(i<j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個字串");
        s = sc.nextLine();
        boolean isPal = PalFunc(s);
        if(isPal){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
