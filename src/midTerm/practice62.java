package midTerm;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class practice62 {
    public static void main(String[] args) {
        //declare a dict to store the fruit and color
        Dictionary dict = new Hashtable<>();
        dict.put("蘋果", "紅色");
        dict.put("香蕉", "黃色");
        dict.put("葡萄", "紫色");
        dict.put("藍莓", "藍色");
        dict.put("橘子", "橘色");
        //input the fruit name then output the color
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入水果名稱:");
        String input = scanner.nextLine();
        System.out.println("水果顏色為:" + dict.get(input));
    }
}
