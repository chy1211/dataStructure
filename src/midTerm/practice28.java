package midTerm;

import java.util.Scanner;

public class practice28 {
    public static void main(String[] args) {
        //declare four-dimensional array store student's number, name, and Department
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        while (A<4){
            A=0;
            int B = 0;
            String[] correct = {"1","2","3","4"};
            String[] exit = {"0"};
            String[] input = new String[3];
            System.out.println("請輸入四位數字:");
            input[A] = scanner.nextLine();
            if(input[A].equals(exit[0])){
                System.out.println("結束程式");
                break;
            }else{
                for (int i = 0; i < input[A].length(); i++) {
                    if(input[A].charAt(i) == correct[i].charAt(0)){
                        B++;
                    }
                }
                A++;
                System.out.println("A:"+B);
                System.out.println("B:"+(4-B));
            }
        }
    }
}
