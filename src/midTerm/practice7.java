package midTerm;

import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        int fee = 0;
        int time = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("輸入月租費");
        fee = scanner.nextInt();
        System.out.println("輸入通話時間");
        time = scanner.nextInt();

        if(fee == 186){
            double fee1 = time*0.09;
            double discount = fee1/fee;
            if(discount>1){
                fee1 = fee1*0.8;
            }else{
                fee1 = fee1*0.9;
            }
            System.out.println("通話費為"+Math.round(fee1)+"元");
        }else if(fee == 386){
            double fee1 = time*0.08;
            double discount = fee1/fee;
            if(discount>1){
                fee1 = fee1*0.7;
            }else{
                fee1 = fee1*0.8;
            }
            System.out.println("通話費為"+Math.round(fee1)+"元");
        }else if(fee == 586){
            double fee1 = time*0.07;
            double discount = fee1/fee;
            if(discount>1){
                fee1 = fee1*0.6;
            }else{
                fee1 = fee1*0.7;
            }
            System.out.println("通話費為"+Math.round(fee1)+"元");
        }else if(fee == 986){
            double fee1 = time*0.06;
            double discount = fee1/fee;
            if(discount>1){
                fee1 = fee1*0.5;
            }else{
                fee1 = fee1*0.6;
            }
            System.out.println("通話費為"+Math.round(fee1)+"元");
        }else{
            System.out.println("錯誤!無此月租費方案");
        }
        scanner.close();
    }
}
