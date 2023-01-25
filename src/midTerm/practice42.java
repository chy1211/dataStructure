package midTerm;

import java.util.Scanner;

public class practice42 {
    public static void main(String[] args) {
        //declare four-dimensional array store student's number, name, and Department
        Scanner scanner = new Scanner(System.in);
        String a = "",n = "";
        System.out.println("a=?");
        a = scanner.nextLine();
        System.out.println("n=?");
        n = scanner.nextLine();
        int ans1 = Integer.parseInt(a)*Integer.parseInt(n);
        int ans2 = Integer.parseInt(n)-1;
        System.out.println(ans1+"x**"+ans2);
    }
}
