package midTerm;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        String maxnum="",minnum="";
        String[] a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入由0~9的數字所組成的N個數字字串");
        a = scanner.nextLine().split(",");
        //convert string to int
        int[] b = new int[a.length];
        int[] max = new int[a.length];
        int[] min = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        for(int j=0;j<b.length;j++){
            for(int k=0;k<b.length-j-1;k++){
                if(b[k]>b[k+1]){
                    int temp = b[k];
                    b[k] = b[k+1];
                    b[k+1] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            //push element to min array
            min[i] = b[i];
            minnum+=b[i];
        }

        //reverse array
        for(int j=0;j<b.length;j++){
            for(int k=0;k<b.length-j-1;k++){
                if(b[k]<b[k+1]){
                    int temp = b[k];
                    b[k] = b[k+1];
                    b[k+1] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            //push element to max array
            max[i] = b[i];
            maxnum+=b[i];
        }

        System.out.println("最大值數列"+maxnum+"與最小值數列"+minnum+"的差為"+(Integer.parseInt(maxnum)-Integer.parseInt(minnum)));
    }
}
