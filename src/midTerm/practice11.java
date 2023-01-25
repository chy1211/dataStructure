package midTerm;

import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        System.out.println("請輸入您的出生年月");
        Scanner sc = new Scanner(System.in);
        int monthday = sc.nextInt();
        int month = monthday/100;
        int day = monthday%100;
        String constellation = "";
        switch (month) {
            case 1:
                constellation = day<21?"摩羯座":"水瓶座";
                break;
            case 2:
                constellation = day<20? "水瓶座":"雙魚座";
                break;
            case 3:
                constellation = day<21?"雙魚座":"白羊座";
                break;
            case 4:
                constellation = day<21?"白羊座":"金牛座";
                break;
            case 5:
                constellation = day<22?"金牛座":"雙子座";
                break;
            case 6:
                constellation = day<22?"雙子座":"巨蟹座";
                break;
            case 7:
                constellation = day<23?"巨蟹座":"獅子座";
                break;
            case 8:
                constellation = day<24?"獅子座":"處女座";
                break;
            case 9:
                constellation = day<24?"處女座":"天秤座";
                break;
            case 10:
                constellation = day<24?"天秤座":"天蠍座";
                break;
            case 11:
                constellation = day<23?"天蠍座":"射手座";
                break;
            case 12:
                constellation = day<22?"射手座":"摩羯座";
                break;
        }
        System.out.println("您的星座是：" +constellation);
    }
}
